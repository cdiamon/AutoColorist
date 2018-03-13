package com.cdiamon.autocolorist.explistview

/**
 * Created by Dmitriy on 21.12.2016.
 */

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.ExpandableListView
import android.widget.TextView
import android.widget.Toast
import com.cdiamon.autocolorist.R
import java.util.*


class MyListAdapter(private val context: Context, vendorList: ArrayList<Vendor>) : BaseExpandableListAdapter(), ExpandableListView.OnChildClickListener {
    private val vendorList: ArrayList<Vendor> = ArrayList()
    private val vendorArrList: ArrayList<Vendor> = ArrayList()


    init {
        this.vendorList.addAll(vendorList)
        this.vendorArrList.addAll(vendorList)
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        val arrModelList = vendorList[groupPosition].modelList
        return arrModelList[childPosition]
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun getChildView(groupPosition: Int, childPosition: Int, isLastChild: Boolean,
                              view: View?, parent: ViewGroup): View {
        var childView = view

        val (codeModel, nameModel, siteModel) = getChild(groupPosition, childPosition) as CarListModel
        if (childView == null) {
            val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            childView = layoutInflater.inflate(R.layout.child_row, null)
        }

        val code = childView!!.findViewById<TextView>(R.id.codeModel)
        val name = childView.findViewById<TextView>(R.id.nameModel)
        val site = childView.findViewById<TextView>(R.id.siteModel)
        code.text = codeModel!!.trim { it <= ' ' }
        name.text = nameModel!!.trim { it <= ' ' }
        site.text = siteModel!!.trim { it <= ' ' }

        return childView
    }

    override fun getChildrenCount(groupPosition: Int): Int {

        val modelList = vendorList[groupPosition].modelList
        return modelList.size

    }

    override fun getGroup(groupPosition: Int): Any {
        return vendorList[groupPosition]
    }

    override fun getGroupCount(): Int {
        return vendorList.size
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getGroupView(groupPosition: Int, isLastChild: Boolean, view: View?,
                              parent: ViewGroup): View {
        var groupView = view

        val (nameVendor) = getGroup(groupPosition) as Vendor
        if (groupView == null) {
            val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            groupView = layoutInflater.inflate(R.layout.group_row, null)
        }

        val heading = groupView!!.findViewById<TextView>(R.id.heading)
        heading.text = nameVendor!!.trim { it <= ' ' }

        return groupView
    }

    override fun hasStableIds(): Boolean {
        return true
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }

    fun filterData(query: String) {
        var filterQuery = query

        filterQuery = filterQuery.toLowerCase()
        Log.i("MyListAdapter", vendorList.size.toString())
        vendorList.clear()

        if (filterQuery.isEmpty()) {
            vendorList.addAll(vendorArrList)
        } else {

            for ((nameVendor, modelList) in vendorArrList) {

                val newList = ArrayList<CarListModel>()
                for (carListModel in modelList) {
                    if (carListModel.codeModel!!.toLowerCase().contains(filterQuery) || carListModel.nameModel!!.toLowerCase().contains(filterQuery)) {
                        newList.add(carListModel)
                    }
                }
                if (newList.size > 0) {
                    val nVendor = Vendor(nameVendor, newList)
                    vendorList.add(nVendor)
                }
            }
        }

        Log.i("MyListAdapter", vendorList.size.toString())
        notifyDataSetChanged()

    }

    override fun onChildClick(expandableListView: ExpandableListView, view: View, groupPosition: Int, childPosition: Int, id: Long): Boolean {

        Toast.makeText(this@MyListAdapter.context, R.string.galleryToastConnecting, Toast.LENGTH_SHORT).show()
        println(" ----- $groupPosition======= $childPosition")

        val intentChild = Intent(Intent.ACTION_VIEW, Uri.parse(vendorList[groupPosition].modelList[childPosition].siteModel))
        context.startActivity(intentChild)
        return true
    }
}
package com.cdiamon.autocolorist.explistview;

/**
 * Created by Dmitriy on 21.12.2016.
 */

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;

import com.cdiamon.autocolorist.R;

import java.util.ArrayList;


public class MyListAdapter extends BaseExpandableListAdapter implements ExpandableListView.OnChildClickListener {

    private Context context;
    private ArrayList<Vendor> vendorList;
    private ArrayList<Vendor> vendorArrList;


    public MyListAdapter(Context context, ArrayList<Vendor> vendorList) {
        this.context = context;
        this.vendorList = new ArrayList<>();
        this.vendorList.addAll(vendorList);
        this.vendorArrList = new ArrayList<>();
        this.vendorArrList.addAll(vendorList);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        ArrayList<CarListModel> arrModelList = vendorList.get(groupPosition).getModelList();
        return arrModelList.get(childPosition);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild,
                             View view, ViewGroup parent) {

        CarListModel carListModel = (CarListModel) getChild(groupPosition, childPosition);
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.child_row, null);
        }

        TextView code = (TextView) view.findViewById(R.id.codeModel);
        TextView name = (TextView) view.findViewById(R.id.nameModel);
        TextView site = (TextView) view.findViewById(R.id.siteModel);
        code.setText(carListModel.getCodeModel().trim());
        name.setText(carListModel.getNameModel().trim());
        site.setText(carListModel.getSiteModel().trim());

        return view;
    }

    @Override
    public int getChildrenCount(int groupPosition) {

        ArrayList<CarListModel> modelList = vendorList.get(groupPosition).getModelList();
        return modelList.size();

    }

    @Override
    public Object getGroup(int groupPosition) {
        return vendorList.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return vendorList.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isLastChild, View view,
                             ViewGroup parent) {

        Vendor vendor = (Vendor) getGroup(groupPosition);
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.group_row, null);
        }

        TextView heading = (TextView) view.findViewById(R.id.heading);
        heading.setText(vendor.getNameVendor().trim());

        return view;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

    public void filterData(String query) {

        query = query.toLowerCase();
        Log.i("MyListAdapter", String.valueOf(vendorList.size()));
        vendorList.clear();

        if (query.isEmpty()) {
            vendorList.addAll(vendorArrList);
        } else {

            for (Vendor vendor : vendorArrList) {

                ArrayList<CarListModel> modelList = vendor.getModelList();
                ArrayList<CarListModel> newList = new ArrayList<>();
                for (CarListModel carListModel : modelList) {
                    if (carListModel.getCodeModel().toLowerCase().contains(query) ||
                            carListModel.getNameModel().toLowerCase().contains(query)) {
                        newList.add(carListModel);
                    }
                }
                if (newList.size() > 0) {
                    Vendor nVendor = new Vendor(vendor.getNameVendor(), newList);
                    vendorList.add(nVendor);
                }
            }
        }

        Log.i("MyListAdapter", String.valueOf(vendorList.size()));
        notifyDataSetChanged();

    }

//   TODO myListAdapterClass(MyListAdapter).vendorList.0(kia).modelList.0(siteModel=url!!)
//
//   TODO vendorArrList.0(Vendor)(kia).modelList(ArrayList).0(CarListModel)(siteModel=url!!)
//
//   TODO mAdapter(MyListAdapter).context(ActivitySearchGallery).vendorArrayAddingList(ArrayList).0{CarListModel}(nameVendor=kia).modelList.0(siteModel=url!!)
//
//   TODO mAdapter.getChild(groupPosition, childPosition).getPopulation();

    @Override
    public boolean onChildClick(ExpandableListView expandableListView, View view, int groupPosition, int childPosition, long id) {

        Toast.makeText(MyListAdapter.this.context, R.string.galleryToastConnecting, Toast.LENGTH_SHORT).show();
        System.out.println(" ----- " + groupPosition + "======= " + childPosition);

        Intent intentChild;
        intentChild = new Intent(Intent.ACTION_VIEW, Uri.parse(vendorList.get(groupPosition).getModelList().get(childPosition).getSiteModel()));
        context.startActivity(intentChild);
        return true;
    }
}
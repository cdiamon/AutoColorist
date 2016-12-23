package com.cdiamon.autocolorist.explistview;

/**
 * Created by Dmitriy on 21.12.2016.
 */

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;

import com.cdiamon.autocolorist.R;
import com.cdiamon.autocolorist.fragments.GalleryFragment;

import java.util.ArrayList;



public class MyListAdapter extends BaseExpandableListAdapter implements ExpandableListView.OnChildClickListener {

    public Context context;
    private ArrayList<Vendor> vendorList;
    private ArrayList<Vendor> originalList;


    public MyListAdapter(Context context, ArrayList<Vendor> vendorList) {
        this.context = context;
        this.vendorList = new ArrayList<Vendor>();
        this.vendorList.addAll(vendorList);
        this.originalList = new ArrayList<Vendor>();
        this.originalList.addAll(vendorList);
    }

    public MyListAdapter(GalleryFragment galleryFragment, ArrayList<Vendor> vendorList) {

    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        ArrayList<Model> arrModelList = vendorList.get(groupPosition).getModelList();
        return arrModelList.get(childPosition);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {

        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild,
                             View view, ViewGroup parent) {

        Model model = (Model) getChild(groupPosition, childPosition);
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.child_row, null);
        }

        TextView code = (TextView) view.findViewById(R.id.codeModel);
        TextView name = (TextView) view.findViewById(R.id.nameModel);
        TextView site = (TextView) view.findViewById(R.id.siteModel);
        code.setText(model.getCodeModel().trim());
        name.setText(model.getNameModel().trim());
        site.setText(model.getSiteModel().trim());
//        site.setText(NumberFormat.getNumberInstance(Locale.US).format(model.getSiteModel()));


        return view;
    }

    @Override
    public int getChildrenCount(int groupPosition) {

        ArrayList<Model> modelList = vendorList.get(groupPosition).getModelList();
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
//        Toast.makeText(MyListAdapter.this.context, "Переходим в калькулятор", Toast.LENGTH_SHORT).show();
        return true;
    }

    public void filterData(String query){

        query = query.toLowerCase();
        Log.v("MyListAdapter", String.valueOf(vendorList.size()));
        vendorList.clear();

        if(query.isEmpty()){
            vendorList.addAll(originalList);
        }
        else {

            for(Vendor vendor : originalList){

                ArrayList<Model> modelList = vendor.getModelList();
                ArrayList<Model> newList = new ArrayList<Model>();
                for(Model model : modelList){
                    if(model.getCodeModel().toLowerCase().contains(query) ||
                            model.getNameModel().toLowerCase().contains(query)){
                        newList.add(model);
                    }
                }
                if(newList.size() > 0){
                    Vendor nVendor = new Vendor(vendor.getNameVendor(),newList);
                    vendorList.add(nVendor);
                }
            }
        }

        Log.v("MyListAdapter", String.valueOf(vendorList.size()));
        notifyDataSetChanged();

    }

//    ExpandableListView view = (ExpandableListView)getChild(getGroup(vendorList));
//@Override
//    void ChildClick(object o, ExpandableListView.ChildClickEventArgs e){}



    @Override
    public boolean onChildClick(ExpandableListView expandableListView, View view, int groupPosition, int childPosition, long id) {
//        Toast.makeText(MyListAdapter.this.context, "TEST", Toast.LENGTH_SHORT).show();

//        String s = MyListAdapter.this.getGroup(GroupPosition).ToString();

//        for(Vendor vendor : originalList){
        Vendor vendor = new Vendor();
            ArrayList<Model> modelList = vendor.getModelList();
//            ArrayList<Model> newList = new ArrayList<Model>();
            for(Model model : modelList){
                if(model.getSiteModel().toLowerCase().contains("http")){
                    Toast.makeText(MyListAdapter.this.context, (ExpandableListAdapter.class.getTypeParameters().toString()), Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(MyListAdapter.this.context, ("NO HTTP"), Toast.LENGTH_SHORT).show();
            }
//            if(newList.size() > 0){
//                Vendor nVendor = new Vendor(vendor.getNameVendor(),newList);
//                vendorList.add(nVendor);
//            }
//            Model model1 = new Model();
            Toast.makeText(MyListAdapter.this.context, (String)MyListAdapter.this.getChild(groupPosition, childPosition).toString(), Toast.LENGTH_SHORT).show();
//
//        (getChildId(childPosition,childPosition))
//        }
        Model model = new Model();
        System.out.println(model.getSiteModel);
//            Model model1 = new Model();
//            Toast.makeText(MyListAdapter.this.context, (model1.getSiteModel()), Toast.LENGTH_SHORT).show();
//        }

//        Toast.makeText(MyListAdapter.this.context, String.valueOf(model.getSiteModel()), Toast.LENGTH_SHORT).show();
//        Intent intentChild;
//        intentChild = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ya.ru"));
//        context.startActivity(intentChild);
        return true;
    }
}
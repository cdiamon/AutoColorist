package com.cdiamon.autocolorist.explistview;

/**
 * Created by Dmitriy on 21.12.2016.
 */

import java.util.ArrayList;

class Vendor {

    private String nameVendor;
    private ArrayList<CarListModel> modelList = new ArrayList<>();

    public Vendor(String name, ArrayList<CarListModel> modelList) {
        super();
        this.nameVendor = name;
        this.modelList = modelList;
    }

    public String getNameVendor() {
        return nameVendor;
    }

    public void setNameVendor(String nameVendor) {
        this.nameVendor = nameVendor;
    }

    public ArrayList<CarListModel> getModelList() {
        return modelList;
    }

    public void setModelList(ArrayList<CarListModel> modelList) {
        this.modelList = modelList;
    }

}
package com.cdiamon.autocolorist.explistview;

/**
 * Created by Dmitriy on 21.12.2016.
 */

import java.util.ArrayList;

public class Vendor {

    private String nameVendor;
    public ArrayList<Model> modelList = new ArrayList<Model>();

    public Vendor(String name, ArrayList<Model> modelList) {
        super();
        this.nameVendor = name;
        this.modelList = modelList;
    }

    public Vendor() {
        //////////////////////
    }

    public String getNameVendor() {
        return nameVendor;
    }

    public void setNameVendor(String nameVendor) {
        this.nameVendor = nameVendor;
    }

    public ArrayList<Model> getModelList() {
        return modelList;
    }

    public void setModelList(ArrayList<Model> modelList) {
        this.modelList = modelList;
    }

    ;


}
package com.cdiamon.autocolorist.explistview;

/**
 * Created by Dmitriy on 21.12.2016.
 */

class CarListModel {

    private String codeModel = "";
    private String nameModel = "";
    private String siteModel = "";

    public CarListModel(String code, String name, String site) {
        super();
        this.codeModel = code;
        this.nameModel = name;
        this.siteModel = site;
    }

    public CarListModel() {
        /////////////////
    }

    public String getCodeModel() {
        return codeModel;
    }

    public void setCodeModel(String codeModel) {
        this.codeModel = codeModel;
    }

    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public String getSiteModel() {
        return siteModel;
    }

    public void setSiteModel(String siteModel) {
        this.siteModel = siteModel;
    }

}
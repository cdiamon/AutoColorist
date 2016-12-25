package com.cdiamon.autocolorist.explistview;

import java.util.ArrayList;

/**
 * Created by Dmitriy on 25.12.2016.
 */

public class LoadData {

    public ArrayList<Vendor> vendorArrayAddingList = new ArrayList<Vendor>();
    public ArrayList<Model> modelArrayAddingList = new ArrayList<Model>();
    Model model = new Model();
    Vendor vendor = new Vendor();

    public void loadSomeData() {

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("A1,S1  (8X)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2899#p19495");
        modelArrayAddingList.add(model);
        model = new Model("A3,S3  (8V)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2883#p19327");
        modelArrayAddingList.add(model);
        model = new Model("A4,S4,RS4  (B7/8E/8H)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=3218#p22713");
        modelArrayAddingList.add(model);
        model = new Model("A4,S4,RS4  (B8/8K)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=3239#p23084");
        modelArrayAddingList.add(model);
        model = new Model("A4,S4,RS4  (B9/9L)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=3000#p20418");
        modelArrayAddingList.add(model);
        model = new Model("A5,S5,RS5  (8T)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2912#p19619");
        modelArrayAddingList.add(model);
        model = new Model("A6,S6,RS6  (C7)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2882#p19302");
        modelArrayAddingList.add(model);
        model = new Model("A7,S7,RS7  (4G)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2861#p19088");
        modelArrayAddingList.add(model);
        model = new Model("TT  (8N)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=78#p1050");
        modelArrayAddingList.add(model);
        model = new Model("TT 2  (8J)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2859#p19053");
        modelArrayAddingList.add(model);
        model = new Model("TT 3  (8S)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2858#p19040");
        modelArrayAddingList.add(model);
        model = new Model("Q2", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=3258#p23402");
        modelArrayAddingList.add(model);
        model = new Model("Q3, RS Q3  (8U)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2855#p19000");
        modelArrayAddingList.add(model);
        model = new Model("Q5,SQ5  (8R)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2846#p18928");
        modelArrayAddingList.add(model);
        model = new Model("Q7  (4L)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2845#p18927");
        modelArrayAddingList.add(model);
        model = new Model("Q7 2  (4M)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2844#p18916");
        modelArrayAddingList.add(model);

        vendor = new Vendor("Audi", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("1 Series  (E81/E87/E82/E88)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=3210#p22556");
        modelArrayAddingList.add(model);
        model = new Model("1 Series  (F20/F21)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=3209#p22542");
        modelArrayAddingList.add(model);
        model = new Model("3 Series  (F30/F31/F34/F80)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=1237#p5568");
        modelArrayAddingList.add(model);
        model = new Model("5 Series  (E60/E61)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=3231&p=22932#p22932");
        modelArrayAddingList.add(model);
        model = new Model("5 Series  (F10/F11/F07)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=1262#p5649");
        modelArrayAddingList.add(model);
        model = new Model("7 Series  (F01/F02/F03/F04)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=3230#p22895");
        modelArrayAddingList.add(model);
        model = new Model("X1  (E84)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=197#p2381");
        modelArrayAddingList.add(model);
        model = new Model("X1  (F48)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=2980#p20234");
        modelArrayAddingList.add(model);
        model = new Model("X3  (E83)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=205#p2569");
        modelArrayAddingList.add(model);
        model = new Model("X3  (F25)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=206#p2587");
        modelArrayAddingList.add(model);
        model = new Model("X4  (F26)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=1331#p6022");
        modelArrayAddingList.add(model);
        model = new Model("X5  (E53)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=76#p1000");
        modelArrayAddingList.add(model);
        model = new Model("X5  (E70)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=62#p808");
        modelArrayAddingList.add(model);
        model = new Model("X5  (F15)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=65#p839");
        modelArrayAddingList.add(model);
        model = new Model("X6  (E71/E72)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=77#p1025");
        modelArrayAddingList.add(model);
        model = new Model("X6  (F16)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=1365#p6136");
        modelArrayAddingList.add(model);

        vendor = new Vendor("BMW", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("Encore", "Buick", "http://rustamcolor.ru/viewtopic.php?f=13&t=3234#p23033");
        modelArrayAddingList.add(model);

        vendor = new Vendor("Buick", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("Escalade 3  (GMT900)", "Cadillac", "http://rustamcolor.ru/viewtopic.php?f=13&t=3191#p22270");
        modelArrayAddingList.add(model);
        model = new Model("Escalade 4  4 (GMTK2XL)", "Cadillac", "http://rustamcolor.ru/viewtopic.php?f=13&t=3188#p22222");
        modelArrayAddingList.add(model);

        vendor = new Vendor("Cadillac", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("C3 II", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=2865#p19148");
        modelArrayAddingList.add(model);
        model = new Model("C3 Picasso", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=2877#p19241");
        modelArrayAddingList.add(model);
        model = new Model("C4 II", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=108#p1586");
        modelArrayAddingList.add(model);
        model = new Model("C4 Picasso", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=3089&p=21067#p21067");
        modelArrayAddingList.add(model);
        model = new Model("C4 Picasso II", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=3092&p=21100#p21100");
        modelArrayAddingList.add(model);
        model = new Model("C4 AIRCROSS", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=2914#p19680");
        modelArrayAddingList.add(model);
        model = new Model("C4 CACTUS", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=3098&p=21178#p21178");
        modelArrayAddingList.add(model);
        model = new Model("DS3", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=3096#p21145");
        modelArrayAddingList.add(model);
        model = new Model("DS4", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=3093&p=21117#p21117");
        modelArrayAddingList.add(model);
        model = new Model("DS5", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=3094#p21128");
        modelArrayAddingList.add(model);
        model = new Model("C5  (X7)", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=2925#p19826");
        modelArrayAddingList.add(model);
        model = new Model("C-Elysee", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=2231#p10935");
        modelArrayAddingList.add(model);
        model = new Model("C-Crosser", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=2916#p19700");
        modelArrayAddingList.add(model);
        model = new Model("Berlingo II  (B9)", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=2921#p19762");
        modelArrayAddingList.add(model);

        vendor = new Vendor("Citroen", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("Very A13", "Chery", "http://rustamcolor.ru/viewtopic.php?f=13&t=84#p1160");
        modelArrayAddingList.add(model);

        vendor = new Vendor("Chery", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("A1  (8X)", "Audi", "url");
        modelArrayAddingList.add(model);
        model = new Model("", "", "");
        modelArrayAddingList.add(model);
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("vendor", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("A1  (8X)", "Audi", "url");
        modelArrayAddingList.add(model);
        model = new Model("", "", "");
        modelArrayAddingList.add(model);
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("vendor", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("A1  (8X)", "Audi", "url");
        modelArrayAddingList.add(model);
        model = new Model("", "", "");
        modelArrayAddingList.add(model);
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("vendor", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("A1  (8X)", "Audi", "url");
        modelArrayAddingList.add(model);
        model = new Model("", "", "");
        modelArrayAddingList.add(model);
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("vendor", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("A1  (8X)", "Audi", "url");
        modelArrayAddingList.add(model);
        model = new Model("", "", "");
        modelArrayAddingList.add(model);
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("vendor", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("A1  (8X)", "Audi", "url");
        modelArrayAddingList.add(model);
        model = new Model("", "", "");
        modelArrayAddingList.add(model);
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("vendor", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("A1  (8X)", "Audi", "url");
        modelArrayAddingList.add(model);
        model = new Model("", "", "");
        modelArrayAddingList.add(model);
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("vendor", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("A1  (8X)", "Audi", "url");
        modelArrayAddingList.add(model);
        model = new Model("", "", "");
        modelArrayAddingList.add(model);
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("vendor", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("A1  (8X)", "Audi", "url");
        modelArrayAddingList.add(model);
        model = new Model("", "", "");
        modelArrayAddingList.add(model);
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("vendor", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("A1  (8X)", "Audi", "url");
        modelArrayAddingList.add(model);
        model = new Model("", "", "");
        modelArrayAddingList.add(model);
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("vendor", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("A1  (8X)", "Audi", "url");
        modelArrayAddingList.add(model);
        model = new Model("", "", "");
        modelArrayAddingList.add(model);
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("vendor", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("Ceed  (ED/ED FL)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=2226#p10880");
        modelArrayAddingList.add(model);
        model = new Model("Ceed 2  (JD)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=97#p1392");
        modelArrayAddingList.add(model);
        model = new Model("Cerato 2  (TD)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=91#p1259");
        modelArrayAddingList.add(model);
        vendor = new Vendor("Kia", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("BT-50  (J97M)", "Mazda", "http://rustamcolor.ru/viewtopic.php?f=13&t=2158#p10455");
        modelArrayAddingList.add(model);
        model = new Model("2  (DE)", "Mazda", "http://rustamcolor.ru/viewtopic.php?f=13&t=131#p1916");
        modelArrayAddingList.add(model);
        model = new Model("3  (BK)", "Mazda", "http://rustamcolor.ru/viewtopic.php?f=13&t=3102#p21217");
        modelArrayAddingList.add(model);
        model = new Model("3  (BL)", "Mazda", "http://rustamcolor.ru/viewtopic.php?f=13&t=1350#p6092");
        modelArrayAddingList.add(model);
        vendor = new Vendor("Mazda", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("Avensis 2  (T250)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=3138#p21646");
        modelArrayAddingList.add(model);
        model = new Model("Avensis 3  (T27)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=204#p2557");
        modelArrayAddingList.add(model);
        model = new Model("Auris (E150)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=1743#p7818");
        modelArrayAddingList.add(model);
        vendor = new Vendor("Toyota", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

    }

}

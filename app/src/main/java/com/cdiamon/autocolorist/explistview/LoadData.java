package com.cdiamon.autocolorist.explistview;

import java.util.ArrayList;

/**
 * Created by Dmitriy on 25.12.2016.
 */

class LoadData {

    final ArrayList<Vendor> vendorArrayAddingList = new ArrayList<>();

    void loadSomeData() {

        ArrayList<CarListModel> modelArrayAddingList = new ArrayList<>();
        CarListModel carListModel = new CarListModel("A1,S1  (8X)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2899#p19495");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("A3,S3  (8V)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2883#p19327");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("A4,S4,RS4  (B7/8E/8H)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=3218#p22713");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("A4,S4,RS4  (B8/8K)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=3239#p23084");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("A4,S4,RS4  (B9/9L)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=3000#p20418");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("A5,S5,RS5  (8T)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2912#p19619");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("A6,S6,RS6  (C7)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2882#p19302");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("A7,S7,RS7  (4G)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2861#p19088");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("TT  (8N)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=78#p1050");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("TT II  (8J)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2859#p19053");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("TT III  (8S)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2858#p19040");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Q2", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=3258#p23402");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Q3, RS Q3  (8U)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2855#p19000");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Q5,SQ5  (8R)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2846#p18928");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Q7  (4L)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2845#p18927");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Q7 II  (4M)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2844#p18916");
        modelArrayAddingList.add(carListModel);

        Vendor vendor = new Vendor("Audi", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("1 Series  (E81/E87/E82/E88)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=3210#p22556");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("1 Series  (F20/F21)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=3209#p22542");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("3 Series  (F30/F31/F34/F80)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=1237#p5568");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("5 Series  (E60/E61)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=3231&p=22932#p22932");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("5 Series  (F10/F11/F07)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=1262#p5649");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("7 Series  (F01/F02/F03/F04)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=3230#p22895");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("X1  (E84)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=197#p2381");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("X1  (F48)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=2980#p20234");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("X3  (E83)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=205#p2569");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("X3  (F25)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=206#p2587");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("X4  (F26)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=1331#p6022");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("X5  (E53)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=76#p1000");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("X5  (E70)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=62#p808");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("X5  (F15)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=65#p839");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("X6  (E71/E72)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=77#p1025");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("X6  (F16)", "BMW", "http://rustamcolor.ru/viewtopic.php?f=13&t=1365#p6136");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("BMW", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Encore", "Buick", "http://rustamcolor.ru/viewtopic.php?f=13&t=3234#p23033");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Buick", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Escalade III  (GMT900)", "Cadillac 3", "http://rustamcolor.ru/viewtopic.php?f=13&t=3191#p22270");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Escalade IV  (GMTK2XL)", "Cadillac 4", "http://rustamcolor.ru/viewtopic.php?f=13&t=3188#p22222");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Cadillac", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Berlingo II  (B9)", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=2921#p19762");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("C3 II", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=2865#p19148");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("C3 Picasso", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=2877#p19241");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("C4 II", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=108#p1586");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("C4 Picasso", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=3089&p=21067#p21067");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("C4 Picasso II", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=3092&p=21100#p21100");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("C4 AIRCROSS", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=2914#p19680");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("C4 CACTUS", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=3098&p=21178#p21178");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("C5  (X7)", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=2925#p19826");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("C-Crosser", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=2916#p19700");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("C-Elysee", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=2231#p10935");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("DS3", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=3096#p21145");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("DS4", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=3093&p=21117#p21117");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("DS5", "Citroen", "http://rustamcolor.ru/viewtopic.php?f=13&t=3094#p21128");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Citroen", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Very A13", "Chery", "http://rustamcolor.ru/viewtopic.php?f=13&t=84#p1160");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Chery", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();

        carListModel = new CarListModel("AVEO (T200/T250)", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=86#p1182");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("AVEO II (T300)", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=40#p550");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Captiva", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=1428#p6354");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Cobalt", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=8#p46");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("CRUZE (1G/J300)", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=37#p495");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Epica", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=177#p2040");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Lacetti", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=11#p92");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Malibu", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=219#p3181");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Niva", "Chevrolet Lada", "http://rustamcolor.ru/viewtopic.php?f=13&t=13#p125");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Orlando", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=116#p1686");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Rezzo", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=3148#p21726");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Spark II  (M200/M250)", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=2286#p11275");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Spark III  (M300)", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=2283#p11262");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Tracker", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=3181&p=22057#p22057");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Trailblazer", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=88#p1221");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Chevrolet", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("300C  (8X)", "Chrysler", "http://rustamcolor.ru/viewtopic.php?f=13&t=3246#p23268");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("300C II", "Chrysler", "http://rustamcolor.ru/viewtopic.php?f=13&t=3244&p=23189#p23189");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Chrysler", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("on-DO", "Datsun", "http://rustamcolor.ru/viewtopic.php?f=13&t=22#p297");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("mi-DO", "Datsun", "http://rustamcolor.ru/viewtopic.php?f=13&t=1289#p5833");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Datsun", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Gentra", "Daewoo", "http://rustamcolor.ru/viewtopic.php?f=13&t=15#p168");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Nexia  (N150)", "Daewoo нексия", "http://rustamcolor.ru/viewtopic.php?f=13&t=1543#p6849");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Matiz  (M150)", "Daewoo матиз", "http://rustamcolor.ru/viewtopic.php?f=13&t=16#p180");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Daewoo", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Caliber", "Dodge", "http://rustamcolor.ru/viewtopic.php?f=13&t=3196#p22353");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Dodge", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Albea", "Fiat", "http://rustamcolor.ru/viewtopic.php?f=13&t=21#p286");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Doblo", "Fiat", "http://rustamcolor.ru/viewtopic.php?f=13&t=3217#p22678");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Linea (323)", "Fiat", "http://rustamcolor.ru/viewtopic.php?f=13&t=3189#p22235");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Tipo (Typ 356)", "Fiat", "http://rustamcolor.ru/viewtopic.php?f=13&t=3201#p22439");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Fiat", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();

        carListModel = new CarListModel("C-Max", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=201#p2508");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Ecosport", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=127#p1846");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Edge", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=1458#p6459");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Explorer V  (U502)", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=3121#p21474");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Fiesta V", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=125#p1807");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Fiesta VI", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=124#p1790");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Focus II", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=10#p70");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Focus III", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=9#p57");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Fusion", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=126#p1826");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Mondeo IV", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=2822#p18729");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Mondeo V", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=1460#p6480");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Kuga", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=2862#p19124");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Kuga II", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=57#p749");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Ranger  (T6)", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=2874#p19220");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Ford", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();

        carListModel = new CarListModel("Волга", "GAZ газ volga", "http://rustamcolor.ru/viewtopic.php?f=13&t=34#p463");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Волга Сайбер", "GAZ газ volga Siber сибер", "http://rustamcolor.ru/viewtopic.php?f=13&t=107#p1556");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Газель, Соболь, Баргузин", "GAZEL sobol barguzin газ ", "http://rustamcolor.ru/viewtopic.php?f=13&t=2827#p18761");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Next", "GAZel газ некст газель", "http://rustamcolor.ru/viewtopic.php?f=13&t=2863#p19141");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("GAZ", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Emgrand EC7", "Geely", "http://rustamcolor.ru/viewtopic.php?f=13&t=2399#p11898");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("MK", "Geely", "http://rustamcolor.ru/viewtopic.php?f=13&t=2393#p11846");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("MK CROSS", "Geely", "http://rustamcolor.ru/viewtopic.php?f=13&t=2394#p11862");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Geely", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Hover H5", "GREAT WALL greatwall", "http://rustamcolor.ru/viewtopic.php?f=13&t=1457#p6457");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Great Wall", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Jazz II", "Honda", "http://rustamcolor.ru/viewtopic.php?f=13&t=2406#p11940");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Accord 8", "Honda 8", "http://rustamcolor.ru/viewtopic.php?f=13&t=2449#p12123");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Accord IX", "Honda 9", "http://rustamcolor.ru/viewtopic.php?f=13&t=2441#p12077");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Civic VIII", "Honda", "http://rustamcolor.ru/viewtopic.php?f=13&t=52#p685");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Civic IX", "Honda", "http://rustamcolor.ru/viewtopic.php?f=13&t=100#p1462");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Civic X", "Honda", "http://rustamcolor.ru/viewtopic.php?f=13&t=2985&p=20298#p20298");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("CR-V II  (RD4–RD7)", "Honda", "http://rustamcolor.ru/viewtopic.php?f=13&t=3216#p22653");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("CR-V III  (RE1–RE7)", "Honda", "http://rustamcolor.ru/viewtopic.php?f=13&t=104#p1509");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("CR-V IV  (RM1–RM4)", "Honda", "http://rustamcolor.ru/viewtopic.php?f=13&t=71#p940");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("CR-V V", "Honda", "http://rustamcolor.ru/viewtopic.php?f=13&t=3262#p23467");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Crosstour", "Honda", "http://rustamcolor.ru/viewtopic.php?f=13&t=2923#p19797");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("HR-V II", "Honda", "http://rustamcolor.ru/viewtopic.php?f=13&t=2994#p20380");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Pilot II", "Honda", "http://rustamcolor.ru/viewtopic.php?f=13&t=102#p1490");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Pilot III", "Honda", "http://rustamcolor.ru/viewtopic.php?f=13&t=2984&p=20289#p20289");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Honda", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Accent TAGAZ", "Hyundai Тагаз", "http://rustamcolor.ru/viewtopic.php?f=13&t=20#p269");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Creta / IX25", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=2973&p=20153#p20153");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Elantra IV (HD)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=2856#p19024");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Elantra/Avante V  (MD/UD)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=176#p2021");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Elantra/Avante VI  (AD)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=3122#p21512");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Genesis", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=179#p2055");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Grandeur IV  (TG)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=3207#p22528");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Grandeur V  (HG)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=3205#p22508");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("I20  (PB)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=1889#p9056");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("I20  II (GB)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=3247#p23283");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("I30  (FD)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=1885#p9004");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("I30  (GD)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=1884#p9003");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("I40  (VF)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=1888#p9041");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("IX35  (LM)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=101#p1477");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("IX55 / Veracruz", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=2907#p19558");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Getz", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=17#p211");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Santa Fe  (SM)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=3162#p21853");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Santa Fe II  (CM)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=3161#p21832");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Santa Fe III  (DM)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=133#p1945");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Grand Santa Fe  (DM)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=1893#p9093");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Porter", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=3071&p=20908#p20908");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Solaris", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=6#p21");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Sonata V  (NF)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=3206#p22517");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Sonata VI/VII  (YF/LF)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=1267#p5690");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Sonata TAGAZ", "Hyundai Тагаз", "http://rustamcolor.ru/viewtopic.php?f=13&t=3131#p21593");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("TUCSON  (JM)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=864#p4385");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("TUCSON III  (TL)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=2939#p19935");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Veloster", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=103#p1498");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Verna  (MC)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=3155&p=21775#p21775");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Hyundai", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("EX  (QX50)", "Infiniti", "http://rustamcolor.ru/viewtopic.php?f=13&t=3116#p21423");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("FX  (S50)", "Infiniti", "http://rustamcolor.ru/viewtopic.php?f=13&t=3168#p21907");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("FX II  (S51)", "Infiniti", "http://rustamcolor.ru/viewtopic.php?f=13&t=2841#p18887");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("JX  (QX60)", "Infiniti", "http://rustamcolor.ru/viewtopic.php?f=13&t=3192#p22294");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Q30", "Infiniti", "http://rustamcolor.ru/viewtopic.php?f=13&t=2956&p=20042#p20042");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Q50  (G)", "Infiniti", "http://rustamcolor.ru/viewtopic.php?f=13&t=2885#p19385");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Q70  (M)", "Infiniti", "http://rustamcolor.ru/viewtopic.php?f=13&t=111#p1624");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("QX70", "Infiniti", "http://rustamcolor.ru/viewtopic.php?f=13&t=110#p1615");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("QX III  (QX80)", "Infiniti", "http://rustamcolor.ru/viewtopic.php?f=13&t=2840#p18860");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Infiniti", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("F-Pace  (X761)", "Jaguar", "http://rustamcolor.ru/viewtopic.php?f=13&t=3250#p23311");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("F-Type  (X152)", "Jaguar", "http://rustamcolor.ru/viewtopic.php?f=13&t=3254&p=23377#p23377");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("XE  (X760)", "Jaguar", "http://rustamcolor.ru/viewtopic.php?f=13&t=3252#p23351");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("XF  (X250)", "Jaguar", "http://rustamcolor.ru/viewtopic.php?f=13&t=3260#p23423");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("XF 2  (X260)", "Jaguar", "http://rustamcolor.ru/viewtopic.php?f=13&t=3251#p23330");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("XJ 2  (X351)", "Jaguar", "http://rustamcolor.ru/viewtopic.php?f=13&t=3261#p23464");
        modelArrayAddingList.add(carListModel);


        vendor = new Vendor("Jaguar", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Cherokee  (KL)", "Jeep", "http://rustamcolor.ru/viewtopic.php?f=13&t=194#p2314");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Grand Cherokee  (WK2)", "Jeep", "http://rustamcolor.ru/viewtopic.php?f=13&t=198#p2422");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Jeep", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Ceed  (ED/ED FL)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=2226#p10880");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Ceed II  (JD)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=97#p1392");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Cerato II  (TD)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=91#p1259");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Cerato III  (YD)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=90#p1248");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Magentis II  (MG)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=2832#p18802");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Mohave  (HM)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=3202&p=22449#p22449");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Optima III  (TF)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=128#p1852");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Optima IV  (JF)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=3119#p21450");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Picanto  (SA)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=2891#p19442");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Picanto II  (TA)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=81#p1113");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Rio II  (JB)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=12#p111");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Rio III  (UB/QB)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=7#p35");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Soul  (AM)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=117#p1697");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Sorento  (BL)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=2837#p18839");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Sorento II  (XM)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=2834#p18814");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Sorento III  PRIME (UM)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=2835#p18815");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Soul II  (PS)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=79#p1090");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Spectra", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=14#p154");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Sportage II  (KM)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=2993&p=20349#p20349");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Sportage III  (SL)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=73#p966");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Sportage IV  (QL)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=3003&p=20445#p20445");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Quoris K9  (KH)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=2958#p20067");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Venga", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=89#p1230");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Kia", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Bogdan", "Lada Лада ВАЗ VAZ Таз Богдан", "http://rustamcolor.ru/viewtopic.php?f=13&t=1835#p8563");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Granta Ижевск", "Lada Лада ВАЗ VAZ Таз Гранта", "http://rustamcolor.ru/viewtopic.php?f=13&t=31#p407");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Granta Тольятти", "Lada Лада ВАЗ VAZ Таз Гранта", "http://rustamcolor.ru/viewtopic.php?f=13&t=32#p426");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Kalina", "Lada Лада ВАЗ VAZ Таз Калина", "http://rustamcolor.ru/viewtopic.php?f=13&t=96#p1361");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Kalina 2", "Lada Лада ВАЗ VAZ Таз Калина", "http://rustamcolor.ru/viewtopic.php?f=13&t=94#p1329");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Kalina Cross", "Lada Лада ВАЗ VAZ Таз Калина Кросс", "http://rustamcolor.ru/viewtopic.php?f=13&t=1432#p6370");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Largus", "Lada Лада ВАЗ VAZ Таз Ларгус", "http://rustamcolor.ru/viewtopic.php?f=13&t=23#p305");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Niva", "Lada Лада ВАЗ VAZ Таз Нива", "http://rustamcolor.ru/viewtopic.php?f=13&t=3040#p20647");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("4x4 Urban", "Lada Лада ВАЗ VAZ Таз 4х4 урбан Нива", "http://rustamcolor.ru/viewtopic.php?f=13&t=1574#p7036");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Priora  (2170/2171/2172)", "Lada Лада ВАЗ VAZ Таз Приора", "http://rustamcolor.ru/viewtopic.php?f=13&t=92#p1277");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Samara  (2113/2114/2115)", "Lada Лада ВАЗ VAZ Таз Самара", "http://rustamcolor.ru/viewtopic.php?f=13&t=2926#p19848");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Vesta", "Lada Лада ВАЗ VAZ Таз Веста", "http://rustamcolor.ru/viewtopic.php?f=13&t=1764#p7946");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Xray", "Lada Лада ВАЗ VAZ Таз иксрей иксрэй", "http://rustamcolor.ru/viewtopic.php?f=13&t=1680#p7544");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Lada", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Discovery IV", "Land Rover", "http://rustamcolor.ru/viewtopic.php?f=13&t=1467#p6524");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Range Rover  (L405)", "Land Rover", "http://rustamcolor.ru/viewtopic.php?f=13&t=1099#p5070");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Range Rover Evoque", "Land Rover", "http://rustamcolor.ru/viewtopic.php?f=13&t=1096#p5031");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Land Rover", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("CT  (A10)", "Lexus", "http://rustamcolor.ru/viewtopic.php?f=13&t=2016#p9837");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("ES VI  (XV60)", "Lexus", "http://rustamcolor.ru/viewtopic.php?f=13&t=3047#p20781");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("IS II  (XE20,GSE20)", "Lexus", "http://rustamcolor.ru/viewtopic.php?f=13&t=3185#p22154");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("IS III  (XE30,GSE30)", "Lexus", "http://rustamcolor.ru/viewtopic.php?f=13&t=3048&p=20800#p20800");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("GS III  (S190)", "Lexus", "http://rustamcolor.ru/viewtopic.php?f=13&t=3178#p22027");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("GS IV  (L10)", "Lexus", "http://rustamcolor.ru/viewtopic.php?f=13&t=3052#p20826");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("GX  (UZJ120)", "Lexus", "http://rustamcolor.ru/viewtopic.php?f=13&t=3179#p22028");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("GX II  (URJ150)", "Lexus", "http://rustamcolor.ru/viewtopic.php?f=13&t=3050#p20814");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("LS IV  (XF40)", "Lexus", "http://rustamcolor.ru/viewtopic.php?f=13&t=3186#p22185");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("LX III  (URJ200/URJ201)", "Lexus", "http://rustamcolor.ru/viewtopic.php?f=13&t=3180#p22029");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("NX  (AZ10)", "Lexus", "http://rustamcolor.ru/viewtopic.php?f=13&t=1389#p6215");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("RX II  (XU30)", "Lexus", "http://rustamcolor.ru/viewtopic.php?f=13&t=3184#p22132");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("RX III  (AL10)", "Lexus", "http://rustamcolor.ru/viewtopic.php?f=13&t=1390#p6226");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("RX IV  (AL20)", "Lexus", "http://rustamcolor.ru/viewtopic.php?f=13&t=2962#p20080");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Lexus", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Smily", "Lifan", "http://rustamcolor.ru/viewtopic.php?f=13&t=1462#p6503");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Solano  (620)", "Lifan", "http://rustamcolor.ru/viewtopic.php?f=13&t=2388#p11807");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("X60", "Lifan", "http://rustamcolor.ru/viewtopic.php?f=13&t=1429#p6357");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Lifan", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("2  (DE)", "Mazda", "http://rustamcolor.ru/viewtopic.php?f=13&t=131#p1916");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("3  (BK)", "Mazda", "http://rustamcolor.ru/viewtopic.php?f=13&t=3102#p21217");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("3  (BL)", "Mazda", "http://rustamcolor.ru/viewtopic.php?f=13&t=1350#p6092");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("3  (BM)", "Mazda", "http://rustamcolor.ru/viewtopic.php?f=13&t=50#p666");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("5  (CR)", "Mazda", "http://rustamcolor.ru/viewtopic.php?f=13&t=3265#p23533");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("5  (CW)", "Mazda", "http://rustamcolor.ru/viewtopic.php?f=13&t=3263#p23519");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("6  (GG)", "Mazda", "http://rustamcolor.ru/viewtopic.php?f=13&t=3104#p21246");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("6  (GH)", "Mazda", "http://rustamcolor.ru/viewtopic.php?f=13&t=1343#p6067");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("6  (GJ)", "Mazda", "http://rustamcolor.ru/viewtopic.php?f=13&t=51#p676");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("BT-50  (J97M)", "Mazda", "http://rustamcolor.ru/viewtopic.php?f=13&t=2158#p10455");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("CX-3  (DK5)", "Mazda", "http://rustamcolor.ru/viewtopic.php?f=13&t=3213#p22614");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("CX-5  (KE)", "Mazda", "http://rustamcolor.ru/viewtopic.php?f=13&t=36#p480");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("CX-7  (ER)", "Mazda", "http://rustamcolor.ru/viewtopic.php?f=13&t=49#p652");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("CX-9  (TB)", "Mazda", "http://rustamcolor.ru/viewtopic.php?f=13&t=3215#p22632");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("CX-9 II", "Mazda", "http://rustamcolor.ru/viewtopic.php?f=13&t=3214#p22624");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Mazda", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);


        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("ASX", "Mitsubishi", "http://rustamcolor.ru/viewtopic.php?f=13&t=53#p701");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Colt VI  (Z30)", "Mitsubishi", "http://rustamcolor.ru/viewtopic.php?f=13&t=195#p2325");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Grandis", "Mitsubishi", "http://rustamcolor.ru/viewtopic.php?f=13&t=3044#p20740");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Galant IX", "Mitsubishi", "http://rustamcolor.ru/viewtopic.php?f=13&t=3043#p20739");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("L200/Triton IV", "Mitsubishi", "http://rustamcolor.ru/viewtopic.php?f=13&t=118#p1715");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("L200/Triton V", "Mitsubishi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2924&p=19816#p19816");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Lancer IX", "Mitsubishi", "http://rustamcolor.ru/viewtopic.php?f=13&t=105#p1530");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Lancer X", "Mitsubishi", "http://rustamcolor.ru/viewtopic.php?f=13&t=18#p231");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Outlander", "Mitsubishi", "http://rustamcolor.ru/viewtopic.php?f=13&t=3152#p21759");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Outlander XL", "Mitsubishi", "http://rustamcolor.ru/viewtopic.php?f=13&t=33#p451");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Outlander III Калуга", "Mitsubishi", "http://rustamcolor.ru/viewtopic.php?f=13&t=28#p360");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Pajero IV", "Mitsubishi", "http://rustamcolor.ru/viewtopic.php?f=13&t=191#p2181");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Pajero Sport II", "Mitsubishi", "http://rustamcolor.ru/viewtopic.php?f=13&t=186#p2082");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Pajero Sport III  (QE)", "Mitsubishi", "http://rustamcolor.ru/viewtopic.php?f=13&t=3146#p21687");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Mitsubishi", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);


        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("A-Class  (W176)", "Mercedes-Benz", "http://rustamcolor.ru/viewtopic.php?f=13&t=1125#p5193");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("B-Class  (W246)", "Mercedes-Benz", "http://rustamcolor.ru/viewtopic.php?f=13&t=1121#p5163");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("C-Class  (W205)", "Mercedes-Benz", "http://rustamcolor.ru/viewtopic.php?f=13&t=1065#p4906");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("CLA  (C117)", "Mercedes-Benz", "http://rustamcolor.ru/viewtopic.php?f=13&t=212#p2669");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("CLS  (C218/X218)", "Mercedes-Benz", "http://rustamcolor.ru/viewtopic.php?f=13&t=209#p2633");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("E-Class  (W212)", "Mercedes-Benz", "http://rustamcolor.ru/viewtopic.php?f=13&t=1080#p4939");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("GL  (X164)", "Mercedes-Benz", "http://rustamcolor.ru/viewtopic.php?f=13&t=1058#p4856");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("GL  (X166)", "Mercedes-Benz", "http://rustamcolor.ru/viewtopic.php?f=13&t=980#p4762");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("GLA  (X156)", "Mercedes-Benz", "http://rustamcolor.ru/viewtopic.php?f=13&t=1104#p5128");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("GLC  (X253)", "Mercedes-Benz", "http://rustamcolor.ru/viewtopic.php?f=13&t=2943#p19976");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("GLE Coupe  (C292)", "Mercedes-Benz", "http://rustamcolor.ru/viewtopic.php?f=13&t=1511#p6696");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("GLK  (X204)", "Mercedes-Benz", "http://rustamcolor.ru/viewtopic.php?f=13&t=196&p=2358#p2358");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("ML  (W164)", "Mercedes-Benz", "http://rustamcolor.ru/viewtopic.php?f=13&t=1060#p4881");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("ML  (W166)", "Mercedes-Benz", "http://rustamcolor.ru/viewtopic.php?f=13&t=211#p2653");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("S-Class  (W222)", "Mercedes-Benz", "http://rustamcolor.ru/viewtopic.php?f=13&t=1095#p5007");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Mercedes-Benz", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);


        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Almera  (N16)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=3130#p21567");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Almera Classic  (B10)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=26#p336");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Almera  (G15)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=5#p13");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Altima III  (L31)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=3225#p22847");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Altima IV  (L32/D32)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=3223#p22812");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Altima V  (L33)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=3224#p22834");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Cube III  (Z12)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=3193#p22309");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("GT-R  (R35)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=1209#p5486");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Juke  (F15)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=46#p615");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Leaf", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=3194#p22329");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Maxima VIII  (A36)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=3195#p22343");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Micra  (K12)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=971#p4686");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Micra  (K13)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=974#p4732");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Murano I  (Z50)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=3167#p21893");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Murano II  (Z51)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=1518#p6728");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Murano III  (Z52)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=1513#p6715");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Navara  (D40)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=2843#p18903");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Note  (E11)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=1162#p5378");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Pathfinder (R51)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=93#p1313");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Pathfinder  (R52)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=122#p1767");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Patrol  (Y62)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=2839#p18859");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Primera  (P12)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=3221&p=22783#p22783");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Qashqai  (J10)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=61#p791");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Qashqai  (J11)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=60#p781");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Sentra  (B17)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=112#p1632");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Teana  (J31)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=3166#p21875");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Teana  (J32)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=75#p989");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Teana  (L33)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=74#p981");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Terrano  (D10)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=59#p776");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Tiida  (C11)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=1200#p5452");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Tiida  (C13)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=1471#p6563");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("X-Trail  (T31)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=30#p387");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("X-Trail  (T32)", "Nissan", "http://rustamcolor.ru/viewtopic.php?f=13&t=123#p1781");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Nissan", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);


        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Antara", "Opel", "http://rustamcolor.ru/viewtopic.php?f=13&t=1426#p6332");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Astra  (H)", "Opel", "http://rustamcolor.ru/viewtopic.php?f=13&t=45#p602");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Astra  (J)", "Opel", "http://rustamcolor.ru/viewtopic.php?f=13&t=38#p514");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Astra  (K)", "Opel", "http://rustamcolor.ru/viewtopic.php?f=13&t=2957#p20054");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Corsa (D)", "Opel", "http://rustamcolor.ru/viewtopic.php?f=13&t=1896#p9118");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Insignia  (G09)", "Opel", "http://rustamcolor.ru/viewtopic.php?f=13&t=39#p534");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Mokka / Mokka X", "Opel", "http://rustamcolor.ru/viewtopic.php?f=13&t=44#p591");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Meriva B", "Opel", "http://rustamcolor.ru/viewtopic.php?f=13&t=109#p1598");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Zafira B", "Opel", "http://rustamcolor.ru/viewtopic.php?f=13&t=3182#p22069");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Zafira Tourer C", "Opel", "http://rustamcolor.ru/viewtopic.php?f=13&t=1542#p6831");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Opel", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);


        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("107", "Peugeot", "http://rustamcolor.ru/viewtopic.php?f=13&t=2219#p10827");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("1007", "Peugeot", "http://rustamcolor.ru/viewtopic.php?f=13&t=2922#p19779");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("206", "Peugeot", "http://rustamcolor.ru/viewtopic.php?f=13&t=3076#p20931");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("207", "Peugeot", "http://rustamcolor.ru/viewtopic.php?f=13&t=3069#p20890");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("208", "Peugeot", "http://rustamcolor.ru/viewtopic.php?f=13&t=2400#p11909");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("2008  (A94)", "Peugeot", "http://rustamcolor.ru/viewtopic.php?f=13&t=2920&p=19750#p19750");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("301", "Peugeot", "http://rustamcolor.ru/viewtopic.php?f=13&t=2234&p=10952#p10952");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("307", "Peugeot", "http://rustamcolor.ru/viewtopic.php?f=13&t=3020#p20514");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("308  (T7)", "Peugeot", "http://rustamcolor.ru/viewtopic.php?f=13&t=56#p733");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("308  (T9)", "Peugeot", "http://rustamcolor.ru/viewtopic.php?f=13&t=2879#p19261");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("3008", "Peugeot", "http://rustamcolor.ru/viewtopic.php?f=13&t=2890#p19426");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("3008 II", "Peugeot", "http://rustamcolor.ru/viewtopic.php?f=13&t=3226#p22865");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("407", "Peugeot", "http://rustamcolor.ru/viewtopic.php?f=13&t=2314#p11360");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("4007", "Peugeot", "http://rustamcolor.ru/viewtopic.php?f=13&t=2908#p19571");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("408", "Peugeot", "http://rustamcolor.ru/viewtopic.php?f=13&t=2230#p10924");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("4008", "Peugeot", "http://rustamcolor.ru/viewtopic.php?f=13&t=2915#p19691");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("508", "Peugeot", "http://rustamcolor.ru/viewtopic.php?f=13&t=2323#p11433");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("5008  (T87)", "Peugeot", "http://rustamcolor.ru/viewtopic.php?f=13&t=2909#p19585");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("RCZ", "Peugeot", "http://rustamcolor.ru/viewtopic.php?f=13&t=2919#p19738");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Peugeot", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);


        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Cayenne II  (958)", "Porsche", "http://rustamcolor.ru/viewtopic.php?f=13&t=2205#p10729");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Macan", "Porsche", "http://rustamcolor.ru/viewtopic.php?f=13&t=2201#p10699");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Panamera  (970)", "Porsche", "http://rustamcolor.ru/viewtopic.php?f=13&t=2886#p19394");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Porsche", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);


        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Gentra", "Ravon", "http://rustamcolor.ru/viewtopic.php?f=13&t=3037#p20632");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Matiz", "Ravon", "http://rustamcolor.ru/viewtopic.php?f=13&t=3039#p20634");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Nexia R3", "Ravon", "http://rustamcolor.ru/viewtopic.php?f=13&t=3038#p20633");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("R2", "Ravon", "http://rustamcolor.ru/viewtopic.php?f=13&t=2999#p20415");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("R4", "Ravon", "http://rustamcolor.ru/viewtopic.php?f=13&t=3233&p=23008#p23008");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Ravon", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);


        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Captur / Kaptur", "Renault", "http://rustamcolor.ru/viewtopic.php?f=13&t=1868#p8869");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Clio IV", "Renault", "http://rustamcolor.ru/viewtopic.php?f=13&t=2422&p=11995#p11995");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Duster", "Renault", "http://rustamcolor.ru/viewtopic.php?f=13&t=24#p312");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Fluence", "Renault", "http://rustamcolor.ru/viewtopic.php?f=13&t=106#p1538");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Kadjar", "Renault", "http://rustamcolor.ru/viewtopic.php?f=13&t=2998#p20405");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Kangoo II", "Renault", "http://rustamcolor.ru/viewtopic.php?f=13&t=2409#p11960");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Koleos", "Renault", "http://rustamcolor.ru/viewtopic.php?f=13&t=85#p1173");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Latitude", "Renault", "http://rustamcolor.ru/viewtopic.php?f=13&t=3025&p=20580#p20580");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Logan", "Renault", "http://rustamcolor.ru/viewtopic.php?f=13&t=27#p347");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Logan II", "Renault", "http://rustamcolor.ru/viewtopic.php?f=13&t=4#p5");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Megane II", "Renault", "http://rustamcolor.ru/viewtopic.php?f=13&t=3106&p=21280#p21280");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Megane III", "Renault", "http://rustamcolor.ru/viewtopic.php?f=13&t=82#p1125");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Megane IV", "Renault", "http://rustamcolor.ru/viewtopic.php?f=13&t=3023#p20551");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Sandero", "Renault", "http://rustamcolor.ru/viewtopic.php?f=13&t=95#p1350");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Scenic III", "Renault", "http://rustamcolor.ru/viewtopic.php?f=13&t=2880#p19282");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Talisman", "Renault", "http://rustamcolor.ru/viewtopic.php?f=13&t=3024&p=20568#p20568");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Renault", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Ibiza IV  (6J)", "Seat", "http://rustamcolor.ru/viewtopic.php?f=13&t=2341#p11538");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Leon III  (5F)", "Seat", "http://rustamcolor.ru/viewtopic.php?f=13&t=2901#p19526");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Seat", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Fabia II  (5J)", "Skoda", "http://rustamcolor.ru/viewtopic.php?f=13&t=2326#p11446");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Fabia III  (NJ)", "Skoda", "http://rustamcolor.ru/viewtopic.php?f=13&t=2331&p=11486#p11486");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Kodiaq", "Skoda", "http://rustamcolor.ru/viewtopic.php?f=13&t=3236#p23060");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Octavia II (1Z/A5)", "Skoda", "http://rustamcolor.ru/viewtopic.php?f=13&t=2363#p11657");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Octavia III  (5E/A7)", "Skoda", "http://rustamcolor.ru/viewtopic.php?f=13&t=25#p323");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Rapid  (NH1/NH3/NK3)", "Skoda", "http://rustamcolor.ru/viewtopic.php?f=13&t=83#p1146");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Roomster  (5J)", "Skoda", "http://rustamcolor.ru/viewtopic.php?f=13&t=87#p1203");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Superb II  (B6/3T)", "Skoda", "http://rustamcolor.ru/viewtopic.php?f=13&t=2376&p=11725#p11725");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Superb III (B8)", "Skoda", "http://rustamcolor.ru/viewtopic.php?f=13&t=2377#p11741");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Yeti  (5L)", "Skoda", "http://rustamcolor.ru/viewtopic.php?f=13&t=29#p369");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Skoda", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("BRZ  (ZC6)", "Subaru", "http://rustamcolor.ru/viewtopic.php?f=13&t=1134#p5289");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Forester IV  (SJ)", "Subaru", "http://rustamcolor.ru/viewtopic.php?f=13&t=132#p1933");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Impreza IV", "Subaru", "http://rustamcolor.ru/viewtopic.php?f=13&t=1130#p5232");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Legacy V", "Subaru", "http://rustamcolor.ru/viewtopic.php?f=13&t=1137#p5324");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Legacy VI", "Subaru", "http://rustamcolor.ru/viewtopic.php?f=13&t=1133#p5278");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Outback III", "Subaru", "http://rustamcolor.ru/viewtopic.php?f=13&t=911#p4523");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Outback IV", "Subaru", "http://rustamcolor.ru/viewtopic.php?f=13&t=910#p4497");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Outback V", "Subaru", "http://rustamcolor.ru/viewtopic.php?f=13&t=976&p=4749#p4749");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("XV", "Subaru", "http://rustamcolor.ru/viewtopic.php?f=13&t=1132#p5258");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Subaru", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Jimny III (JB23/JB33/JB43/JB53", "Suzuki", "http://rustamcolor.ru/viewtopic.php?f=13&t=2270#p11179");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Splash", "Suzuki", "http://rustamcolor.ru/viewtopic.php?f=13&t=2250#p11065");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Swift  (FZ/NZ)", "Suzuki", "http://rustamcolor.ru/viewtopic.php?f=13&t=2260#p11109");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("SX4", "Suzuki", "http://rustamcolor.ru/viewtopic.php?f=13&t=67#p864");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("SX4 / S-Cross", "Suzuki", "http://rustamcolor.ru/viewtopic.php?f=13&t=35#p469");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Grand Vitara", "Suzuki", "http://rustamcolor.ru/viewtopic.php?f=13&t=69#p905");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Vitara", "Suzuki", "http://rustamcolor.ru/viewtopic.php?f=13&t=1696#p7583");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Suzuki", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Actyon", "Ssangyong", "http://rustamcolor.ru/viewtopic.php?f=13&t=114#p1660");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Actyon Sports", "Ssangyong", "http://rustamcolor.ru/viewtopic.php?f=13&t=1269#p5729");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Kyron", "Ssangyong", "http://rustamcolor.ru/viewtopic.php?f=13&t=1259#p5624");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Rexton", "Ssangyong", "http://rustamcolor.ru/viewtopic.php?f=13&t=1261#p5639");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Tivoli", "Ssangyong", "http://rustamcolor.ru/viewtopic.php?f=13&t=3249#p23299");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Ssangyong", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("FR-S  (ZN6)", "Scion", "http://rustamcolor.ru/viewtopic.php?f=13&t=3204#p22492");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Scion", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Auris  (E150)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=1743#p7818");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Auris II  (E180)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=1741#p7801");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Avensis 2  (T250)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=3138#p21646");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Avensis 3  (T27)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=204#p2557");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Camry  (V30)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=3169#p21921");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Camry  (V40)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=48#p640");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Camry  (V50)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=47#p632");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Celica VII  (T230)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=3198#p22408");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Corolla IX  (E120/E130)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=3157#p21785");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Corolla X  (E140/E150)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=41#p560");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Corolla XI  (E160/E170)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=43#p581");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Corolla Verso", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=3197&p=22374#p22374");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("FJ Cruiser  (GSJ15W)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=2965#p20099");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("GT86 / Scion FR-S  (ZN6)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=3204#p22492");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Highlander II", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=119#p1730");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Highlander III", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=121#p1757");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Hilux VII  (AN10/AN20/AN30)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=3045#p20769");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Hilux VIII  (AN120/AN130)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=2927#p19892");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Land Cruiser  (J100)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=3135&p=21615#p21615");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Land Cruiser  (J200)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=55#p722");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Land Cruiser Prado  (J120)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=3176#p22010");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Land Cruiser Prado  (J150)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=120#p1744");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Matrix  (E130)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=3158#p21801");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Matrix II  (E140)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=3159#p21802");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Prius  (XW10)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=3174#p21985");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Prius II  (XW20)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=3173#p21972");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Prius III  (XW30)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=3172#p21958");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Prius IV  (XW50)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=3171#p21949");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Prius V  (ZVW40/ZVW41)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=3183#p22118");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Prius C  (NHP10)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=3175#p21994");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Rav4 III  (XA30)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=58#p761");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Rav4 IV  (XA40)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=54#p711");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Sequoia  (UCK35)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=3212#p22583");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Sequoia II  (UPK60)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=3203#p22464");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Solara II  (ACV30)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=3200#p22426");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Tacoma II", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=3190#p22251");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Tacoma III", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=3187#p22212");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Tundra II", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=2942#p19956");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Venza", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=72#p953");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Yaris II  (XP90)", "Toyota", "http://rustamcolor.ru/viewtopic.php?f=13&t=2869#p19176");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Toyota", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);


        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Patriot", "UAZ патриот УАЗ", "http://rustamcolor.ru/viewtopic.php?f=13&t=2385#p11789");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("UAZ", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);


        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("XC60", "Volvo", "http://rustamcolor.ru/viewtopic.php?f=13&t=130#p1894");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("XC70", "Volvo", "http://rustamcolor.ru/viewtopic.php?f=13&t=113#p1641");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("XC90  (P28)", "Volvo", "http://rustamcolor.ru/viewtopic.php?f=13&t=129#p1868");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("XC90 II", "Volvo", "http://rustamcolor.ru/viewtopic.php?f=13&t=2911&p=19605#p19605");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("S40", "Volvo", "http://rustamcolor.ru/viewtopic.php?f=13&t=68#p883");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("S60 II", "Volvo", "http://rustamcolor.ru/viewtopic.php?f=13&t=207#p2605");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Volvo", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);


        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Amarok", "Volkswagen", "http://rustamcolor.ru/viewtopic.php?f=13&t=63#p827");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Caddy III  (2K)", "Volkswagen", "http://rustamcolor.ru/viewtopic.php?f=13&t=3245#p23227");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Golf VI", "Volkswagen", "http://rustamcolor.ru/viewtopic.php?f=13&t=3108#p21352");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Golf VII", "Volkswagen", "http://rustamcolor.ru/viewtopic.php?f=13&t=66#p851");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Golf Plus", "Volkswagen", "http://rustamcolor.ru/viewtopic.php?f=13&t=3109#p21370");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Jetta VI  (1B", "Volkswagen", "http://rustamcolor.ru/viewtopic.php?f=13&t=80#p1102");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Passat  (B6)", "Volkswagen", "http://rustamcolor.ru/viewtopic.php?f=13&t=3099#p21194");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Passat  (B7)", "Volkswagen", "http://rustamcolor.ru/viewtopic.php?f=13&t=3081#p21009");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Passat  (B8)", "Volkswagen", "http://rustamcolor.ru/viewtopic.php?f=13&t=2990#p20320");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Passat CC", "Volkswagen", "http://rustamcolor.ru/viewtopic.php?f=13&t=3083&p=21032#p21032");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Polo Sedan", "Volkswagen", "http://rustamcolor.ru/viewtopic.php?f=13&t=42#p571");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Polo Hatchback", "Volkswagen", "http://rustamcolor.ru/viewtopic.php?f=13&t=115#p1672");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Scirocco III", "Volkswagen", "http://rustamcolor.ru/viewtopic.php?f=13&t=2917#p19713");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Sharan II (7N)", "Volkswagen", "http://rustamcolor.ru/viewtopic.php?f=13&t=3267#p23536");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Tiguan  (5N)", "Volkswagen", "http://rustamcolor.ru/viewtopic.php?f=13&t=70#p924");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Tiguan II", "Volkswagen", "http://rustamcolor.ru/viewtopic.php?f=13&t=3243&p=23174#p23174");
        modelArrayAddingList.add(carListModel);
        carListModel = new CarListModel("Touareg", "Volkswagen ", "http://rustamcolor.ru/viewtopic.php?f=13&t=98#p1405");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("Volkswagen", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<>();
        carListModel = new CarListModel("Chance / Lanos / Sens / Vida", "ZAZ заз запорожец сенс sens lanos", "http://rustamcolor.ru/viewtopic.php?f=13&t=19t=127#p243");
        modelArrayAddingList.add(carListModel);

        vendor = new Vendor("ZAZ", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

    }

}

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
        model = new Model("TT II  (8J)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2859#p19053");
        modelArrayAddingList.add(model);
        model = new Model("TT III  (8S)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2858#p19040");
        modelArrayAddingList.add(model);
        model = new Model("Q2", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=3258#p23402");
        modelArrayAddingList.add(model);
        model = new Model("Q3, RS Q3  (8U)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2855#p19000");
        modelArrayAddingList.add(model);
        model = new Model("Q5,SQ5  (8R)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2846#p18928");
        modelArrayAddingList.add(model);
        model = new Model("Q7  (4L)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2845#p18927");
        modelArrayAddingList.add(model);
        model = new Model("Q7 II  (4M)", "Audi", "http://rustamcolor.ru/viewtopic.php?f=13&t=2844#p18916");
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
        model = new Model("Escalade III  (GMT900)", "Cadillac 3", "http://rustamcolor.ru/viewtopic.php?f=13&t=3191#p22270");
        modelArrayAddingList.add(model);
        model = new Model("Escalade IV  (GMTK2XL)", "Cadillac 4", "http://rustamcolor.ru/viewtopic.php?f=13&t=3188#p22222");
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
        model = new Model("Spark II  (M200/M250)", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=2286#p11275");
        modelArrayAddingList.add(model);
        model = new Model("Spark III  (M300)", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=2283#p11262");
        modelArrayAddingList.add(model);
        model = new Model("Captiva", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=1428#p6354");
        modelArrayAddingList.add(model);
        model = new Model("Tracker", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=3181&p=22057#p22057");
        modelArrayAddingList.add(model);
        model = new Model("Trailblazer", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=88#p1221");
        modelArrayAddingList.add(model);
        model = new Model("AVEO (T200/T250)", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=86#p1182");
        modelArrayAddingList.add(model);
        model = new Model("AVEO II (T300)", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=40#p550");
        modelArrayAddingList.add(model);
        model = new Model("CRUZE (1G/J300)", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=37#p495");
        modelArrayAddingList.add(model);
        model = new Model("Cobalt", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=8#p46");
        modelArrayAddingList.add(model);
        model = new Model("Lacetti", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=11#p92");
        modelArrayAddingList.add(model);
        model = new Model("Niva", "Chevrolet Lada", "http://rustamcolor.ru/viewtopic.php?f=13&t=13#p125");
        modelArrayAddingList.add(model);
        model = new Model("Orlando", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=116#p1686");
        modelArrayAddingList.add(model);
        model = new Model("Epica", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=177#p2040");
        modelArrayAddingList.add(model);
        model = new Model("Malibu", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=219#p3181");
        modelArrayAddingList.add(model);
        model = new Model("Rezzo", "Chevrolet", "http://rustamcolor.ru/viewtopic.php?f=13&t=3148#p21726");
        modelArrayAddingList.add(model);

        vendor = new Vendor("Chevrolet", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("300C  (8X)", "Chrysler", "http://rustamcolor.ru/viewtopic.php?f=13&t=3246#p23268");
        modelArrayAddingList.add(model);
        model = new Model("300C II", "Chrysler", "http://rustamcolor.ru/viewtopic.php?f=13&t=3244&p=23189#p23189");
        modelArrayAddingList.add(model);

        vendor = new Vendor("Chrysler", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("on-DO", "Datsun", "http://rustamcolor.ru/viewtopic.php?f=13&t=22#p297");
        modelArrayAddingList.add(model);
        model = new Model("on-DO", "Datsun", "http://rustamcolor.ru/viewtopic.php?f=13&t=1289#p5833");
        modelArrayAddingList.add(model);

        vendor = new Vendor("Datsun", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("Nexia  (N150)", "Daewoo нексия", "http://rustamcolor.ru/viewtopic.php?f=13&t=1543#p6849");
        modelArrayAddingList.add(model);
        model = new Model("Matiz  (M150)", "Daewoo матиз", "http://rustamcolor.ru/viewtopic.php?f=13&t=16#p180");
        modelArrayAddingList.add(model);
        model = new Model("Gentra", "Daewoo", "http://rustamcolor.ru/viewtopic.php?f=13&t=15#p168");
        modelArrayAddingList.add(model);

        vendor = new Vendor("Daewoo", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("Caliber", "Dodge", "http://rustamcolor.ru/viewtopic.php?f=13&t=3196#p22353");
        modelArrayAddingList.add(model);

        vendor = new Vendor("Dodge", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("Albea", "Fiat", "http://rustamcolor.ru/viewtopic.php?f=13&t=21#p286");
        modelArrayAddingList.add(model);
        model = new Model("Doblo", "Fiat", "http://rustamcolor.ru/viewtopic.php?f=13&t=3217#p22678");
        modelArrayAddingList.add(model);
        model = new Model("Linea (323)", "Fiat", "http://rustamcolor.ru/viewtopic.php?f=13&t=3189#p22235");
        modelArrayAddingList.add(model);
        model = new Model("Tipo (Typ 356)", "Fiat", "http://rustamcolor.ru/viewtopic.php?f=13&t=3201#p22439");
        modelArrayAddingList.add(model);

        vendor = new Vendor("Fiat", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("Mondeo IV", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=2822#p18729");
        modelArrayAddingList.add(model);
        model = new Model("Mondeo V", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=1460#p6480");
        modelArrayAddingList.add(model);
        model = new Model("Edge", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=1458#p6459");
        modelArrayAddingList.add(model);
        model = new Model("Focus II", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=10#p70");
        modelArrayAddingList.add(model);
        model = new Model("Focus III", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=9#p57");
        modelArrayAddingList.add(model);
        model = new Model("Kuga", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=2862#p19124");
        modelArrayAddingList.add(model);
        model = new Model("Kuga II", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=57#p749");
        modelArrayAddingList.add(model);
        model = new Model("Fiesta V", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=125#p1807");
        modelArrayAddingList.add(model);
        model = new Model("Fiesta VI", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=124#p1790");
        modelArrayAddingList.add(model);
        model = new Model("Fusion", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=126#p1826");
        modelArrayAddingList.add(model);
        model = new Model("Ecosport", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=127#p1846");
        modelArrayAddingList.add(model);
        model = new Model("C-Max", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=201#p2508");
        modelArrayAddingList.add(model);
        model = new Model("Ranger  (T6)", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=2874#p19220");
        modelArrayAddingList.add(model);
        model = new Model("Explorer V  (U502)", "Ford", "http://rustamcolor.ru/viewtopic.php?f=13&t=3121#p21474");
        modelArrayAddingList.add(model);

        vendor = new Vendor("Ford", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("Газель, Соболь, Баргузин", "GAZEL sobol barguzin газ ", "http://rustamcolor.ru/viewtopic.php?f=13&t=2827#p18761");
        modelArrayAddingList.add(model);
        model = new Model("Next", "GAZel газ некст газель", "http://rustamcolor.ru/viewtopic.php?f=13&t=2863#p19141");
        modelArrayAddingList.add(model);
        model = new Model("Волга Сайбер", "GAZ газ volga Siber сибер", "http://rustamcolor.ru/viewtopic.php?f=13&t=107#p1556");
        modelArrayAddingList.add(model);
        model = new Model("Волга", "GAZ газ volga", "http://rustamcolor.ru/viewtopic.php?f=13&t=34#p463");
        modelArrayAddingList.add(model);

        vendor = new Vendor("GAZ", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("MK", "Geely", "http://rustamcolor.ru/viewtopic.php?f=13&t=2393#p11846");
        modelArrayAddingList.add(model);
        model = new Model("MK CROSS", "Geely", "http://rustamcolor.ru/viewtopic.php?f=13&t=2394#p11862");
        modelArrayAddingList.add(model);
        model = new Model("Emgrand EC7", "Geely", "http://rustamcolor.ru/viewtopic.php?f=13&t=2399#p11898");
        modelArrayAddingList.add(model);

        vendor = new Vendor("Geely", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("Hover H5", "GREAT WALL greatwall", "http://rustamcolor.ru/viewtopic.php?f=13&t=1457#p6457");
        modelArrayAddingList.add(model);

        vendor = new Vendor("Great Wall", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("Civic VIII", "Honda", "http://rustamcolor.ru/viewtopic.php?f=13&t=52#p685");
        modelArrayAddingList.add(model);
        model = new Model("Civic IX", "Honda", "http://rustamcolor.ru/viewtopic.php?f=13&t=100#p1462");
        modelArrayAddingList.add(model);
        model = new Model("Civic X", "Honda", "http://rustamcolor.ru/viewtopic.php?f=13&t=2985&p=20298#p20298");
        modelArrayAddingList.add(model);
        model = new Model("CR-V II  (RD4–RD7)", "Honda", "http://rustamcolor.ru/viewtopic.php?f=13&t=3216#p22653");
        modelArrayAddingList.add(model);
        model = new Model("CR-V III  (RE1–RE7)", "Honda", "http://rustamcolor.ru/viewtopic.php?f=13&t=104#p1509");
        modelArrayAddingList.add(model);
        model = new Model("CR-V IV  (RM1–RM4)", "Honda", "http://rustamcolor.ru/viewtopic.php?f=13&t=71#p940");
        modelArrayAddingList.add(model);
        model = new Model("Pilot II", "Honda", "http://rustamcolor.ru/viewtopic.php?f=13&t=102#p1490");
        modelArrayAddingList.add(model);
        model = new Model("Pilot III", "Honda", "http://rustamcolor.ru/viewtopic.php?f=13&t=2984&p=20289#p20289");
        modelArrayAddingList.add(model);
        model = new Model("Jazz II", "Honda", "http://rustamcolor.ru/viewtopic.php?f=13&t=2406#p11940");
        modelArrayAddingList.add(model);
        model = new Model("Accord 8", "Honda 8", "http://rustamcolor.ru/viewtopic.php?f=13&t=2449#p12123");
        modelArrayAddingList.add(model);
        model = new Model("Accord IX", "Honda 9", "http://rustamcolor.ru/viewtopic.php?f=13&t=2441#p12077");
        modelArrayAddingList.add(model);
        model = new Model("Crosstour", "Honda", "http://rustamcolor.ru/viewtopic.php?f=13&t=2923#p19797");
        modelArrayAddingList.add(model);
        model = new Model("HR-V II", "Honda", "http://rustamcolor.ru/viewtopic.php?f=13&t=2994#p20380");
        modelArrayAddingList.add(model);

        vendor = new Vendor("Honda", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("I20  (PB)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=1889#p9056");
        modelArrayAddingList.add(model);
        model = new Model("I20  II (GB)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=3247#p23283");
        modelArrayAddingList.add(model);
        model = new Model("I30  (FD)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=1885#p9004");
        modelArrayAddingList.add(model);
        model = new Model("I30  (GD)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=1884#p9003");
        modelArrayAddingList.add(model);
        model = new Model("I40  (VF)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=1888#p9041");
        modelArrayAddingList.add(model);
        model = new Model("Creta / IX25", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=2973&p=20153#p20153");
        modelArrayAddingList.add(model);
        model = new Model("IX35  (LM)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=101#p1477");
        modelArrayAddingList.add(model);
        model = new Model("IX55 / Veracruz", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=2907#p19558");
        modelArrayAddingList.add(model);
        model = new Model("Getz", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=17#p211");
        modelArrayAddingList.add(model);
        model = new Model("Solaris", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=6#p21");
        modelArrayAddingList.add(model);
        model = new Model("Accent TAGAZ", "Hyundai Тагаз", "http://rustamcolor.ru/viewtopic.php?f=13&t=20#p269");
        modelArrayAddingList.add(model);
        model = new Model("Sonata TAGAZ", "Hyundai Тагаз", "http://rustamcolor.ru/viewtopic.php?f=13&t=3131#p21593");
        modelArrayAddingList.add(model);
        model = new Model("Veloster", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=103#p1498");
        modelArrayAddingList.add(model);
        model = new Model("Verna  (MC)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=3155&p=21775#p21775");
        modelArrayAddingList.add(model);
        model = new Model("Santa Fe  (SM)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=3162#p21853");
        modelArrayAddingList.add(model);
        model = new Model("Santa Fe II  (CM)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=3161#p21832");
        modelArrayAddingList.add(model);
        model = new Model("Santa Fe III  (DM)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=133#p1945");
        modelArrayAddingList.add(model);
        model = new Model("Grand Santa Fe  (DM)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=1893#p9093");
        modelArrayAddingList.add(model);
        model = new Model("Elantra IV (HD)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=2856#p19024");
        modelArrayAddingList.add(model);
        model = new Model("Elantra/Avante V  (MD/UD)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=176#p2021");
        modelArrayAddingList.add(model);
        model = new Model("Elantra/Avante VI  (AD)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=3122#p21512");
        modelArrayAddingList.add(model);
        model = new Model("Genesis", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=179#p2055");
        modelArrayAddingList.add(model);
        model = new Model("Grandeur IV  (TG)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=3207#p22528");
        modelArrayAddingList.add(model);
        model = new Model("Grandeur V  (HG)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=3205#p22508");
        modelArrayAddingList.add(model);
        model = new Model("TUCSON  (JM)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=864#p4385");
        modelArrayAddingList.add(model);
        model = new Model("TUCSON III  (TL)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=2939#p19935");
        modelArrayAddingList.add(model);
        model = new Model("Sonata V  (NF)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=3206#p22517");
        modelArrayAddingList.add(model);
        model = new Model("Sonata VI/VII  (YF/LF)", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=1267#p5690");
        modelArrayAddingList.add(model);
        model = new Model("Porter", "Hyundai", "http://rustamcolor.ru/viewtopic.php?f=13&t=3071&p=20908#p20908");
        modelArrayAddingList.add(model);

        vendor = new Vendor("Hyundai", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("Q30", "Infiniti", "http://rustamcolor.ru/viewtopic.php?f=13&t=2956&p=20042#p20042");
        modelArrayAddingList.add(model);
        model = new Model("Q50  (G)", "Infiniti", "http://rustamcolor.ru/viewtopic.php?f=13&t=2885#p19385");
        modelArrayAddingList.add(model);
        model = new Model("Q70  (M)", "Infiniti", "http://rustamcolor.ru/viewtopic.php?f=13&t=111#p1624");
        modelArrayAddingList.add(model);
        model = new Model("EX  (QX50)", "Infiniti", "http://rustamcolor.ru/viewtopic.php?f=13&t=3116#p21423");
        modelArrayAddingList.add(model);
        model = new Model("FX  (S50)", "Infiniti", "http://rustamcolor.ru/viewtopic.php?f=13&t=3168#p21907");
        modelArrayAddingList.add(model);
        model = new Model("FX II  (S51)", "Infiniti", "http://rustamcolor.ru/viewtopic.php?f=13&t=2841#p18887");
        modelArrayAddingList.add(model);
        model = new Model("QX70", "Infiniti", "http://rustamcolor.ru/viewtopic.php?f=13&t=110#p1615");
        modelArrayAddingList.add(model);
        model = new Model("QX III  (QX80)", "Infiniti", "http://rustamcolor.ru/viewtopic.php?f=13&t=2840#p18860");
        modelArrayAddingList.add(model);
        model = new Model("JX  (QX60)", "Infiniti", "http://rustamcolor.ru/viewtopic.php?f=13&t=3192#p22294");
        modelArrayAddingList.add(model);

        vendor = new Vendor("Infiniti", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("F-Pace  (X761)", "Jaguar", "http://rustamcolor.ru/viewtopic.php?f=13&t=3250#p23311");
        modelArrayAddingList.add(model);
        model = new Model("F-Type  (X152)", "Jaguar", "http://rustamcolor.ru/viewtopic.php?f=13&t=3254&p=23377#p23377");
        modelArrayAddingList.add(model);
        model = new Model("XE  (X760)", "Jaguar", "http://rustamcolor.ru/viewtopic.php?f=13&t=3252#p23351");
        modelArrayAddingList.add(model);
        model = new Model("XF  (X250)", "Jaguar", "http://rustamcolor.ru/viewtopic.php?f=13&t=3260#p23423");
        modelArrayAddingList.add(model);
        model = new Model("XF 2  (X260)", "Jaguar", "http://rustamcolor.ru/viewtopic.php?f=13&t=3251#p23330");
        modelArrayAddingList.add(model);

        vendor = new Vendor("Jaguar", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("Cherokee  (KL)", "Jeep", "http://rustamcolor.ru/viewtopic.php?f=13&t=194#p2314");
        modelArrayAddingList.add(model);
        model = new Model("Grand Cherokee  (WK2)", "Jeep", "http://rustamcolor.ru/viewtopic.php?f=13&t=198#p2422");
        modelArrayAddingList.add(model);

        vendor = new Vendor("Jeep", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("Ceed  (ED/ED FL)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=2226#p10880");
        modelArrayAddingList.add(model);
        model = new Model("Ceed II  (JD)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=97#p1392");
        modelArrayAddingList.add(model);
        model = new Model("Cerato II  (TD)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=91#p1259");
        modelArrayAddingList.add(model);
        model = new Model("Cerato III  (YD)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=90#p1248");
        modelArrayAddingList.add(model);
        model = new Model("Venga", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=89#p1230");
        modelArrayAddingList.add(model);
        model = new Model("Picanto  (SA)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=2891#p19442");
        modelArrayAddingList.add(model);
        model = new Model("Picanto II  (TA)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=81#p1113");
        modelArrayAddingList.add(model);
        model = new Model("Soul  (AM)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=117#p1697");
        modelArrayAddingList.add(model);
        model = new Model("Soul II  (PS)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=79#p1090");
        modelArrayAddingList.add(model);
        model = new Model("Rio II  (JB)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=12#p111");
        modelArrayAddingList.add(model);
        model = new Model("Rio III  (UB/QB)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=7#p35");
        modelArrayAddingList.add(model);
        model = new Model("Sportage II  (KM)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=2993&p=20349#p20349");
        modelArrayAddingList.add(model);
        model = new Model("Sportage III  (SL)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=73#p966");
        modelArrayAddingList.add(model);
        model = new Model("Sportage IV  (QL)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=3003&p=20445#p20445");
        modelArrayAddingList.add(model);
        model = new Model("Spectra", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=14#p154");
        modelArrayAddingList.add(model);
        model = new Model("Sorento  (BL)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=2837#p18839");
        modelArrayAddingList.add(model);
        model = new Model("Sorento II  (XM)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=2834#p18814");
        modelArrayAddingList.add(model);
        model = new Model("Sorento III  PRIME (UM)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=2835#p18815");
        modelArrayAddingList.add(model);
        model = new Model("Optima III  (TF)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=128#p1852");
        modelArrayAddingList.add(model);
        model = new Model("Optima IV  (JF)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=3119#p21450");
        modelArrayAddingList.add(model);
        model = new Model("Magentis II  (MG)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=2832#p18802");
        modelArrayAddingList.add(model);
        model = new Model("Mohave  (HM)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=3202&p=22449#p22449");
        modelArrayAddingList.add(model);
        model = new Model("Quoris K9  (KH)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=2958#p20067");
        modelArrayAddingList.add(model);

        vendor = new Vendor("Kia", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("Bogdan", "Lada Лада ВАЗ VAZ Таз Богдан", "http://rustamcolor.ru/viewtopic.php?f=13&t=1835#p8563");
        modelArrayAddingList.add(model);
        model = new Model("Vesta", "Lada Лада ВАЗ VAZ Таз Веста", "http://rustamcolor.ru/viewtopic.php?f=13&t=1764#p7946");
        modelArrayAddingList.add(model);
        model = new Model("Xray", "Lada Лада ВАЗ VAZ Таз иксрей иксрэй", "http://rustamcolor.ru/viewtopic.php?f=13&t=1680#p7544");
        modelArrayAddingList.add(model);
        model = new Model("Niva", "Lada Лада ВАЗ VAZ Таз Нива", "http://rustamcolor.ru/viewtopic.php?f=13&t=3040#p20647");
        modelArrayAddingList.add(model);
        model = new Model("4x4 Urban", "Lada Лада ВАЗ VAZ Таз 4х4 урбан Нива", "http://rustamcolor.ru/viewtopic.php?f=13&t=1574#p7036");
        modelArrayAddingList.add(model);
        model = new Model("Kalina", "Lada Лада ВАЗ VAZ Таз Калина", "http://rustamcolor.ru/viewtopic.php?f=13&t=96#p1361");
        modelArrayAddingList.add(model);
        model = new Model("Kalina 2", "Lada Лада ВАЗ VAZ Таз Калина", "http://rustamcolor.ru/viewtopic.php?f=13&t=94#p1329");
        modelArrayAddingList.add(model);
        model = new Model("Kalina Cross", "Lada Лада ВАЗ VAZ Таз Калина Кросс", "http://rustamcolor.ru/viewtopic.php?f=13&t=1432#p6370");
        modelArrayAddingList.add(model);
        model = new Model("Priora  (2170/2171/2172)", "Lada Лада ВАЗ VAZ Таз Приора", "http://rustamcolor.ru/viewtopic.php?f=13&t=92#p1277");
        modelArrayAddingList.add(model);
        model = new Model("Samara  (2113/2114/2115)", "Lada Лада ВАЗ VAZ Таз Самара", "http://rustamcolor.ru/viewtopic.php?f=13&t=2926#p19848");
        modelArrayAddingList.add(model);
        model = new Model("Largus", "Lada Лада ВАЗ VAZ Таз Ларгус", "http://rustamcolor.ru/viewtopic.php?f=13&t=23#p305");
        modelArrayAddingList.add(model);
        model = new Model("Granta Ижевск", "Lada Лада ВАЗ VAZ Таз Гранта", "http://rustamcolor.ru/viewtopic.php?f=13&t=31#p407");
        modelArrayAddingList.add(model);
        model = new Model("Granta Тольятти", "Lada Лада ВАЗ VAZ Таз Гранта", "http://rustamcolor.ru/viewtopic.php?f=13&t=32#p426");
        modelArrayAddingList.add(model);

        vendor = new Vendor("Lada", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("", modelArrayAddingList);
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
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);


        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);


        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);


        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);


        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);


        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);


        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);


        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("", modelArrayAddingList);
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


        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);


        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);


        modelArrayAddingList = new ArrayList<Model>();
        model = new Model("", "", "");
        modelArrayAddingList.add(model);

        vendor = new Vendor("", modelArrayAddingList);
        vendorArrayAddingList.add(vendor);

    }

}

package com.cdiamon.autocolorist.explistview;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.SearchView;

import com.cdiamon.autocolorist.R;

import java.util.ArrayList;

public class SearchGallery extends AppCompatActivity implements SearchView.OnQueryTextListener, SearchView.OnCloseListener {

    // TODO send info url of car pics
    // Intent myIntent = new Intent(CurrentActivity.this, NextActivity.class);
    //    myIntent.putExtra("key", value); //Optional parameters
    //    CurrentActivity.this.startActivity(myIntent);
    //    Extras are retrieved on the other side via:
    //
    //    @Override
    //    protected void onCreate(Bundle savedInstanceState) {
    //        Intent intent = getIntent();
    //        String value = intent.getStringExtra("key"); //if it's a string you stored.
    //    }

    private SearchView searchview;
    public static MyListAdapter myListAdapterClass;
    private ExpandableListView expandablelistview;
    private ArrayList<Vendor> vendorarraylist = new ArrayList<Vendor>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_gallery);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        searchview = (SearchView) findViewById(R.id.searchviewid);
        searchview.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchview.setIconifiedByDefault(false);
        searchview.setOnQueryTextListener(this);
        searchview.setOnCloseListener(this);

        //display the list
        displayList();
        //expand all Groups
        expandAllGroups();


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    //method to expand all groups
    private void expandAllGroups() {
        int count = myListAdapterClass.getGroupCount();
        for (int i = 0; i < count; i++) {
            expandablelistview.expandGroup(i);
        }
    }

    //method to expand all groups
    private void displayList() {

        //display the list
        loadSomeData();

        //get reference to the ExpandableListView
        expandablelistview = (ExpandableListView) findViewById(R.id.expandableList);
        //create the adapter by passing your ArrayList data
        myListAdapterClass = new MyListAdapter(SearchGallery.this, vendorarraylist);
        //attach the adapter to the list
        expandablelistview.setAdapter(myListAdapterClass);

        expandablelistview.setOnChildClickListener(myListAdapterClass);

    }

    private void loadSomeData() {

        ArrayList<Model> modelList = new ArrayList<Model>();
        Model model = new Model("Ceed  (ED/ED FL)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=2226#p10880");
        modelList.add(model);
        model = new Model("Ceed 2  (JD)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=97#p1392");
        modelList.add(model);
        model = new Model("Cerato 2  (TD)", "Kia", "http://rustamcolor.ru/viewtopic.php?f=13&t=91#p1259");
        modelList.add(model);
        Vendor vendor = new Vendor("KIA", modelList);
        vendorarraylist.add(vendor);

        modelList = new ArrayList<Model>();
        model = new Model("2  (DE)", "Mazda", "2 2 2");
        modelList.add(model);
        model = new Model("3  (BK)", "Mazda", "3 3 3");
        modelList.add(model);
        model = new Model("3  (BL)", "Mazda", "3 q w");
        modelList.add(model);
        vendor = new Vendor("Mazda", modelList);
        vendorarraylist.add(vendor);

        modelList = new ArrayList<Model>();
        model = new Model("Avensis 2  (T250)", "Toyota", "av 2 2");
        modelList.add(model);
        model = new Model("Avensis 3  (T27)", "Toyota", "av 3 3");
        modelList.add(model);
        model = new Model("Auris (E150)", "Toyota", "au au");
        modelList.add(model);
        vendor = new Vendor("Toyota", modelList);
        vendorarraylist.add(vendor);

    }

    @Override
    public boolean onClose() {
        myListAdapterClass.filterData("");
        expandAllGroups();
        return false;
    }

    @Override
    public boolean onQueryTextChange(String query) {
        myListAdapterClass.filterData(query);
        expandAllGroups();
        return false;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        myListAdapterClass.filterData(query);
        expandAllGroups();
        return false;
    }

}

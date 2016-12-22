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

import java.net.URL;
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

    private SearchView search;
    public static MyListAdapter listAdapter;
    private ExpandableListView myList;
    private ArrayList<Vendor> vendorList = new ArrayList<Vendor>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_gallery);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        search = (SearchView) findViewById(R.id.search);
        search.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        search.setIconifiedByDefault(false);
        search.setOnQueryTextListener(this);
        search.setOnCloseListener(this);

        //display the list
        displayList();
        //expand all Groups
        expandAll();



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
    private void expandAll() {
        int count = listAdapter.getGroupCount();
        for (int i = 0; i < count; i++) {
            myList.expandGroup(i);
        }
    }

    //method to expand all groups
    private void displayList() {

        //display the list
        loadSomeData();

        //get reference to the ExpandableListView
        myList = (ExpandableListView) findViewById(R.id.expandableList);
        //create the adapter by passing your ArrayList data
        listAdapter = new MyListAdapter(SearchGallery.this, vendorList);
        //attach the adapter to the list
        myList.setAdapter(listAdapter);

        myList.setOnChildClickListener(listAdapter);

    }

    private void loadSomeData() {

        ArrayList<Model> modelList = new ArrayList<Model>();
        Model model = new Model("2  (DE)", "Mazda", "http://ya.ru");
        modelList.add(model);
        model = new Model("3  (BK)", "Mazda", "");
        modelList.add(model);
        model = new Model("3  (BL)", "Mazda", "");
        modelList.add(model);

        Vendor vendor = new Vendor("Mazda", modelList);
        vendorList.add(vendor);

        modelList = new ArrayList<Model>();
        model = new Model("Avensis 2  (T250)", "Toyota", "");
        modelList.add(model);
        model = new Model("Avensis 3  (T27)", "Toyota", "");
        modelList.add(model);
        model = new Model("Auris (E150)", "Toyota", "");
        modelList.add(model);

        vendor = new Vendor("Toyota", modelList);
        vendorList.add(vendor);

    }

    @Override
    public boolean onClose() {
        listAdapter.filterData("");
        expandAll();
        return false;
    }

    @Override
    public boolean onQueryTextChange(String query) {
        listAdapter.filterData(query);
        expandAll();
        return false;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        listAdapter.filterData(query);
        expandAll();
        return false;
    }

}

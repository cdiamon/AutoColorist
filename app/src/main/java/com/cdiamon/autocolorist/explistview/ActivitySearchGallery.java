package com.cdiamon.autocolorist.explistview;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.SearchView;

import com.cdiamon.autocolorist.R;

public class ActivitySearchGallery extends AppCompatActivity implements SearchView.OnQueryTextListener, SearchView.OnCloseListener {

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

    private static MyListAdapter myListAdapterClass;
    private ExpandableListView expandableListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_gallery);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) findViewById(R.id.searchviewid);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setIconifiedByDefault(false);
        searchView.setOnQueryTextListener(this);
        searchView.setOnCloseListener(this);

        //display the list
        displayList();
        //expand all Groups
//        expandAllGroups();


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, R.string.SnackbarViewText, Snackbar.LENGTH_LONG)
                        .setAction(R.string.SnackbarActionText, new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent Email = new Intent(Intent.ACTION_SEND);
                                startActivity(Intent.createChooser(Email, "Send Feedback:"));
                                Email.setType("text/email");
                                Email.putExtra(Intent.EXTRA_EMAIL,
                                        new String[]{"padmitriy@gmail.com"});  //developer 's email
                                Email.putExtra(Intent.EXTRA_SUBJECT,
                                        getString(R.string.SnackbarEmailTitle)); // Email 's Subject
                                Email.putExtra(Intent.EXTRA_TEXT, getString(R.string.SnackbarEmailBody));  //Email 's Greeting text
                                startActivity(Intent.createChooser(Email, "Send Feedback:"));
                            }
                        }).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    //method to expand all groups
    private void expandAllGroups() {
        int count = myListAdapterClass.getGroupCount();
        for (int i = 0; i < count; i++) {
            expandableListView.expandGroup(i);
        }
    }

    private final LoadData loadData = new LoadData();

    //method to expand all groups
    private void displayList() {

        //display the list
        loadData.loadSomeData();

        //get reference to the ExpandableListView
        expandableListView = (ExpandableListView) findViewById(R.id.expandableList);
        //create the adapter by passing your ArrayList data
        myListAdapterClass = new MyListAdapter(ActivitySearchGallery.this, loadData.vendorArrayAddingList);
        //attach the adapter to the list
        expandableListView.setAdapter(myListAdapterClass);

        expandableListView.setOnChildClickListener(myListAdapterClass);

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

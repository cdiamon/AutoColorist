package com.cdiamon.autocolorist.explistview;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ExpandableListView;
import android.widget.SearchView;

import com.cdiamon.autocolorist.R;

public class ActivitySearchGallery extends AppCompatActivity implements SearchView.OnQueryTextListener, SearchView.OnCloseListener {


    private MyListAdapter myListAdapterClass;
    private ExpandableListView expandableListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_gallery);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = findViewById(R.id.searchviewid);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setIconifiedByDefault(false);
        searchView.setOnQueryTextListener(this);
        searchView.setOnCloseListener(this);

        displayList();

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> Snackbar.make(view, R.string.SnackbarViewText, Snackbar.LENGTH_LONG)
                .setAction(R.string.SnackbarActionText, view1 -> {
                    Intent emailIntent = new Intent(Intent.ACTION_SEND);
                    startActivity(Intent.createChooser(emailIntent, "Send Feedback:"));
                    emailIntent.setType("text/email");
                    emailIntent.putExtra(Intent.EXTRA_EMAIL,
                            new String[]{"padmitriy@gmail.com"});  //developer 's email
                    emailIntent.putExtra(Intent.EXTRA_SUBJECT,
                            getString(R.string.SnackbarEmailTitle)); // Email 's Subject
                    emailIntent.putExtra(Intent.EXTRA_TEXT, getString(R.string.SnackbarEmailBody));  //Email 's Greeting text
                    startActivity(Intent.createChooser(emailIntent, "Send Feedback:"));
                }).show());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void expandAllGroups() {
        int count = myListAdapterClass.getGroupCount();
        for (int i = 0; i < count; i++) {
            expandableListView.expandGroup(i);
        }
    }

    private void collapseAllGroups() {
        int count = myListAdapterClass.getGroupCount();
        for (int i = 0; i < count; i++) {
            expandableListView.collapseGroup(i);
        }
    }

    private final LoadData loadData = new LoadData();

    private void displayList() {

        //display the list
        loadData.loadSomeData();

        //get reference to the ExpandableListView
        expandableListView = findViewById(R.id.expandableList);
        //create the adapter by passing your ArrayList data
        myListAdapterClass = new MyListAdapter(ActivitySearchGallery.this, loadData.getVendorArrayAddingList());
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
        if (query.length() == 0) {
            collapseAllGroups();
        } else {
            expandAllGroups();
        }
        return false;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        myListAdapterClass.filterData(query);
        expandAllGroups();
        return false;
    }

}

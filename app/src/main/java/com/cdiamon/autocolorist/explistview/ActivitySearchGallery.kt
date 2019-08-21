package com.cdiamon.autocolorist.explistview

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ExpandableListView
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.cdiamon.autocolorist.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class ActivitySearchGallery : AppCompatActivity(),
        SearchView.OnQueryTextListener,
        SearchView.OnCloseListener {


    private var myListAdapterClass: MyListAdapter? = null
    private var expandableListView: ExpandableListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_gallery)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val searchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        val searchView = findViewById<SearchView>(R.id.searchviewid)
        searchView.setSearchableInfo(searchManager.getSearchableInfo(componentName))
        searchView.setIconifiedByDefault(false)
        searchView.setOnQueryTextListener(this)
        searchView.setOnCloseListener(this)

        displayList()

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, R.string.SnackbarViewText, Snackbar.LENGTH_LONG)
                    .setAction(R.string.SnackbarActionText) {
                        val emailIntent = Intent(Intent.ACTION_SEND)
                        startActivity(Intent.createChooser(emailIntent, "Send Feedback:"))
                        emailIntent.type = "text/email"
                        emailIntent.putExtra(Intent.EXTRA_EMAIL,
                                "padmitriy@gmail.com")
                        emailIntent.putExtra(Intent.EXTRA_SUBJECT,
                                getString(R.string.SnackbarEmailTitle)) // Subject
                        emailIntent.putExtra(Intent.EXTRA_TEXT, getString(R.string.SnackbarEmailBody))
                        startActivity(Intent.createChooser(emailIntent, "Send Feedback:"))
                    }.show()
        }
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    private fun expandAllGroups() {
        val count = myListAdapterClass!!.groupCount
        for (i in 0 until count) {
            expandableListView!!.expandGroup(i)
        }
    }

    private fun collapseAllGroups() {
        val count = myListAdapterClass!!.groupCount
        for (i in 0 until count) {
            expandableListView!!.collapseGroup(i)
        }
    }

    private fun displayList() {
        val loadData = LoadData()

        //display the list
//        loadData.loadSomeData()

        //get reference to the ExpandableListView
        expandableListView = findViewById(R.id.expandableList)
        //create the adapter by passing your ArrayList data
        myListAdapterClass = MyListAdapter(this@ActivitySearchGallery, loadData.loadSomeData())
        //attach the adapter to the list
        expandableListView!!.setAdapter(myListAdapterClass)

        expandableListView!!.setOnChildClickListener(myListAdapterClass)

    }


    override fun onClose(): Boolean {
        myListAdapterClass!!.filterData("")
        expandAllGroups()
        return false
    }

    override fun onQueryTextChange(query: String): Boolean {
        myListAdapterClass!!.filterData(query)
        if (query.isEmpty()) {
            collapseAllGroups()
        } else {
            expandAllGroups()
        }
        return false
    }

    override fun onQueryTextSubmit(query: String): Boolean {
        myListAdapterClass!!.filterData(query)
        expandAllGroups()
        return false
    }

}

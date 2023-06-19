package com.cdiamon.autocolorist.explistview

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import com.cdiamon.autocolorist.R
import com.cdiamon.autocolorist.databinding.ActivitySearchGalleryBinding
import com.google.android.material.snackbar.Snackbar

class SearchGalleryActivity : AppCompatActivity(),
    SearchView.OnQueryTextListener,
    SearchView.OnCloseListener {


    private var myListAdapterClass: MyListAdapter? = null

    private lateinit var binding: ActivitySearchGalleryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchGalleryBinding.inflate(layoutInflater)

        setSupportActionBar(binding.toolbar)

        val searchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        binding.searchContainer.searchView.setSearchableInfo(
            searchManager.getSearchableInfo(
                componentName
            )
        )
        binding.searchContainer.searchView.setIconifiedByDefault(false)
        binding.searchContainer.searchView.setOnQueryTextListener(this)
        binding.searchContainer.searchView.setOnCloseListener(this)

        displayList()

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, R.string.SnackbarViewText, Snackbar.LENGTH_LONG)
                .setAction(R.string.SnackbarActionText) {
                    val emailIntent = Intent(Intent.ACTION_SEND)
                    startActivity(Intent.createChooser(emailIntent, "Send Feedback:"))
                    emailIntent.type = "text/email"
                    emailIntent.putExtra(
                        Intent.EXTRA_EMAIL,
                        "padmitriy@gmail.com"
                    )
                    emailIntent.putExtra(
                        Intent.EXTRA_SUBJECT,
                        getString(R.string.SnackbarEmailTitle)
                    ) // Subject
                    emailIntent.putExtra(Intent.EXTRA_TEXT, getString(R.string.SnackbarEmailBody))
                    startActivity(Intent.createChooser(emailIntent, "Send Feedback:"))
                }.show()
        }
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        setContentView(binding.root)
    }

    private fun expandAllGroups() {
        val count = myListAdapterClass!!.groupCount
        for (i in 0 until count) {
            binding.searchContainer.expandableList.expandGroup(i)
        }
    }

    private fun collapseAllGroups() {
        val count = myListAdapterClass!!.groupCount
        for (i in 0 until count) {
            binding.searchContainer.expandableList.collapseGroup(i)
        }
    }

    private fun displayList() {
        val carsDataRepository = CarsDataRepository()

        //create the adapter by passing your ArrayList data
        myListAdapterClass =
            MyListAdapter(this@SearchGalleryActivity, carsDataRepository.getCarsData())
        //attach the adapter to the list
        binding.searchContainer.expandableList.setAdapter(myListAdapterClass)

        binding.searchContainer.expandableList.setOnChildClickListener(myListAdapterClass)

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

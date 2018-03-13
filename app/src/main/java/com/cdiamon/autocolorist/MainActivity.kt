package com.cdiamon.autocolorist

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.NavigationView
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.cdiamon.autocolorist.R.id.fab
import com.cdiamon.autocolorist.fragments.*

class MainActivity : AppCompatActivity(),
        NavigationView.OnNavigationItemSelectedListener,
        NewFragment.OnFragmentInteractionListener,
        TablesFragment.OnFragmentInteractionListener,
        OsvaldFragment.OnFragmentInteractionListener,
        MapsFragment.OnFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, OsvaldFragment.newInstance()).commit()

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, R.string.SnackbarViewText, Snackbar.LENGTH_LONG)
                    .setAction(R.string.SnackbarActionText) {
                        val emailIntent = Intent(Intent.ACTION_SEND)
                        startActivity(Intent.createChooser(emailIntent, "Send Feedback:"))
                        emailIntent.type = "text/email"
                        emailIntent.putExtra(Intent.EXTRA_EMAIL,
                                arrayOf("padmitriy@gmail.com"))
                        emailIntent.putExtra(Intent.EXTRA_SUBJECT,
                                getString(R.string.SnackbarEmailTitle))
                        emailIntent.putExtra(Intent.EXTRA_TEXT, getString(R.string.SnackbarEmailBody))
                        startActivity(Intent.createChooser(emailIntent, "Send Feedback:"))
                    }.show()
        }


        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        val toggle = ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer.addDrawerListener(toggle)
        toggle.syncState()
        //first time..
        drawer.openDrawer(GravityCompat.START)

        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)

    }

    override fun onBackPressed() {
        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        when (id) {
            R.id.action_settings -> {
                //             startActivity(new Intent(getApplicationContext(), WHAT.class));
                Toast.makeText(applicationContext, R.string.mainToastSettings, Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.menu_calculator -> {
                val intent = Intent()
                intent.action = Intent.ACTION_MAIN
                intent.addCategory(Intent.CATEGORY_APP_CALCULATOR)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(intent)
                Toast.makeText(applicationContext, R.string.mainToastCalc, Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.menu_calendar -> {
                val intent = Intent()
                intent.action = Intent.ACTION_MAIN
                intent.addCategory(Intent.CATEGORY_APP_CALENDAR)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(intent)
                Toast.makeText(applicationContext, R.string.mainToastCalendar, Toast.LENGTH_SHORT).show()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var fragment: Fragment? = null

        val id = item.itemId

        when (id) {
            R.id.nav_circle -> fragment = OsvaldFragment.newInstance()
            R.id.nav_gallery -> fragment = GalleryFragment.newInstance()
            R.id.nav_slideshow -> fragment = TablesFragment.newInstance()
            R.id.nav_school -> fragment = EducationFragment.newInstance()
            R.id.nav_maps -> fragment = MapsFragment.newInstance()
            R.id.nav_manage -> {
                fragment = NewFragment.newInstance()
                Toast.makeText(applicationContext, R.string.MainActivityToastToInstruments, Toast.LENGTH_SHORT).show()
            }
            R.id.nav_share -> {

                val sharingIntent = Intent(android.content.Intent.ACTION_SEND)
                sharingIntent.type = "text/plain"
                val shareBody = "Приложение для колористов\nскачать бесплатно\nhttps://cdiamon.github.io/AutoColorist/"
                val shareSub = "Your subject here"
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub)
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody)
                startActivity(Intent.createChooser(sharingIntent, "Share using"))
                return true
            }
            R.id.nav_send -> {
                fragment = NewFragment.newInstance()
                Toast.makeText(applicationContext, R.string.MainActivityToastToSend, Toast.LENGTH_SHORT).show()
            }
        //now hoghlighting selected menu in left bar
        //show selected item name in top
        }

        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.container, fragment).commit()
        //now highlighting selected menu in left bar
        item.isChecked = true
        //show selected item name in top
        title = item.title

        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        drawer.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onFragmentInteraction(uri: Uri) {
        //TODO later upgrades
    }
}

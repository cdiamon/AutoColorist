package com.cdiamon.autocolorist

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.cdiamon.autocolorist.databinding.ActivityMainBinding
import com.cdiamon.autocolorist.fragments.EducationFragment
import com.cdiamon.autocolorist.fragments.GalleryFragment
import com.cdiamon.autocolorist.fragments.MapsFragment
import com.cdiamon.autocolorist.fragments.NewFragment
import com.cdiamon.autocolorist.fragments.OsvaldFragment
import com.cdiamon.autocolorist.fragments.TablesFragment
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(),
    NavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setSupportActionBar(binding.appBarInclude.toolbar)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, OsvaldFragment.newInstance()).commit()

        binding.appBarInclude.fab.setOnClickListener { view ->
            Snackbar.make(view, R.string.SnackbarViewText, Snackbar.LENGTH_LONG)
                .setAction(R.string.SnackbarActionText) {
                    val emailIntent = Intent(Intent.ACTION_SEND)
                    startActivity(Intent.createChooser(emailIntent, "Send Feedback:"))
                    emailIntent.type = "text/email"
                    emailIntent.putExtra(
                        Intent.EXTRA_EMAIL,
                        arrayOf("padmitriy@gmail.com")
                    )
                    emailIntent.putExtra(
                        Intent.EXTRA_SUBJECT,
                        getString(R.string.SnackbarEmailTitle)
                    )
                    emailIntent.putExtra(Intent.EXTRA_TEXT, getString(R.string.SnackbarEmailBody))
                    startActivity(Intent.createChooser(emailIntent, "Send Feedback:"))
                }.show()
        }

        val toggle = ActionBarDrawerToggle(
            this,
            binding.drawerLayout,
            binding.appBarInclude.toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        //first time..
        binding.drawerLayout.openDrawer(GravityCompat.START)
        binding.navView.setNavigationItemSelectedListener(this)

        setContentView(binding.root)
    }

    override fun onBackPressed() {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START)
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

        when (item.itemId) {
            R.id.action_settings -> {
                //             startActivity(new Intent(getApplicationContext(), WHAT.class));
                Toast.makeText(this, R.string.mainToastSettings, Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.menu_calculator -> {
                val intent = Intent()
                intent.action = Intent.ACTION_MAIN
                intent.addCategory(Intent.CATEGORY_APP_CALCULATOR)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                try {
                    startActivity(intent)
                    Toast.makeText(this, R.string.mainToastCalc, Toast.LENGTH_SHORT).show()
                } catch (e: Exception) {
                    Toast.makeText(this, getString(R.string.calcNotFound), Toast.LENGTH_SHORT)
                        .show()
                }
                return true
            }

            R.id.menu_calendar -> {
                val intent = Intent()
                intent.action = Intent.ACTION_MAIN
                intent.addCategory(Intent.CATEGORY_APP_CALENDAR)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(intent)
                Toast.makeText(this, R.string.mainToastCalendar, Toast.LENGTH_SHORT).show()
                return true
            }

            else -> return super.onOptionsItemSelected(item)
        }

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var fragment: Fragment? = null

        when (item.itemId) {
            R.id.nav_circle -> fragment = OsvaldFragment.newInstance()
            R.id.nav_gallery -> fragment = GalleryFragment.newInstance()
            R.id.nav_slideshow -> fragment = TablesFragment.newInstance()
            R.id.nav_school -> fragment = EducationFragment.newInstance()
            R.id.nav_maps -> fragment = MapsFragment.newInstance()
            R.id.nav_manage -> {
                fragment = NewFragment.newInstance()
                Toast.makeText(this, R.string.MainActivityToastToInstruments, Toast.LENGTH_SHORT)
                    .show()
            }

            R.id.nav_share -> {

                val sharingIntent = Intent(Intent.ACTION_SEND)
                sharingIntent.type = "text/plain"
                val shareBody =
                    "Приложение для колористов\nскачать бесплатно\nhttps://cdiamon.github.io/AutoColorist/"
                val shareSub = "Your subject here"
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub)
                sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody)
                startActivity(Intent.createChooser(sharingIntent, "Share using"))
                return true
            }

            R.id.nav_send -> {
                fragment = NewFragment.newInstance()
                Toast.makeText(this, R.string.MainActivityToastToSend, Toast.LENGTH_SHORT).show()
            }
            //now highlighting selected menu in left bar
            //show selected item name in top
        }

        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.container, fragment!!).commit()
        //now highlighting selected menu in left bar
        item.isChecked = true
        //show selected item name in top
        title = item.title

        binding.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}

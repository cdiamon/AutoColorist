package com.cdiamon.autocolorist;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.cdiamon.autocolorist.fragments.GalleryFragment;
import com.cdiamon.autocolorist.fragments.NewFragment;
import com.cdiamon.autocolorist.fragments.OsvaldFragment;
import com.cdiamon.autocolorist.fragments.TablesFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, NewFragment.OnFragmentInteractionListener, TablesFragment.OnFragmentInteractionListener, GalleryFragment.OnFragmentInteractionListener, OsvaldFragment.OnFragmentInteractionListener {

    public MainActivity() {

    }


    //TODO: isnecessary??? http://stackoverflow.com/questions/28133600/set-initial-fragment-on-startup/34856256#34856256
//    public void setFragment(Fragment fragment) {
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        fragmentManager.beginTransaction().replace(R.id.container, new OsvaldFragment()).commit();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //TODO: is necessary?? http://stackoverflow.com/questions/28133600/set-initial-fragment-on-startup/34856256#34856256
        FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
        tx.replace(R.id.container, new OsvaldFragment());
        tx.commit();

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

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        //first time..
        drawer.openDrawer(GravityCompat.START);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            // startActivity(new Intent(getApplicationContext(), WHAT.class));
            Toast.makeText(getApplicationContext(), R.string.mainToastSettings, Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.menu_calculator) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_APP_CALCULATOR);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), R.string.mainToastCalc, Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.menu_calendar) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_APP_CALENDAR);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), R.string.mainToastCalendar, Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        //here create new fragment
        Fragment fragment = null;
        Class fragmentClass = null;

        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_circle) {
            // Handle the camera action
            fragmentClass = OsvaldFragment.class;
            Toast.makeText(getApplicationContext(), R.string.MainActivityToastToOsvald, Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_gallery) {
            fragmentClass = GalleryFragment.class;
            Toast.makeText(getApplicationContext(), R.string.MainActivityToastToGallery, Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_slideshow) {
            fragmentClass = TablesFragment.class;
            Toast.makeText(getApplicationContext(), R.string.MainActivityToastToTable, Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_manage) {
            fragmentClass = NewFragment.class;
            Toast.makeText(getApplicationContext(), R.string.MainActivityToastToInstruments, Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_share) {
            fragmentClass = OsvaldFragment.class;
            Toast.makeText(getApplicationContext(), R.string.MainActivityToastToShare, Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_send) {
            fragmentClass = OsvaldFragment.class;
            Toast.makeText(getApplicationContext(), R.string.MainActivityToastToSend, Toast.LENGTH_SHORT).show();
        }

        try {
            if (fragmentClass != null) {
                fragment = (Fragment) fragmentClass.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //insert new fragment, changing previous
        FragmentManager fragmentmanager = getSupportFragmentManager();
        fragmentmanager.beginTransaction().replace(R.id.container, fragment).commit();
        //now hoghlighting selected menu in left bar
        item.setChecked(true);
        //show selected item name in top
        setTitle(item.getTitle());

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}

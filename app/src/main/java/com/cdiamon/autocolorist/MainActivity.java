package com.cdiamon.autocolorist;

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
import com.cdiamon.autocolorist.fragments.OsvaldFragment;
import com.cdiamon.autocolorist.fragments.TablesFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, TablesFragment.OnFragmentInteractionListener, GalleryFragment.OnFragmentInteractionListener, OsvaldFragment.OnFragmentInteractionListener {

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
                Snackbar.make(view, "Здесь будет отправка email разработчику", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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


    //TODO: isnecessary??? http://stackoverflow.com/questions/28133600/set-initial-fragment-on-startup/34856256#34856256
//    public void setFragment(Fragment fragment) {
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        fragmentManager.beginTransaction().replace(R.id.container, new OsvaldFragment()).commit();
//    }

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
            Toast.makeText(getApplicationContext(), "Переходим в настройки", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.menu_calculator) {
            // startActivity(new Intent(getApplicationContext(), WHAT.class));
            Toast.makeText(getApplicationContext(), "Переходим в калькулятор", Toast.LENGTH_SHORT).show();
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

        if (id == R.id.nav_camera) {
            // Handle the camera action
            fragmentClass = OsvaldFragment.class;
            Toast.makeText(getApplicationContext(), "Переходим в 1", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_gallery) {
            fragmentClass = GalleryFragment.class;
            Toast.makeText(getApplicationContext(), "Переходим в галерею", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_slideshow) {
            fragmentClass = TablesFragment.class;
            Toast.makeText(getApplicationContext(), "Переходим в 3", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_manage) {
            fragmentClass = OsvaldFragment.class;
            Toast.makeText(getApplicationContext(), "Переходим в 4", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_share) {
            fragmentClass = OsvaldFragment.class;
            Toast.makeText(getApplicationContext(), "Переходим в 5", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_send) {
            fragmentClass = OsvaldFragment.class;
            Toast.makeText(getApplicationContext(), "Переходим в 6", Toast.LENGTH_SHORT).show();
        }

        try {
            fragment = (Fragment) fragmentClass.newInstance();
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

    public MainActivity() {


    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}

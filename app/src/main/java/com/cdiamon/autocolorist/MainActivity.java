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

import com.cdiamon.autocolorist.fragments.EducationFragment;
import com.cdiamon.autocolorist.fragments.GalleryFragment;
import com.cdiamon.autocolorist.fragments.MapsFragment;
import com.cdiamon.autocolorist.fragments.NewFragment;
import com.cdiamon.autocolorist.fragments.OsvaldFragment;
import com.cdiamon.autocolorist.fragments.TablesFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        NewFragment.OnFragmentInteractionListener,
        TablesFragment.OnFragmentInteractionListener,
        OsvaldFragment.OnFragmentInteractionListener,
        MapsFragment.OnFragmentInteractionListener {


//    public void setFragment(Fragment fragment) {
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        fragmentManager.beginTransaction().replace(R.id.container, new OsvaldFragment()).commit();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, OsvaldFragment.newInstance()).commit();

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(view ->
                Snackbar.make(view, R.string.SnackbarViewText, Snackbar.LENGTH_LONG)
                        .setAction(R.string.SnackbarActionText, view1 -> {
                            Intent Email = new Intent(Intent.ACTION_SEND);
                            startActivity(Intent.createChooser(Email, "Send Feedback:"));
                            Email.setType("text/email");
                            Email.putExtra(Intent.EXTRA_EMAIL,
                                    new String[]{"padmitriy@gmail.com"});
                            Email.putExtra(Intent.EXTRA_SUBJECT,
                                    getString(R.string.SnackbarEmailTitle));
                            Email.putExtra(Intent.EXTRA_TEXT, getString(R.string.SnackbarEmailBody));
                            startActivity(Intent.createChooser(Email, "Send Feedback:"));
                        }).show());


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        //first time..
        drawer.openDrawer(GravityCompat.START);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
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
        int id = item.getItemId();

        if (id == R.id.action_settings) {
//             startActivity(new Intent(getApplicationContext(), WHAT.class));
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
        Fragment fragment = null;

        int id = item.getItemId();

        if (id == R.id.nav_circle) {
            fragment = OsvaldFragment.newInstance();
        } else if (id == R.id.nav_gallery) {
            fragment = GalleryFragment.newInstance();
        } else if (id == R.id.nav_slideshow) {
            fragment = TablesFragment.newInstance();
        } else if (id == R.id.nav_school) {
            fragment = EducationFragment.newInstance();
        } else if (id == R.id.nav_maps) {
            fragment = MapsFragment.newInstance();
        } else if (id == R.id.nav_manage) {
            fragment = NewFragment.newInstance();
            Toast.makeText(getApplicationContext(), R.string.MainActivityToastToInstruments, Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_share) {

            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            String shareBody = "Приложение для колористов\nскачать бесплатно\nhttps://cdiamon.github.io/AutoColorist/";
            String shareSub = "Your subject here";
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(sharingIntent, "Share using"));
            return true;
        } else if (id == R.id.nav_send) {
            fragment = NewFragment.newInstance();
            Toast.makeText(getApplicationContext(), R.string.MainActivityToastToSend, Toast.LENGTH_SHORT).show();
        }

        FragmentManager fragmentmanager = getSupportFragmentManager();
        fragmentmanager.beginTransaction().replace(R.id.container, fragment).commit();
        //now hoghlighting selected menu in left bar
        item.setChecked(true);
        //show selected item name in top
        setTitle(item.getTitle());

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        //TODO later upgrades
    }
}

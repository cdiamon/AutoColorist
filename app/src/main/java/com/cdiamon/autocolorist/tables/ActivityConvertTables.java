package com.cdiamon.autocolorist.tables;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.database.sqlite.*;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.cdiamon.autocolorist.R;
import com.cdiamon.autocolorist.explistview.ActivitySearchGallery;
import com.cdiamon.autocolorist.fragments.GalleryFragment;

import java.io.IOException;

public class ActivityConvertTables extends AppCompatActivity {

    Context context;
    DBHelper myDbHelper = new DBHelper(this);

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

//            SQLiteDatabase database = dbHelper.getReadableDatabase();

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_tables);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        try {
            myDbHelper.createDataBase();
        } catch (IOException ioe) {
            throw new Error("Unable to create database");
        }


        Button btn_search = (Button) findViewById(R.id.btn_table_search);
        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    myDbHelper.openDataBase();
                }catch(SQLException sqle){
                    throw sqle;
                }
                myDbHelper.searchData("SH", "511");
                System.out.println(myDbHelper.componentNames.length);


            }
        });

//        try {
//
//            myDbHelper.openDataBase();
//
//        } catch (SQLException sqle) {
//
//            throw sqle;
//
//        }
//
//        myDbHelper.close();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view, "Отправить email разработчику", Snackbar.LENGTH_LONG)
                        .setAction("Отправить", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent Email = new Intent(Intent.ACTION_SEND);
                                startActivity(Intent.createChooser(Email, "Send Feedback:"));
                                Email.setType("text/email");
                                Email.putExtra(Intent.EXTRA_EMAIL,
                                        new String[]{"padmitriy@gmail.com"});  //developer 's email
                                Email.putExtra(Intent.EXTRA_SUBJECT,
                                        "Отзыв/предложение по AutoColorist"); // Email 's Subject
                                Email.putExtra(Intent.EXTRA_TEXT, "Здравствуйте, Дмитрий. " +
                                        "У меня есть исправление/дополнение для вашего приложения AutoColorist.\n" + "");  //Email 's Greeting text
                                startActivity(Intent.createChooser(Email, "Send Feedback:"));
                            }
                        }).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


}

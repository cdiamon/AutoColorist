package com.cdiamon.autocolorist.tables;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.cdiamon.autocolorist.R;

public class ActivityConvertTables extends AppCompatActivity {

    DBHelper dbHelper;

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            SQLiteDatabase database = dbHelper.getReadableDatabase();

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_tables);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


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

        dbHelper = new DBHelper(this);



    }


}

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
import android.widget.EditText;
import android.widget.Toast;

import com.cdiamon.autocolorist.R;
import com.cdiamon.autocolorist.explistview.ActivitySearchGallery;
import com.cdiamon.autocolorist.fragments.GalleryFragment;

import java.io.IOException;

import static com.cdiamon.autocolorist.R.id.textView;

public class ActivityConvertTables extends AppCompatActivity {

    Context context;
    DBHelper myDbHelper = new DBHelper(this);
    String sendComponentName = "";
    String sendVendorName = "";

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

        final Button btn_search = (Button) findViewById(R.id.btn_table_search);
        Button btn_clear = (Button) findViewById(R.id.btn_table_clear);

        final EditText editSH = (EditText) findViewById(R.id.SH);
        final EditText editDuPont = (EditText) findViewById(R.id.DuPont);
        final EditText editProfiline = (EditText) findViewById(R.id.Profiline);
        final EditText editMobihel = (EditText) findViewById(R.id.Mobihel);
        final EditText editNormex = (EditText) findViewById(R.id.Normex);
        final EditText editBrulex = (EditText) findViewById(R.id.Brulex);
        final EditText editChallenger = (EditText) findViewById(R.id.Challenger);
        final EditText editDuxone = (EditText) findViewById(R.id.Duxone);
        final EditText editEasiCoat = (EditText) findViewById(R.id.EasiCoat);
        final EditText editDeBeer = (EditText) findViewById(R.id.DeBeer);
        final EditText editSikkens = (EditText) findViewById(R.id.Sikkens);
        final EditText editKapci = (EditText) findViewById(R.id.Kapci);
        final EditText editVika = (EditText) findViewById(R.id.Vika);
        final EditText editStandox = (EditText) findViewById(R.id.Standox);
        final EditText editLesonal = (EditText) findViewById(R.id.Lesonal);
        final EditText editNoMix = (EditText) findViewById(R.id.NoMix);
        final EditText editReiz = (EditText) findViewById(R.id.Reiz);
        final EditText editPPG = (EditText) findViewById(R.id.PPG);
        final EditText editQuickLine = (EditText) findViewById(R.id.QuickLine);
        final EditText editLechler = (EditText) findViewById(R.id.Lechler);
        final EditText editGreenLine = (EditText) findViewById(R.id.GreenLine);

        try {
            myDbHelper.createDataBase();
        } catch (IOException ioe) {
            throw new Error("Unable to create database");
        }


        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    myDbHelper.openDataBase();
                } catch (SQLException sqle) {
                    throw sqle;
                }

                if (editSH.getText().toString().trim().length() > 0) {
                    sendComponentName = editSH.getText().toString().trim();
                    sendVendorName = "SH";
                    System.out.println(sendVendorName + "  +++++++++++++++++++++++  " + sendComponentName);
                } else if (editDuPont.getText().toString().trim().length() > 0) {
                    sendComponentName = editDuPont.getText().toString().trim();
                    sendVendorName = "DuPont";
                    System.out.println(sendVendorName + "  +++++++++++++++++++++++  " + sendComponentName);
                } else if (editProfiline.getText().toString().trim().length() > 0) {
                    sendComponentName = editProfiline.getText().toString().trim();
                    sendVendorName = "Profiline";
                } else if (editMobihel.getText().toString().trim().length() > 0) {
                    sendComponentName = editMobihel.getText().toString().trim();
                    sendVendorName = "Mobihel";
                } else if (editNormex.getText().toString().trim().length() > 0) {
                    sendComponentName = editNormex.getText().toString().trim();
                    sendVendorName = "Normex";
                } else if (editBrulex.getText().toString().trim().length() > 0) {
                    sendComponentName = editBrulex.getText().toString().trim();
                    sendVendorName = "Brulex";
                } else if (editChallenger.getText().toString().trim().length() > 0) {
                    sendComponentName = editChallenger.getText().toString().trim();
                    sendVendorName = "Challenger";
                } else if (editDuxone.getText().toString().trim().length() > 0) {
                    sendComponentName = editDuxone.getText().toString().trim();
                    sendVendorName = "Duxone";
                } else if (editEasiCoat.getText().toString().trim().length() > 0) {
                    sendComponentName = editEasiCoat.getText().toString().trim();
                    sendVendorName = "EasiCoat";
                } else if (editDeBeer.getText().toString().trim().length() > 0) {
                    sendComponentName = editDeBeer.getText().toString().trim();
                    sendVendorName = "DeBeer";
                } else if (editSikkens.getText().toString().trim().length() > 0) {
                    sendComponentName = editSikkens.getText().toString().trim();
                    sendVendorName = "Sikkens";
                } else if (editKapci.getText().toString().trim().length() > 0) {
                    sendComponentName = editKapci.getText().toString().trim();
                    sendVendorName = "Kapci";
                } else if (editVika.getText().toString().trim().length() > 0) {
                    sendComponentName = editVika.getText().toString().trim();
                    sendVendorName = "Vika";
                } else if (editStandox.getText().toString().trim().length() > 0) {
                    sendComponentName = editStandox.getText().toString().trim();
                    sendVendorName = "Standox";
                } else if (editLesonal.getText().toString().trim().length() > 0) {
                    sendComponentName = editLesonal.getText().toString().trim();
                    sendVendorName = "Lesonal";
                } else if (editNoMix.getText().toString().trim().length() > 0) {
                    sendComponentName = editNoMix.getText().toString().trim();
                    sendVendorName = "NoMix";
                } else if (editReiz.getText().toString().trim().length() > 0) {
                    sendComponentName = editReiz.getText().toString().trim();
                    sendVendorName = "Reiz";
                } else if (editPPG.getText().toString().trim().length() > 0) {
                    sendComponentName = editPPG.getText().toString().trim();
                    sendVendorName = "PPG";
                } else if (editQuickLine.getText().toString().trim().length() > 0) {
                    sendComponentName = editQuickLine.getText().toString().trim();
                    sendVendorName = "QuickLine";
                } else if (editLechler.getText().toString().trim().length() > 0) {
                    sendComponentName = editLechler.getText().toString().trim();
                    sendVendorName = "Lechler";
                } else if (editGreenLine.getText().toString().trim().length() > 0) {
                    sendComponentName = editGreenLine.getText().toString().trim();
                    sendVendorName = "GreenLine";
                }
                else {
                    sendComponentName = "null";
                    sendVendorName = "null";
                    Toast.makeText(getApplicationContext(), "Введите корректный номер компонента в одно из полей и нажмите кнопку поиска", Toast.LENGTH_SHORT).show();
                }

                myDbHelper.searchData(sendVendorName, sendComponentName);
                System.out.println(myDbHelper.componentNames.length);

                editSH.setText(myDbHelper.componentNames[2]);
                editDuPont.setText(myDbHelper.componentNames[3]);
                editProfiline.setText(myDbHelper.componentNames[4]);
                editMobihel.setText(myDbHelper.componentNames[5]);
                editNormex.setText(myDbHelper.componentNames[6]);
                editBrulex.setText(myDbHelper.componentNames[7]);
                editChallenger.setText(myDbHelper.componentNames[8]);
                editDuxone.setText(myDbHelper.componentNames[9]);
                editEasiCoat.setText(myDbHelper.componentNames[10]);
                editDeBeer.setText(myDbHelper.componentNames[11]);
                editSikkens.setText(myDbHelper.componentNames[12]);
                editKapci.setText(myDbHelper.componentNames[13]);
                editVika.setText(myDbHelper.componentNames[14]);
                editStandox.setText(myDbHelper.componentNames[15]);
                editLesonal.setText(myDbHelper.componentNames[16]);
                editNoMix.setText(myDbHelper.componentNames[17]);
                editReiz.setText(myDbHelper.componentNames[18]);
                editPPG.setText(myDbHelper.componentNames[19]);
                editQuickLine.setText(myDbHelper.componentNames[20]);
                editLechler.setText(myDbHelper.componentNames[21]);
                editGreenLine.setText(myDbHelper.componentNames[22]);

                btn_search.setEnabled(false);
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editSH.setText("");
                editDuPont.setText("");
                editProfiline.setText("");
                editMobihel.setText("");
                editNormex.setText("");
                editBrulex.setText("");
                editChallenger.setText("");
                editDuxone.setText("");
                editEasiCoat.setText("");
                editDeBeer.setText("");
                editSikkens.setText("");
                editKapci.setText("");
                editVika.setText("");
                editStandox.setText("");
                editLesonal.setText("");
                editNoMix.setText("");
                editReiz.setText("");
                editPPG.setText("");
                editQuickLine.setText("");
                editLechler.setText("");
                editGreenLine.setText("");

                btn_search.setEnabled(true);
            }
        });

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

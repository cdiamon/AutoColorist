package com.cdiamon.autocolorist.tables

import android.content.Intent
import android.database.SQLException
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.cdiamon.autocolorist.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.content_convert_tables.*
import java.io.IOException

class ActivityConvertTables : AppCompatActivity() {

    private lateinit var myDbHelper: DBHelper
    private var sendComponentName = ""
    private var sendVendorName = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_convert_tables)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        this.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)

        myDbHelper = DBHelper(this)

        try {
            myDbHelper.createDataBase()
        } catch (ioe: IOException) {
            ioe.printStackTrace()
        }

        btn_table_search.setOnClickListener {
            try {
                myDbHelper.openDataBase()
            } catch (sqle: SQLException) {
                sqle.printStackTrace()
            }

            btn_table_search.isEnabled = false

            when {
                editSH.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = editSH.text.toString().trim { it <= ' ' }
                    sendVendorName = "SH"
                }
                editDuPont.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = editDuPont.text.toString().trim { it <= ' ' }
                    sendVendorName = "DuPont"
                }
                editProfiline.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = editProfiline.text.toString().trim { it <= ' ' }
                    sendVendorName = "Profiline"
                }
                editMobihel.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = editMobihel.text.toString().trim { it <= ' ' }
                    sendVendorName = "Mobihel"
                }
                editNormex.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = editNormex.text.toString().trim { it <= ' ' }
                    sendVendorName = "Normex"
                }
                editBrulex.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = editBrulex.text.toString().trim { it <= ' ' }
                    sendVendorName = "Brulex"
                }
                editChallenger.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = editChallenger.text.toString().trim { it <= ' ' }
                    sendVendorName = "Challenger"
                }
                editDuxone.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = editDuxone.text.toString().trim { it <= ' ' }
                    sendVendorName = "Duxone"
                }
                editEasiCoat.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = editEasiCoat.text.toString().trim { it <= ' ' }
                    sendVendorName = "EasiCoat"
                }
                editDeBeer.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = editDeBeer.text.toString().trim { it <= ' ' }
                    sendVendorName = "DeBeer"
                }
                editSikkens.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = editSikkens.text.toString().trim { it <= ' ' }
                    sendVendorName = "Sikkens"
                }
                editKapci.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = editKapci.text.toString().trim { it <= ' ' }
                    sendVendorName = "Kapci"
                }
                editVika.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = editVika.text.toString().trim { it <= ' ' }
                    sendVendorName = "Vika"
                }
                editStandox.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = editStandox.text.toString().trim { it <= ' ' }
                    sendVendorName = "Standox"
                }
                editLesonal.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = editLesonal.text.toString().trim { it <= ' ' }
                    sendVendorName = "Lesonal"
                }
                editNoMix.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = editNoMix.text.toString().trim { it <= ' ' }
                    sendVendorName = "NoMix"
                }
                editReiz.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = editReiz.text.toString().trim { it <= ' ' }
                    sendVendorName = "Reiz"
                }
                editPPG.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = editPPG.text.toString().trim { it <= ' ' }
                    sendVendorName = "PPG"
                }
                editQuickLine.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = editQuickLine.text.toString().trim { it <= ' ' }
                    sendVendorName = "QuickLine"
                }
                editLechler.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = editLechler.text.toString().trim { it <= ' ' }
                    sendVendorName = "Lechler"
                }
                editGreenLine.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = editGreenLine.text.toString().trim { it <= ' ' }
                    sendVendorName = "GreenLine"
                }
                else -> {
                    sendComponentName = "null"
                    sendVendorName = "null"
                    Toast.makeText(applicationContext, R.string.tableToastInputCorrect, Toast.LENGTH_SHORT).show()
                    btn_table_search.isEnabled = true
                }
            }

            val componentNames: Array<String?> = myDbHelper.searchData(sendVendorName, sendComponentName)

            println(componentNames.size)

            editSH.setText(componentNames[2])
            editDuPont.setText(componentNames[3])
            editProfiline.setText(componentNames[4])
            editMobihel.setText(componentNames[5])
            editNormex.setText(componentNames[6])
            editBrulex.setText(componentNames[7])
            editChallenger.setText(componentNames[8])
            editDuxone.setText(componentNames[9])
            editEasiCoat.setText(componentNames[10])
            editDeBeer.setText(componentNames[11])
            editSikkens.setText(componentNames[12])
            editKapci.setText(componentNames[13])
            editVika.setText(componentNames[14])
            editStandox.setText(componentNames[15])
            editLesonal.setText(componentNames[16])
            editNoMix.setText(componentNames[17])
            editReiz.setText(componentNames[18])
            editPPG.setText(componentNames[19])
            editQuickLine.setText(componentNames[20])
            editLechler.setText(componentNames[21])
            editGreenLine.setText(componentNames[22])

            for (i in componentNames.indices) {
                componentNames[i] = ""
            }
        }

        btn_table_clear.setOnClickListener {
            editSH.setText("")
            editDuPont.setText("")
            editProfiline.setText("")
            editMobihel.setText("")
            editNormex.setText("")
            editBrulex.setText("")
            editChallenger.setText("")
            editDuxone.setText("")
            editEasiCoat.setText("")
            editDeBeer.setText("")
            editSikkens.setText("")
            editKapci.setText("")
            editVika.setText("")
            editStandox.setText("")
            editLesonal.setText("")
            editNoMix.setText("")
            editReiz.setText("")
            editPPG.setText("")
            editQuickLine.setText("")
            editLechler.setText("")
            editGreenLine.setText("")

            btn_table_search.isEnabled = true
        }

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, R.string.SnackbarViewText, Snackbar.LENGTH_LONG)
                    .setAction(R.string.SnackbarActionText) {
                        val intentEmail = Intent(Intent.ACTION_SEND)
                        startActivity(Intent.createChooser(intentEmail, "Send Feedback:"))
                        intentEmail.type = "text/email"
                        intentEmail.putExtra(Intent.EXTRA_EMAIL, arrayOf("padmitriy@gmail.com"))
                        intentEmail.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.SnackbarEmailTitle))
                        intentEmail.putExtra(Intent.EXTRA_TEXT, getString(R.string.SnackbarEmailBody))
                        startActivity(Intent.createChooser(intentEmail, "Send Feedback:"))
                    }.show()
        }
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

    }
}

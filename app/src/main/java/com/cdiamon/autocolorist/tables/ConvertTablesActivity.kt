package com.cdiamon.autocolorist.tables

import android.content.Intent
import android.database.SQLException
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.cdiamon.autocolorist.R
import com.cdiamon.autocolorist.databinding.ActivityConvertTablesBinding
import com.cdiamon.autocolorist.databinding.ContentConvertTablesBinding
import com.google.android.material.snackbar.Snackbar
import java.io.IOException

class ConvertTablesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConvertTablesBinding

    private lateinit var myDbHelper: DBHelper
    private var sendComponentName = ""
    private var sendVendorName = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConvertTablesBinding.inflate(layoutInflater)

        setSupportActionBar(binding.toolbar)
        this.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)

        setViews()

        binding.fab.setOnClickListener { view ->
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

        setContentView(binding.root)
    }

    private fun setViews() {
        myDbHelper = DBHelper(this)

        try {
            myDbHelper.createDataBase()
        } catch (ioe: IOException) {
            ioe.printStackTrace()
        }

        val convBinding = binding.converterContainer

        convBinding.tableSearchBtn.setOnClickListener {
            try {
                myDbHelper.openDataBase()
            } catch (sqle: SQLException) {
                sqle.printStackTrace()
            }

            convBinding.tableSearchBtn.isEnabled = false

            when {
                convBinding.editSH.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = convBinding.editSH.text.toString().trim { it <= ' ' }
                    sendVendorName = "SH"
                }
                convBinding.editDuPont.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = convBinding.editDuPont.text.toString().trim { it <= ' ' }
                    sendVendorName = "DuPont"
                }
                convBinding.editProfiline.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = convBinding.editProfiline.text.toString().trim { it <= ' ' }
                    sendVendorName = "Profiline"
                }
                convBinding.editMobihel.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = convBinding.editMobihel.text.toString().trim { it <= ' ' }
                    sendVendorName = "Mobihel"
                }
                convBinding.editNormex.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = convBinding.editNormex.text.toString().trim { it <= ' ' }
                    sendVendorName = "Normex"
                }
                convBinding.editBrulex.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = convBinding.editBrulex.text.toString().trim { it <= ' ' }
                    sendVendorName = "Brulex"
                }
                convBinding.editChallenger.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = convBinding.editChallenger.text.toString().trim { it <= ' ' }
                    sendVendorName = "Challenger"
                }
                convBinding.editDuxone.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = convBinding.editDuxone.text.toString().trim { it <= ' ' }
                    sendVendorName = "Duxone"
                }
                convBinding.editEasiCoat.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = convBinding.editEasiCoat.text.toString().trim { it <= ' ' }
                    sendVendorName = "EasiCoat"
                }
                convBinding.editDeBeer.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = convBinding.editDeBeer.text.toString().trim { it <= ' ' }
                    sendVendorName = "DeBeer"
                }
                convBinding.editSikkens.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = convBinding.editSikkens.text.toString().trim { it <= ' ' }
                    sendVendorName = "Sikkens"
                }
                convBinding.editKapci.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = convBinding.editKapci.text.toString().trim { it <= ' ' }
                    sendVendorName = "Kapci"
                }
                convBinding.editVika.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = convBinding.editVika.text.toString().trim { it <= ' ' }
                    sendVendorName = "Vika"
                }
                convBinding.editStandox.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = convBinding.editStandox.text.toString().trim { it <= ' ' }
                    sendVendorName = "Standox"
                }
                convBinding.editLesonal.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = convBinding.editLesonal.text.toString().trim { it <= ' ' }
                    sendVendorName = "Lesonal"
                }
                convBinding.editNoMix.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = convBinding.editNoMix.text.toString().trim { it <= ' ' }
                    sendVendorName = "NoMix"
                }
                convBinding.editReiz.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = convBinding.editReiz.text.toString().trim { it <= ' ' }
                    sendVendorName = "Reiz"
                }
                convBinding.editPPG.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = convBinding.editPPG.text.toString().trim { it <= ' ' }
                    sendVendorName = "PPG"
                }
                convBinding.editQuickLine.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = convBinding.editQuickLine.text.toString().trim { it <= ' ' }
                    sendVendorName = "QuickLine"
                }
                convBinding.editLechler.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = convBinding.editLechler.text.toString().trim { it <= ' ' }
                    sendVendorName = "Lechler"
                }
                convBinding.editGreenLine.text.toString().trim { it <= ' ' }.isNotEmpty() -> {
                    sendComponentName = convBinding.editGreenLine.text.toString().trim { it <= ' ' }
                    sendVendorName = "GreenLine"
                }
                else -> {
                    sendComponentName = "null"
                    sendVendorName = "null"
                    Toast.makeText(applicationContext, R.string.tableToastInputCorrect, Toast.LENGTH_SHORT).show()
                    convBinding.tableSearchBtn.isEnabled = true
                }
            }

            val componentNames: Array<String?> = myDbHelper.searchData(sendVendorName, sendComponentName)

            if (componentNames.all { it.isNullOrBlank() }) {
                Toast.makeText(this, getString(R.string.no_data_found), Toast.LENGTH_LONG).show()
                clearData(convBinding)
                return@setOnClickListener
            }

            convBinding.editSH.setText(componentNames[2])
            convBinding.editDuPont.setText(componentNames[3])
            convBinding.editProfiline.setText(componentNames[4])
            convBinding.editMobihel.setText(componentNames[5])
            convBinding.editNormex.setText(componentNames[6])
            convBinding.editBrulex.setText(componentNames[7])
            convBinding.editChallenger.setText(componentNames[8])
            convBinding.editDuxone.setText(componentNames[9])
            convBinding.editEasiCoat.setText(componentNames[10])
            convBinding.editDeBeer.setText(componentNames[11])
            convBinding.editSikkens.setText(componentNames[12])
            convBinding.editKapci.setText(componentNames[13])
            convBinding.editVika.setText(componentNames[14])
            convBinding.editStandox.setText(componentNames[15])
            convBinding.editLesonal.setText(componentNames[16])
            convBinding.editNoMix.setText(componentNames[17])
            convBinding.editReiz.setText(componentNames[18])
            convBinding.editPPG.setText(componentNames[19])
            convBinding.editQuickLine.setText(componentNames[20])
            convBinding.editLechler.setText(componentNames[21])
            convBinding.editGreenLine.setText(componentNames[22])

            for (i in componentNames.indices) {
                componentNames[i] = ""
            }
        }

        convBinding.tableClearBtn.setOnClickListener {
            clearData(convBinding)
        }
    }

    private fun clearData(convBinding: ContentConvertTablesBinding) {
        convBinding.editSH.setText("")
        convBinding.editDuPont.setText("")
        convBinding.editProfiline.setText("")
        convBinding.editMobihel.setText("")
        convBinding.editNormex.setText("")
        convBinding.editBrulex.setText("")
        convBinding.editChallenger.setText("")
        convBinding.editDuxone.setText("")
        convBinding.editEasiCoat.setText("")
        convBinding.editDeBeer.setText("")
        convBinding.editSikkens.setText("")
        convBinding.editKapci.setText("")
        convBinding.editVika.setText("")
        convBinding.editStandox.setText("")
        convBinding.editLesonal.setText("")
        convBinding.editNoMix.setText("")
        convBinding.editReiz.setText("")
        convBinding.editPPG.setText("")
        convBinding.editQuickLine.setText("")
        convBinding.editLechler.setText("")
        convBinding.editGreenLine.setText("")

        convBinding.tableSearchBtn.isEnabled = true
    }
}

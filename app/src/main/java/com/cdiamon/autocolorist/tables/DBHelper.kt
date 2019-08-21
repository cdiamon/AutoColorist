package com.cdiamon.autocolorist.tables

import android.content.Context
import android.database.Cursor
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteException
import android.database.sqlite.SQLiteOpenHelper
import java.io.FileOutputStream
import java.io.IOException

/**
 * Created by Dmitriy on 28.12.2016.
 */
internal class DBHelper

/**
 * Constructor
 * Takes and keeps a reference of the passed context in order to access to the application assets and resources.
 *
 * @param context
 */
(private val myContext: Context) : SQLiteOpenHelper(myContext, DATABASE_NAME, null, DATABASE_VERSION) {

    private var myDataBase: SQLiteDatabase? = null

    override fun onOpen(db: SQLiteDatabase?) {
        super.onOpen(db)
        //this fixes android 9.0 problem
        db?.disableWriteAheadLogging()
    }

    @Throws(IOException::class)
    fun createDataBase() {

        val dbExist = checkDataBase()

        if (!dbExist) {

            this.readableDatabase

            copyDataBase()
        }
    }

    /**
     * Check if the database already exist to avoid re-copying the file each time you open the application.
     *
     * @return true if it exists, false if it doesn't
     */
    private fun checkDataBase(): Boolean {

        var checkDB: SQLiteDatabase? = null

        try {
            val myPath = DATABASE_PATH + DATABASE_NAME
            checkDB = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY)
        } catch (e: SQLiteException) {
            e.printStackTrace()
        }

        if (checkDB != null) {
            checkDB.close()
        }

        return checkDB != null
    }

    /**
     * Copies database from local assets-folder to the just created empty database in the
     * system folder, from where it can be accessed and handled.
     */
    private fun copyDataBase() {
        try {
            val myInput = myContext.assets.open(DATABASE_NAME)
            val outFileName = DATABASE_PATH + DATABASE_NAME
            println(outFileName)
            val myOutput = FileOutputStream(outFileName)
            myInput.copyTo(myOutput, 1024)
            myOutput.flush()
            myOutput.close()
            myInput.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    @Throws(SQLException::class)
    fun openDataBase() {

        val myPath = DATABASE_PATH + DATABASE_NAME
        myDataBase = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY)

    }

    @Synchronized
    override fun close() {

        if (myDataBase != null) {
            myDataBase!!.close()
        }

        super.close()

    }

    override fun onCreate(sqLiteDatabase: SQLiteDatabase) {}

    override fun onUpgrade(sqLiteDatabase: SQLiteDatabase, oldversion: Int, newversion: Int) {}

    fun searchData(vendorName: String, componentName: String): Array<String?> {

        val componentNames = arrayOfNulls<String>(30)

        myDataBase = this.readableDatabase
        val cursor: Cursor?
        val QueryString = "select * from " + DATABASE_TABLE + " where " + vendorName + "=" + '"'.toString() + componentName.toUpperCase() + '"'.toString() + "LIMIT 1"
        cursor = myDataBase!!.rawQuery(QueryString, null)
        if (cursor != null && cursor.moveToFirst()) {

            var s = 0
            while (cursor.isLast && s != 29) {
                componentNames[s] = cursor.getString(s)
                println(cursor.getString(s))
                s += 1
            }
        }
        val builder = StringBuilder()
        for (s in componentNames) {
            builder.append(s)
        }

        println(componentNames[1])
        cursor?.close()

        return componentNames
    }

    companion object {


        private val DATABASE_PATH = "/data/data/com.cdiamon.autocolorist/databases/"
        private val DATABASE_NAME = "converttables.db"
        private val DATABASE_TABLE = "paints_name"
        private val DATABASE_VERSION = 1
    }
}

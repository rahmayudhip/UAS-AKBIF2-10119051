package com.example.uasakbif_210119051.ui.dashboard;

//<!--    //Nama :Rahmayudhi Prakoso-->
//        <!--    //Nim  :10119051-->
//        <!--    //Kelas:IF-2-->

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.fragment.app.FragmentActivity;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "db_catatan";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(FragmentActivity context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE catatan(no integer primary key,tanggal text null, judul text null, kategori text null, isi text null);";
        Log.d("Data","onCreate"+sql);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {

    }

}

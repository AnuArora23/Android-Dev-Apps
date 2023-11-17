package com.example.loginapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DBName="user.db";

    public DBHelper(Context context) {
        super(context, "user.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase MyDB) {
    MyDB.execSQL("create table users(username Text Primary key, emailid Text, password Text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int i, int i1) {
    MyDB.execSQL("drop table if exists users");
    }

    public Boolean insertData(String username, String email_id, String password){
    SQLiteDatabase MyDB=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("username", username);
        cv.put("emailid", email_id);
        cv.put("password", password);
        long results=MyDB.insert("users",null,cv);
        if (results==-1)
            return false;
        else
            return true;

    }

    public boolean checkUser(String username){
        SQLiteDatabase MyDB=this.getWritableDatabase();
        Cursor cr=MyDB.rawQuery("select * from users where username=?", new String[] {username});
        if (cr.getCount()>0)
            return true;
        else
            return false;


    }
    public boolean checkUser_pass(String username,String password){
        SQLiteDatabase MyDB=this.getWritableDatabase();
        Cursor cr=MyDB.rawQuery("select * from users where username=? and password=?", new String[] {username,password});
        if (cr.getCount()>0)
            return true;
        else
            return false;


    }
}

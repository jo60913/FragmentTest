package com.example.android.fragmenttest

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

const val CREATE_TABLE_SQL = "create table dict(_id integer primary " + "key autoincrement , word , detail)"
class MyDatabaseHelper(context: Context, name: String, version: Int) : SQLiteOpenHelper(context, name, null, version)
{
    override fun onCreate(db: SQLiteDatabase)
    {
        // 第一次使用数据库时自动建表
        db.execSQL(CREATE_TABLE_SQL)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int)
    {
        println("--------onUpdate Called--------" + oldVersion + "--->" + newVersion)
    }
}
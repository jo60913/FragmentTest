package com.example.android.fragmenttest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    private lateinit var Btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Btn = findViewById<Button>(R.id.button1)
        Btn.setOnClickListener {
            val i: Intent = Intent()
            i.action = Intent.ACTION_MAIN
            i.addCategory(Intent.CATEGORY_HOME)
            startActivity(i)
            Toast.makeText(this,"Home",Toast.LENGTH_SHORT).show()
        }

    }
}

package com.baculsoft.kotlinandroid.views.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.widget.Button
import android.widget.Toast
import com.baculsoft.kotlinandroid.R

/**
 * @author Budi Oktaviyan Suryanto (budi@baculsoft.com)
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById(R.id.toolbar_main) as Toolbar
        toolbar.title = resources.getString(R.string.app_name)
        setSupportActionBar(toolbar)

        val button = findViewById(R.id.btn_main) as Button
        button.setOnClickListener { view -> Toast.makeText(this, "Hello Kotlin!", Toast.LENGTH_SHORT).show() }
    }
}
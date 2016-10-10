package com.baculsoft.kotlinandroid.views.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * @author Budi Oktaviyan Suryanto (budi@baculsoft.com)
 */
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        openMainActivity()
    }

    fun openMainActivity() {
        val intent: Intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
package com.baculsoft.kotlinandroid

import android.app.Application
import android.content.Context
import android.support.multidex.MultiDex

/**
 * @author Budi Oktaviyan Suryanto (budi@baculsoft.com)
 */
class App : Application() {
    @Volatile var CONTEXT: Context? = null

    @Synchronized fun getContext(): Context {
        return CONTEXT as Context
    }

    override fun onCreate() {
        super.onCreate()
        CONTEXT = applicationContext
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}
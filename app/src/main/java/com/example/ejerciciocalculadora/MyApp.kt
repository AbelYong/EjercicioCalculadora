package com.example.ejerciciocalculadora

import android.app.Application
import android.util.Log

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.d("MyApplication", "The app has been initialized")
    }
}
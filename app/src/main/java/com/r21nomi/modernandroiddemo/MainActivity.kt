package com.r21nomi.modernandroiddemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.DrawableRes
import com.r21nomi.modernandroiddemo.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    @DrawableRes val id = R.string.app_name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }

        Log.d("MainActivity", id.toString())
    }
}
package com.example.setactionbarlogoinkotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // If we set actionbar logo then we write this method
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayUseLogoEnabled(true)
        supportActionBar?.setLogo(R.drawable.ic_home_black_24dp)
        /*
         In this method if we want don't show title then we write this method
         otherwise ignore this method
         supportActionBar?.setDisplayShowTitleEnabled ()
         */
        supportActionBar?.setDisplayShowTitleEnabled(false)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

package com.example.we_muslim20.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.we_muslim20.R
import com.example.we_muslim20.fragment.HomeFragment

class SpashActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT : Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spash)

        Handler().postDelayed({
            // This method will be executed once the timer is over
            // Start your app main activity

            startActivity(Intent(this,HomeFragment::class.java))

            // close this activity
            finish()
        }, SPLASH_TIME_OUT)
    }
}
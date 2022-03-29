package com.example.we_muslim20.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.we_muslim20.MainActivity
import com.example.we_muslim20.R
import com.example.we_muslim20.fragment.HomeFragment
import com.example.we_muslim20.home.Login.LobbyActivity
import com.example.we_muslim20.home.Login.LoginActivity

class SpashActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT : Long = 1000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spash)

        val preference = getSharedPreferences("SASARI", MODE_PRIVATE)

        Handler().postDelayed({
            // This method will be executed once the timer is over
            // Start your app main activity

            // if user didn't exist then go to Lo LobbyActivity
            if (preference.getString("NAME", "") == null)startActivity(Intent(this,LobbyActivity::class.java))
            // else then go to MainActiovity
            else startActivity(Intent(this, MainActivity::class.java))

            // close this activity
            finish()
        }, SPLASH_TIME_OUT)
    }
}
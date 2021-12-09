package com.example.we_muslim20.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.we_muslim20.R
import com.example.we_muslim20.home.DzikirSetelahSholat.DzikirSholatActivity
import com.google.android.material.card.MaterialCardView

class DzikirActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val pindah = findViewById<MaterialCardView>(R.id.crd_sholat)
        pindah.setOnClickListener {
            startActivity(Intent(this, DzikirSholatActivity::class.java))
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
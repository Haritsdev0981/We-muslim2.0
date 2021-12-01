package com.example.we_muslim20.home


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.we_muslim20.R

class AsmaulHusnaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asmaul_husna)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
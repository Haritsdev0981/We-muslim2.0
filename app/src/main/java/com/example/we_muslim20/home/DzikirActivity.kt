package com.example.we_muslim20.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.we_muslim20.R
import com.example.we_muslim20.databinding.ActivityDzikirBinding
import com.example.we_muslim20.home.DzikirSetelahSholat.DzikirSholatActivity

class DzikirActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDzikirBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Dzikir"
        setContentView(R.layout.activity_dzikir)

        binding = ActivityDzikirBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.crdSholat.setOnClickListener{
            val intent = Intent(this, DzikirSholatActivity::class.java)
            startActivity(intent)
        }

        binding.crdPagi.setOnClickListener {
            val intent = Intent(this, DzikirPagiActivity::class.java)
            startActivity(intent)
        }

        binding.crdPetang.setOnClickListener {
            val intent = Intent(this,DzikirPetangActivity::class.java)
            startActivity(intent)
        }

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
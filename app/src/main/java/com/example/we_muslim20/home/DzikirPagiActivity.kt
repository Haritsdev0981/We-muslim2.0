package com.example.we_muslim20.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.we_muslim20.R
import com.example.we_muslim20.databinding.ActivityDzikirPagiBinding
import com.example.we_muslim20.databinding.ActivityMainBinding
import com.example.we_muslim20.home.DzikirPagi.DzikirPagiAdapter
import com.example.we_muslim20.home.DzikirPagi.DzikirPagiData
import com.example.we_muslim20.home.DzikirPagi.DzikirPagiSetting

class DzikirPagiActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDzikirPagiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirPagiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val rvDzikirPagi = findViewById<RecyclerView>(R.id.rv_dzikir_pagi)
        rvDzikirPagi.layoutManager = GridLayoutManager(baseContext,1)
        rvDzikirPagi.adapter = DzikirPagiAdapter(DzikirPagiData.listDzikirPagi)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
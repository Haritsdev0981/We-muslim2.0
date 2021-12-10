package com.example.we_muslim20.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.we_muslim20.R
import com.example.we_muslim20.databinding.ActivityDzikirPetangBinding
import com.example.we_muslim20.home.DzikirPetang.DzikirPetangAdapter
import com.example.we_muslim20.home.DzikirPetang.DzikirPetangData

class DzikirPetangActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDzikirPetangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirPetangBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val rvDzikirPetang = findViewById<RecyclerView>(R.id.rv_dzikir_petang)
        rvDzikirPetang.layoutManager = GridLayoutManager(baseContext,1)
        rvDzikirPetang.adapter = DzikirPetangAdapter(DzikirPetangData.listDzikirPetang)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
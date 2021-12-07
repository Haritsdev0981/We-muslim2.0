package com.example.we_muslim20.home


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.we_muslim20.R
import com.example.we_muslim20.databinding.ActivityAsmaulHusnaBinding
import com.example.we_muslim20.databinding.ActivityKajianBinding
import com.example.we_muslim20.home.AsmaulHusna.AsmaulAdapter
import com.example.we_muslim20.home.AsmaulHusna.AsmaulSetting
import com.example.we_muslim20.home.AsmaulHusna.DataAsmaul

class AsmaulHusnaActivity : AppCompatActivity() {

    private lateinit var binding : ActivityAsmaulHusnaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAsmaulHusnaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val rvAsmaul = findViewById<RecyclerView>(R.id.rcy_asmaul)
        rvAsmaul.layoutManager = GridLayoutManager(baseContext,2)
        rvAsmaul.adapter = AsmaulAdapter(DataAsmaul.listAsmaulHusna)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
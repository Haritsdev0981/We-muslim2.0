package com.example.we_muslim20.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.we_muslim20.R
import com.example.we_muslim20.databinding.ActivityKajianBinding
import com.example.we_muslim20.home.others.DataOthers
import com.example.we_muslim20.home.others.OthersAdapter

class KajianActivity : AppCompatActivity() {

    private lateinit var binding : ActivityKajianBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKajianBinding.inflate(layoutInflater)
        title = "Others"
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val rvKajian = findViewById<RecyclerView>(R.id.rcy_kajian)
        rvKajian.layoutManager = LinearLayoutManager(this)
        rvKajian.adapter = OthersAdapter(DataOthers.listOthers)
    } 
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
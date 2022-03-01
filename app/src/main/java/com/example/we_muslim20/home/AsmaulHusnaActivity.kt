package com.example.we_muslim20.home


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.we_muslim20.R
import com.example.we_muslim20.databinding.ActivityAsmaulHusnaBinding
import com.example.we_muslim20.databinding.ActivityKajianBinding
import com.example.we_muslim20.home.AsmaulHusna.AsmaulAdapter
import com.example.we_muslim20.home.AsmaulHusna.AsmaulSetting
import com.example.we_muslim20.home.AsmaulHusna.DataAsmaul
import com.google.android.material.card.MaterialCardView

class AsmaulHusnaActivity : AppCompatActivity() {

    private lateinit var binding : ActivityAsmaulHusnaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAsmaulHusnaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Asmaul Husna"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val rvAsmaul = findViewById<RecyclerView>(R.id.rcy_asmaul)
        val txtAsmaul = findViewById<MaterialCardView>(R.id.mcview_itemasma)
        rvAsmaul.layoutManager = GridLayoutManager(baseContext,2)
        rvAsmaul.adapter = AsmaulAdapter(DataAsmaul.listAsmaulHusna)

        val text = "${DataAsmaul} yang kamu klik"
        val duration = Toast.LENGTH_SHORT
        rvAsmaul.setOnClickListener {
             Toast.makeText(applicationContext, text, duration).show()
        }


//        rvAsmaul.setOnClickListener {
//            Toast.makeText(this,"${DataAsmaul} yang tadi kamu klik",Toast.LENGTH_SHORT).show()
//        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
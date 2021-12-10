package com.example.we_muslim20.home.DzikirSetelahSholat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.we_muslim20.R
import com.example.we_muslim20.databinding.ActivityDzikirSholatBinding
import com.example.we_muslim20.home.DzikirSetelahSholat.threepray.TahmidFragment
import com.google.android.material.tabs.TabLayoutMediator

class DzikirSholatActivity : AppCompatActivity() {

//    val arabDzikir = listOf("سبحان الل", "الحمد لله", "الله أكبر")
//    val artiDzikir = listOf("Maha Suci Allah", "Segala Puji Bagi Allah", "Allah Maha Besar")

    private lateinit var binding : ActivityDzikirSholatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir_sholat)

//        val tahmid : RelativeLayout = findViewById(R.id.tahmid)
//        val tasbih : RelativeLayout = findViewById(R.id.tasbih)
//        val takbir : RelativeLayout = findViewById(R.id.takbir)

        binding = ActivityDzikirSholatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        binding.vpDzikir.adapter = SectionPageAdapter(this)

        val tabList = arrayOf("Tahmid", "Tasbih", "Takbir")
        TabLayoutMediator(binding.tabs, binding.vpDzikir){
                tab, position -> tab.text = tabList[position]
        }.attach()
    }
}
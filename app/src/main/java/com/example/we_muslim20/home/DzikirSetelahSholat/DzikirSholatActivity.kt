package com.example.we_muslim20.home.DzikirSetelahSholat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.we_muslim20.R
import com.example.we_muslim20.home.DzikirSetelahSholat.Adapter.MyPagerAdapter
import com.google.android.material.tabs.TabLayout

class DzikirSholatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir_sholat)
//        supportActionBar?.hide()
        title = "Dzikir Setelah Sholat"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val viewpager_main = findViewById<ViewPager>(R.id.vp_dzikir)
        val tabs_dzikir = findViewById<TabLayout>(R.id.tabs_dzikir)

        viewpager_main.adapter = MyPagerAdapter(supportFragmentManager)
        tabs_dzikir.setupWithViewPager(viewpager_main)

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
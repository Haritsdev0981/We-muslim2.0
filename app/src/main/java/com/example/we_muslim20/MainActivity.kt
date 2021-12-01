package com.example.we_muslim20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.we_muslim20.databinding.ActivityMainBinding
import com.example.we_muslim20.home.AsmaulHusnaActivity
import com.example.we_muslim20.home.DoaActivity
import com.example.we_muslim20.home.DzikirActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val bottomNavMain: BottomNavigationView = binding.btmnMain

        val bottomNavMainControler = findNavController(R.id.nav_host_fragment_activity_main)

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home,
                R.id.nav_explore
            )
        )

        setupActionBarWithNavController(bottomNavMainControler, appBarConfiguration)
        bottomNavMain.setupWithNavController(bottomNavMainControler)
    }
}
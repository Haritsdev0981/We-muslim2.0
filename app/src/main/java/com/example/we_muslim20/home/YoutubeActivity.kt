package com.example.we_muslim20.home

import android.os.Bundle
import android.webkit.WebView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.we_muslim20.R
import com.example.we_muslim20.databinding.ActivityYoutubeBinding

class YoutubeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityYoutubeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYoutubeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myWebView: WebView = findViewById(R.id.wv_kajian)
        myWebView.loadUrl("https://youtu.be/NRwbe5cxzpo")


    }
}
package com.example.we_muslim20.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.we_muslim20.R
import com.example.we_muslim20.databinding.ActivityYoutube2Binding
import com.example.we_muslim20.databinding.ActivityYoutubeBinding

class Youtube2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityYoutube2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYoutube2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val myWebView: WebView = findViewById(R.id.wv_kajian2)
        myWebView.loadUrl("https://youtu.be/G2MYs7rN4-A")
    }
}
package com.example.we_muslim20.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.we_muslim20.R
import com.example.we_muslim20.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var url: String
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }
}
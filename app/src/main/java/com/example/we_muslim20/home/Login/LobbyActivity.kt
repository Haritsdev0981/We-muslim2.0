package com.example.we_muslim20.home.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.we_muslim20.MainActivity
import com.example.we_muslim20.R
import com.example.we_muslim20.databinding.ActivityLobbyBinding

class LobbyActivity : AppCompatActivity() {

    private var _binding: ActivityLobbyBinding? = null
    private val binding get() = _binding as ActivityLobbyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLobbyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.apply {
            btnLoginFirst.setOnClickListener {
                startActivity(Intent(this@LobbyActivity, LoginActivity::class.java))
            }
            btnStarted.setOnClickListener {
                startActivity(Intent(this@LobbyActivity, MainActivity::class.java))
            }
        }
    }
}
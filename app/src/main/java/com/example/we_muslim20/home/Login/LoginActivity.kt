package com.example.we_muslim20.home.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.we_muslim20.MainActivity
import com.example.we_muslim20.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private var _binding: ActivityLoginBinding? = null
    private val binding get() = _binding as ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        _binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCon.setOnClickListener {
//                val userName = binding.txtInputLytnama
//                val userPass = binding.txtInputLytsandi
            if (binding.txtInputLytnama.toString() == "muslim" && binding.txtInputLytsandi.toString() == "mujahid") {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "Username atau Password salah", Toast.LENGTH_SHORT).show()
            }
        }

        //test github coba

    }
}
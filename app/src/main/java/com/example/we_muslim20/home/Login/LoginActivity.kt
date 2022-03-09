package com.example.we_muslim20.home.Login

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.we_muslim20.MainActivity
import com.example.we_muslim20.databinding.ActivityLoginBinding
import com.example.we_muslim20.fragment.HomeFragment
import com.example.we_muslim20.home.RegisterActivity

class LoginActivity : AppCompatActivity() {

    private var _binding: ActivityLoginBinding? = null
    private val binding get() = _binding as ActivityLoginBinding

    lateinit var preference: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        _binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        preference = getSharedPreferences("SASARI", MODE_PRIVATE)

        binding.btnCon.setOnClickListener {
//                val userName = binding.txtInputLytnama
//                val userPass = binding.txtInputLytsandi
//            if (binding.txtinptNama.text.toString() == "lol" && binding.txtinptSandi.text.toString() == "lol") {
//                startActivity(Intent(this, MainActivity::class.java))
//                finish()
//            } else {
//                Toast.makeText(this, "Username atau Password salah", Toast.LENGTH_SHORT).show()
//            }

            Log.i("Cek Login guys", "onCreate: user: ${preference.getString("NAME", "") as String}, pass: ${preference.getString("PASSWORD", "")} ")

            // Harits #code
            if (binding.txtinptNama.text.toString() == preference.getString("NAME", "") && binding.txtinptSandi.text.toString()
                == preference.getString("PASSWORD", "")){
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }else{
                Toast.makeText(this, "nama atau kata sandi salah", Toast.LENGTH_SHORT).show()
                finish()
            }
        }

        binding.txtRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
            finish()
        }

        //todo : test github coba
    }


}
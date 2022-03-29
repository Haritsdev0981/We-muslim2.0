package com.example.we_muslim20.home.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.we_muslim20.databinding.ActivityRegisterBinding
import com.example.we_muslim20.home.Login.LoginActivity

class RegisterActivity : AppCompatActivity() {

    private var _binding: ActivityRegisterBinding? = null
    private val binding get() = _binding as ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        _binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences = getSharedPreferences("SASARI", MODE_PRIVATE)

        binding.apply {
            btnRegis.setOnClickListener {
                val name = txtregisNama.text.toString().trim()
                val password = txtRegisSandi.text.toString().trim()
                val email = txtRegisEmail.text.toString().trim()
                val saveChecked = switchh.isChecked

                val editor = sharedPreferences.edit()
                editor.putString("NAME", name)
                editor.putString("PASSWORD", password)
                editor.putString("EMAIL", email)
                editor.putBoolean("CHECKED", saveChecked)
                editor.apply()
                Toast.makeText(this@RegisterActivity, "kesave", Toast.LENGTH_SHORT).show()

                startActivity(Intent(this@RegisterActivity, LoginActivity::class.java))
            }
        }
    }
}
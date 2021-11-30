package com.example.we_muslim20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.we_muslim20.home.AsmaulHusnaActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imageButton1 = findViewById<ImageButton>(R.id.img_btn_fitur1)

        var imageButton2 = findViewById<ImageButton>(R.id.img_btn_fitur2)
        imageButton2.setOnClickListener {
            startActivity(Intent(this,AsmaulHusnaActivity::class.java))
        }
        var imageButton3 = findViewById<ImageButton>(R.id.img_btn_fitur3)

        var imageButton4 = findViewById<ImageButton>(R.id.img_btn_fitur4)

    }
}
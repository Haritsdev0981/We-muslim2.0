package com.example.we_muslim20.home.DzikirSetelahSholat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import com.example.we_muslim20.R

class DzikirSholatActivity : AppCompatActivity() {

    val arabDzikir = listOf("سبحان الل", "الحمد لله", "الله أكبر")
    val artiDzikir = listOf("Maha Suci Allah", "Segala Puji Bagi Allah", "Allah Maha Besar")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir_sholat)

        val adapter = ArrayAdapter(this, R.layout.item_listview_dzikirsholat, arabDzikir)
        val adapterDua = ArrayAdapter(this, R.layout.item_listview_dzikirsholat, artiDzikir)
        val listView: ListView = findViewById(R.id.listvw_sholat)
        listView.setAdapter(adapter)
        listView.setAdapter(adapterDua)
    }
}
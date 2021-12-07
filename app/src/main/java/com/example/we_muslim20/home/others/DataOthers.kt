package com.example.we_muslim20.home.others

import com.example.we_muslim20.R
import java.util.ArrayList

object DataOthers {

    val imgKajian = intArrayOf(
        R.drawable.ustyazid,
        R.drawable.ustbasalamah,
        R.drawable.yufid
    )

    val judulKajian = arrayOf(
        "Tauhid jalan Menuju Surga",
        "Pasar Penghuni Surga buka setiap hari jumat",
        "Hal Yang Membuat Allah Gembira"
    )

    val descKajian = arrayOf(
        "Ustd Yazid Abdul Qadir Jawas",
        "Ustad Riza Basallamah",
        "Yufid tv"
    )

     val listOthers:  ArrayList<OthersSetting>
     get() {
         val listOthers = arrayListOf<OthersSetting>()
         for (position in descKajian.indices){
             val Others = OthersSetting(
                 img = imgKajian[position],
                 judul = judulKajian[position],
                 desc = descKajian[position]
             )
             listOthers.add(Others)
         }
         return listOthers
     }
}
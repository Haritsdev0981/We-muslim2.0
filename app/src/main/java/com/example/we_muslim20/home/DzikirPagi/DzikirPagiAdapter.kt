package com.example.we_muslim20.home.DzikirPagi

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import androidx.recyclerview.widget.RecyclerView
import com.example.we_muslim20.databinding.RowItemAsmaulHusnaBinding
import com.example.we_muslim20.databinding.RowItemDzikirPagiBinding

class DzikirPagiAdapter(private val listDzikirPagi: ArrayList<DzikirPagiSetting>) :
     RecyclerView.Adapter<DzikirPagiAdapter.MyViewHolder>() {

     inner class MyViewHolder(private val rowItemDzikirPagiBinding: RowItemDzikirPagiBinding) :
          RecyclerView.ViewHolder(rowItemDzikirPagiBinding.root) {
          fun bindItem(dzikirPagiSetting: DzikirPagiSetting) {
               rowItemDzikirPagiBinding.tvDescDzikirPagi.text = dzikirPagiSetting.descDP
               rowItemDzikirPagiBinding.tvLafazDzikirPagi.text = dzikirPagiSetting.lafazDP
               rowItemDzikirPagiBinding.tvTerjemahanDzikirPagi.text = dzikirPagiSetting.terjemahanDP
          }
     }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
          RowItemDzikirPagiBinding.inflate(LayoutInflater.from(parent.context), parent, false)
     )

     override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
          holder.bindItem(listDzikirPagi[position])
     }

     override fun getItemCount(): Int = listDzikirPagi.size
}
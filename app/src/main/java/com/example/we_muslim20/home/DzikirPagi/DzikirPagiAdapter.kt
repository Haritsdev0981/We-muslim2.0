package com.example.we_muslim20.home.DzikirPagi

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import androidx.recyclerview.widget.RecyclerView
import com.example.we_muslim20.databinding.RowItemAsmaulHusnaBinding
import com.example.we_muslim20.databinding.RowItemDzikirBinding

class DzikirPagiAdapter(private val listDzikirPagi: ArrayList<DzikirPagiSetting>) :
     RecyclerView.Adapter<DzikirPagiAdapter.MyViewHolder>() {

     inner class MyViewHolder(private val rowItemDzikirBinding: RowItemDzikirBinding) :
          RecyclerView.ViewHolder(rowItemDzikirBinding.root) {
          fun bindItem(dzikirPagiSetting: DzikirPagiSetting) {
               rowItemDzikirBinding.tvDescDzikirPagi.text = dzikirPagiSetting.descDP
               rowItemDzikirBinding.tvLafazDzikirPagi.text = dzikirPagiSetting.lafazDP
               rowItemDzikirBinding.tvTerjemahanDzikirPagi.text = dzikirPagiSetting.terjemahanDP
          }
     }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
          RowItemDzikirBinding.inflate(LayoutInflater.from(parent.context), parent, false)
     )

     override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
          holder.bindItem(listDzikirPagi[position])
     }

     override fun getItemCount(): Int = listDzikirPagi.size
}
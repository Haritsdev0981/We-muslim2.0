package com.example.we_muslim20.home.DzikirPetang

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.we_muslim20.databinding.RowItemDzikirBinding

class DzikirPetangAdapter(private val listDzikirPetang : ArrayList<DzikirPetangSetting>) :
     RecyclerView.Adapter<DzikirPetangAdapter.MyViewHolder>() {
         inner class MyViewHolder(private val rowItemDzikirBinding: RowItemDzikirBinding) :
                 RecyclerView.ViewHolder(rowItemDzikirBinding.root) {
                     fun bindItem(dzikirPetangSetting: DzikirPetangSetting) {
                         rowItemDzikirBinding.tvDescDzikirPagi.text = dzikirPetangSetting.descPtg
                         rowItemDzikirBinding.tvLafazDzikirPagi.text = dzikirPetangSetting.lafazPtg
                         rowItemDzikirBinding.tvTerjemahanDzikirPagi.text = dzikirPetangSetting.terjemahanPtg
                     }
                 }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder (
        RowItemDzikirBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindItem(listDzikirPetang[position])
    }

    override fun getItemCount(): Int = listDzikirPetang.size
}
package com.example.we_muslim20.home.AsmaulHusna

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.we_muslim20.databinding.RowItemAsmaulHusnaBinding
import com.example.we_muslim20.home.others.OthersSetting

class AsmaulAdapter(private val listAsmaul: ArrayList<AsmaulSetting>) :
    RecyclerView.Adapter<AsmaulAdapter.MyViewHolder>() {

    inner class MyViewHolder(val RowItemAsmaulHusnaBinding: RowItemAsmaulHusnaBinding) :
        RecyclerView.ViewHolder(RowItemAsmaulHusnaBinding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        RowItemAsmaulHusnaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.RowItemAsmaulHusnaBinding.apply {
            with(listAsmaul[position]) {
                txtArabasmaul.text = arab
                txtNamaAsmaul.text = judul
                txtArtiasmaul.text = arti
            }
        }
    }

    override fun getItemCount(): Int = listAsmaul.size
}
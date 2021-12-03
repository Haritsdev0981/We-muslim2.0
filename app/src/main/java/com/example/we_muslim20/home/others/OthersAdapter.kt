package com.example.we_muslim20.home.others

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.we_muslim20.R
import com.example.we_muslim20.databinding.RowItemStudiesSatuBinding
import com.example.we_muslim20.home.DetailActivity
import java.util.ArrayList

class OthersAdapter(private val listOthers: ArrayList<OthersSetting>) :
    RecyclerView.Adapter<OthersAdapter.MyViewHolder>() {

    inner class MyViewHolder(private val rowItemStudiesSatuBinding: RowItemStudiesSatuBinding) :
        RecyclerView.ViewHolder(rowItemStudiesSatuBinding.root) {
        //untuk inisialisasi view dari layout row_item_dzikir.xml

        fun bindItem(otherSetting: OthersSetting) {
            rowItemStudiesSatuBinding.txtJudul.text = otherSetting.judul
            rowItemStudiesSatuBinding.txtDesc.text = otherSetting.desc
            rowItemStudiesSatuBinding.imgJudul.setImageResource(otherSetting.img)
        }

//        val txtJudul: TextView = view.findViewById(R.id.txt_Judul)
//        val txtDesc: TextView = view.findViewById(R.id.txt_desc)
//        val imgJudul: TextView = view.findViewById(R.id.img_Judul)
    }

    //untuk menampilkan data sesuai dengan posisi layout yang ditentukan
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
//        LayoutInflater.from(parent.context).inflate(R.layout.row_item_studies_satu, parent, false)
        RowItemStudiesSatuBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    //untuk mengatribusikan data menjadi sebuah tampilan
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindItem(listOthers[position])
//        holder.txtJudul.text = listOthers[position].judul
//        holder.txtDesc.text = listOthers[position].desc
//        holder.imgJudul.
    }

    //untuk menentukan jumlah data yang ditampilkan
    override fun getItemCount(): Int = listOthers.size

//    inner class MyViewHolder(val binding: RowItemStudiesSatuBinding) :
//        RecyclerView.ViewHolder(binding.root)
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
//        RowItemStudiesSatuBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//    )
//
//    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        holder.binding.apply {
//            with(listOthers[position]){
//                txtJudul.text = judul
//                txtDesc.text = desc
//                Glide.with(imgJudul.context).load(img).into(imgJudul)
////                holder.itemView.setOnClickListener {
////                    val intent = Intent(it.context, DetailActivity::class.java)
////                    intent.putExtra(DetailActivity)
////                }
//            }
//        }
//    }
//
//    override fun getItemCount(): Int = listOthers.size
}
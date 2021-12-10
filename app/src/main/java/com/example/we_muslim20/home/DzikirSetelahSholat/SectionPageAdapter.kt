package com.example.we_muslim20.home.DzikirSetelahSholat

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.we_muslim20.home.DzikirSetelahSholat.threepray.TahmidFragment
import com.example.we_muslim20.home.DzikirSetelahSholat.threepray.TakbirFragment
import com.example.we_muslim20.home.DzikirSetelahSholat.threepray.TasbihFragment

class SectionPageAdapter(manggilFragment : FragmentActivity) : FragmentStateAdapter(manggilFragment) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> TahmidFragment()
            1 -> TasbihFragment()
            2 -> TakbirFragment()
            else -> TahmidFragment()
        }
    }
}
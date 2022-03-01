package com.example.we_muslim20.home.DzikirSetelahSholat

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.we_muslim20.home.DzikirSetelahSholat.afterpray.*

class SectionPageAdapter(manggilFragment : FragmentActivity) : FragmentStateAdapter(manggilFragment) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> PraiseAlloh()
            1 -> DzikirAfter2()
            2 -> DzikirAfter3()
            3 -> TahmidFragment()
            4 -> TasbihFragment()
            5 -> TakbirFragment()
            else -> PraiseAlloh()
        }
    }
}
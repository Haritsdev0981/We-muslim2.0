package com.example.we_muslim20.home.DzikirSetelahSholat.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.we_muslim20.home.DzikirSetelahSholat.afterpray.*

class MyPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {

    private val pages= listOf(
        PraiseAlloh(),
        DzikirAfter2(),
        DzikirAfter3(),
        TasbihFragment(),
        TahmidFragment(),
        TakbirFragment()
    )

    // buat ganti tulisan commit

    override fun getCount(): Int {
        return pages.size
    }

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Dzikir"
            1 -> "Dzikir"
            2 -> "Dzikir"
            4 -> "Tasbih"
            5 -> "Tahmid"
            else  -> "Takbir"
        }
    }
}
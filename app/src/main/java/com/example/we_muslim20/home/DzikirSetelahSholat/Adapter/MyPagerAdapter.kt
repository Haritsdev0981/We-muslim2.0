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

    // todo : tara tara tata tara

    override fun getCount(): Int {
        return pages.size
    }

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Dzikir1"
            1 -> "Dzikir2"
            2 -> "Dzikir3"
            4 -> "Tasbih"
            5 -> "Tahmid"
            else -> "Takbir"
        }
    }
}
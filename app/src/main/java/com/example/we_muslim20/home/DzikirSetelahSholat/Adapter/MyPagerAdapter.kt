package com.example.we_muslim20.home.DzikirSetelahSholat.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.we_muslim20.home.DzikirSetelahSholat.threepray.TahmidFragment
import com.example.we_muslim20.home.DzikirSetelahSholat.threepray.TakbirFragment
import com.example.we_muslim20.home.DzikirSetelahSholat.threepray.TasbihFragment

class MyPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {

    private val pages= listOf(
        TasbihFragment(),
        TahmidFragment(),
        TakbirFragment()
    )

    override fun getCount(): Int {
        return pages.size
    }

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Tasbih"
            1 -> "Tahmid"
            else -> "Takbir"
        }
    }
}
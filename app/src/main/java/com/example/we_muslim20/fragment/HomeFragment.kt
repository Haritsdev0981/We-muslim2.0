package com.example.we_muslim20.fragment

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.we_muslim20.R
import com.example.we_muslim20.databinding.FragmentHomeBinding
import com.example.we_muslim20.home.*

class HomeFragment : Fragment() {

    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!

    var preferences: SharedPreferences? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        preferences = this.activity?.getSharedPreferences("SASARI", AppCompatActivity.MODE_PRIVATE)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
    }

    private fun initView() {
        binding.apply {

            isiKajian1.setOnClickListener {
                val intent = Intent(this@HomeFragment.context, YoutubeActivity::class.java)
                startActivity(intent)
            }

            isiKajian2.setOnClickListener {
                val intent = Intent(this@HomeFragment.context, Youtube2Activity::class.java)
                startActivity(intent)
            }

            imgBtnFitur1.setOnClickListener {
                val intent = Intent(this@HomeFragment.context, DoaActivity::class.java)
                startActivity(intent)
            }

            imgBtnFitur2.setOnClickListener {
                val intent = Intent(this@HomeFragment.context, AsmaulHusnaActivity::class.java)
                startActivity(intent)
            }

            imgBtnFitur3.setOnClickListener {
                val intent = Intent(this@HomeFragment.context, DzikirActivity::class.java)
                startActivity(intent)
            }

            txtOthers.setOnClickListener {
                val intent = Intent(this@HomeFragment.context, KajianActivity::class.java)
                startActivity(intent)
            }

            imgBtnFitur4.setOnClickListener {
                val intent = Intent(this@HomeFragment.context, SunnahActivity::class.java)
                startActivity(intent)
            }

            val name = preferences?.getString("NAME", "")
            txtUser.text = name
        }


    }
}


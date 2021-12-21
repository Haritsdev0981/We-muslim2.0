package com.example.we_muslim20.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.we_muslim20.R
import com.example.we_muslim20.databinding.FragmentHomeBinding
import com.example.we_muslim20.home.*

class HomeFragment : Fragment() {

    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        binding.imgBtnFitur1.setOnClickListener {
            val intent = Intent(this@HomeFragment.context, DoaActivity::class.java)
            startActivity(intent)
        }

        binding.imgBtnFitur2.setOnClickListener {
            val intent = Intent(this@HomeFragment.context, AsmaulHusnaActivity::class.java)
            startActivity(intent)
        }
        binding.imgBtnFitur3.setOnClickListener {
            val intent = Intent(this@HomeFragment.context, DzikirActivity::class.java)
            startActivity(intent)
        }

        binding.txtOthers.setOnClickListener {
            val intent = Intent(this@HomeFragment.context, KajianActivity::class.java)
            startActivity(intent)
        }
        binding.imgBtnFitur4.setOnClickListener {
            val intent = Intent(this@HomeFragment.context, SunnahActivity::class.java)
            startActivity(intent)
        }
    }
}
package com.example.we_muslim20.home.DzikirSetelahSholat.afterpray

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.we_muslim20.R
import com.example.we_muslim20.databinding.FragmentTahmidBinding
import com.example.we_muslim20.databinding.FragmentTasbihBinding

class TasbihFragment : Fragment() {

    private var _binding : FragmentTasbihBinding? = null
    private val binding get() = _binding as FragmentTasbihBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentTasbihBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            btnPlus.setOnClickListener {
                binding.txtNull.text = (binding.txtNull.text.toString().toInt() + 1).toString()

                btnMinus.setOnClickListener {
                    binding.txtNull.text = (binding.txtNull.text.toString().toInt() - 1).toString()
                }
            }
        }
    }
}
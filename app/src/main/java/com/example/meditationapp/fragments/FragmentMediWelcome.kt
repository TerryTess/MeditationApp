package com.example.meditationapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.meditationapp.R
import com.example.meditationapp.databinding.FragmentMediWelcomeBinding
import com.example.meditationapp.databinding.FragmentTopicsBinding


class FragmentMediWelcome : Fragment() {
    private var _binding: FragmentMediWelcomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMediWelcomeBinding.inflate(inflater, container, false)
        return binding.root
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_medi_welcome, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.proceed.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMediWelcome_to_fragmentMain)
        }
    }


}
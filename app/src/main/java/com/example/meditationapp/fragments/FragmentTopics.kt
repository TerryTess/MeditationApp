package com.example.meditationapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.meditationapp.R
import com.example.meditationapp.databinding.FragmentTopicsBinding
import com.example.meditationapp.databinding.FragmentWelcomeBinding


class FragmentTopics : Fragment() {
    private var _binding: FragmentTopicsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        _binding = FragmentTopicsBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.card1.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentTopics_to_fragmentMediWelcome)
        }
    }

}
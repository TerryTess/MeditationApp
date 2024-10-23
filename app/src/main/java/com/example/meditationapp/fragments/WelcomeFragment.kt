package com.example.meditationapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.meditationapp.R
import com.example.meditationapp.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    // ViewBinding reference
    private var _binding: FragmentWelcomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.getstartedbtn.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_fragmentTopics)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

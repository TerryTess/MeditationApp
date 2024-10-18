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
        // Inflate the layout using View Binding
        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Navigate to FragmentTopics when the button is clicked
        binding.getstartedbtn.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_fragmentTopics)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // Avoid memory leaks by nullifying the binding reference
        _binding = null
    }
}

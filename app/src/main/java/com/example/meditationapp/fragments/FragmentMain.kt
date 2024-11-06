package com.example.meditationapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.meditationapp.R
import com.example.meditationapp.databinding.FragmentMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class FragmentMain : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)

        val bottomNavigationView = binding.bottomNavigation


        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.music -> {
                    childFragmentManager.beginTransaction()
                        .replace(R.id.child_fragment_container, FragmentMusic())
                        .commitAllowingStateLoss()
                    true
                }
                else -> false
            }
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

package com.example.meditationapp.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.example.meditationapp.R
import com.example.meditationapp.databinding.ActivityLoginBinding
import com.example.meditationapp.util.FRAGMENT_TO_BE_SHOWN

class LoginActivity : AppCompatActivity() {
    private var _binding: ActivityLoginBinding? = null
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.loginbutton?.setOnClickListener {
           val intent = Intent(this@LoginActivity,MainActivity::class.java).apply {
               putExtra(FRAGMENT_TO_BE_SHOWN,"welcomeFragment")
           }

            startActivity(intent)
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}

package com.example.meditationapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.meditationapp.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private var _binding: ActivitySignUpBinding?=null
    private val binding get() = _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding?.root)

    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
package com.example.meditationapp.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.meditationapp.R
import com.example.meditationapp.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private var _binding: ActivitySplashBinding?=null
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.nextBtn?.setOnClickListener {
            val intent = Intent(this@SplashActivity,SignUpActivity::class.java)
            startActivity(intent)

        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
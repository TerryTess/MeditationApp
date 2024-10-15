package com.example.meditationapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.meditationapp.R
import com.example.meditationapp.databinding.ActivityMainBinding
import com.example.meditationapp.util.FRAGMENT_TO_BE_SHOWN

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        binding.startButton.setOnClickListener {
            val navController = findNavController(R.id.nav_host_fragment)
            navController.navigate(R.id.SignInUpFragment)


        }

        //getting fragment to load
        val fragmentToLoad = intent.getStringExtra(FRAGMENT_TO_BE_SHOWN)
        fragmentToLoad?.let { fragment->
            navigateToFragment(fragment)
        }
    }

    private fun navigateToFragment(fragment: String) {

        when(fragment){
            "welcomeFragment"->navController.navigate(R.id.WelcomeFragment)
        }

    }
}


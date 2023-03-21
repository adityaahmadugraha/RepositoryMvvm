package com.aditya.repositorymvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aditya.repositorymvvm.databinding.ActivityHomeBinding


class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        bottomNavView = binding.bottomNavView

        val homeFragment = HomeFragment()
        val bookmartFragment = BookmartFragment()

        bottomNavView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
setThatFragmnet()
                }
                R.id.bookmart -> {

                }

            } true
        }
    }
}
package com.roynaldi19.kharetrofitlatihan.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.roynaldi19.kharetrofitlatihan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnUsers.setOnClickListener {

        }

        binding.btnPosts.setOnClickListener {

        }
    }
}
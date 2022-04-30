package com.roynaldi19.kharetrofitlatihan.view

import android.content.Intent
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
            val usersIntent = Intent(this@MainActivity, UserActivity::class.java)
            startActivity(usersIntent)
        }

        binding.btnPosts.setOnClickListener {
            val postIntent = Intent(this@MainActivity, PostActivity::class.java)
            startActivity(postIntent)
        }
    }
}
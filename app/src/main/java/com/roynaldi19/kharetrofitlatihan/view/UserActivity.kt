package com.roynaldi19.kharetrofitlatihan.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.roynaldi19.kharetrofitlatihan.adapter.UserAdapter
import com.roynaldi19.kharetrofitlatihan.api.RetrofitClient
import com.roynaldi19.kharetrofitlatihan.databinding.ActivityUserBinding
import com.roynaldi19.kharetrofitlatihan.model.User
import com.roynaldi19.kharetrofitlatihan.model.UsersResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserBinding
    private var list = ArrayList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvUsers.setHasFixedSize(true)
        binding.rvUsers.layoutManager = LinearLayoutManager(this)
        RetrofitClient.instances.getUsers().enqueue(object : Callback<UsersResponse> {
            override fun onResponse(call: Call<UsersResponse>, response: Response<UsersResponse>) {
                binding.tvResponse.text = response.code().toString()
                val listResponse = response.body()?.data
                listResponse?.let { list.addAll(it) }

                val adapter = UserAdapter(list)
                binding.rvUsers.adapter = adapter

            }

            override fun onFailure(call: Call<UsersResponse>, t: Throwable) {
                binding.tvResponse.text = t.message
            }

        })
    }
}
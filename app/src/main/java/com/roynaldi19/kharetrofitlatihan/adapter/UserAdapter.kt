package com.roynaldi19.kharetrofitlatihan.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.roynaldi19.kharetrofitlatihan.databinding.ItemListBinding
import com.roynaldi19.kharetrofitlatihan.model.User

class UserAdapter(private val list: ArrayList<User>) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    class UserViewHolder(var binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val (id, email, first_name, last_name) = list[position]
        val text = "$id" +
                "$email" +
                "$first_name" +
                "$last_name"
        holder.binding.tvResponse.text = text
    }

    override fun getItemCount() = list.size
}
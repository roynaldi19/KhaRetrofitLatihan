package com.roynaldi19.kharetrofitlatihan.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
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
        val ( first_name, email, avatar) = list[position]
        Glide.with(holder.itemView.context)
            .load(avatar)
            .circleCrop()
            .into(holder.binding.avatar)
        holder.binding.tvFirstName.text = first_name
        holder.binding.tvEmail.text = email
    }

    override fun getItemCount() = list.size
}
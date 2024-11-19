package com.example.luisgustavo_rm96258.viewmodel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.luisgustavo_rm96258.Model.Dica

class DicaAdapter : RecyclerView.Adapter<DicaAdapter.ItemViewHolder>() {
    private val items = mutableListOf<Dica>()
    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        TODO("Not yet implemented")
    }
    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
    fun addItem(newItem: Dica) {

    }
}




package com.example.foodmenufragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter ( private val context: Context, private val foodMenu: List<DataClass> ) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder ( private val view : View ) : RecyclerView.ViewHolder(view) {
        val foodName : TextView = view.findViewById(R.id.menuFood)
        val foodPrice : TextView = view.findViewById(R.id.menuPrice)
        val foodImage : ImageView = view.findViewById(R.id.menuImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = foodMenu[position]
        holder.foodName.text = context.resources.getString(item.foodResourceId)
        holder.foodPrice.text = context.resources.getString(item.priceResourceId)
        holder.foodImage.setImageResource(item.imageResourceId)

        holder.itemView.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("food", item.foodResourceId)
            bundle.putInt("price", item.priceResourceId)
            bundle.putInt("image", item.imageResourceId)
            bundle.putInt("details", item.detailsResourceId)

            holder.itemView.findNavController().navigate(R.id.action_menuFragment_to_detailFragment, bundle)
        }
    }

    override fun getItemCount(): Int {
        return foodMenu.size
    }
}
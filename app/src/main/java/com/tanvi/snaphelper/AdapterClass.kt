package com.tanvi.snaphelper

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class AdapterClass ( val itemDataList:List<ItemData>):RecyclerView.Adapter<AdapterClass.ItemViewHolder>(){
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
      val imageView:ImageView=itemView.findViewById(R.id.ivImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.row,parent,false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val data = itemDataList[position]
        holder.imageView.setImageResource(data.image)
    }

    override fun getItemCount(): Int {
        return itemDataList.size

    }
}
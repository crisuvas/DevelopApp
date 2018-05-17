package com.ruiz.cris.bullyingapp20

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class AdapterInfographic(var list: ArrayList<Infographic>): RecyclerView.Adapter<AdapterInfographic.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.content_item_main, parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){

        fun bindItems(data:Infographic){
            val name : TextView = itemView.findViewById(R.id.tvMainTitle)
            val description : TextView = itemView.findViewById(R.id.tvMainText)
            val image: ImageView = itemView.findViewById(R.id.imgViewMain)

            name.text = data.title
            description.text = data.text
            Glide.with(itemView.context).load(data.imgId).into(image)

            itemView.setOnClickListener{

            }
        }
    }
}
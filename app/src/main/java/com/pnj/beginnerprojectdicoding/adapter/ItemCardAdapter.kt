package com.pnj.beginnerprojectdicoding.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.pnj.beginnerprojectdicoding.R
import com.pnj.beginnerprojectdicoding.model.Content

class ItemCardAdapter(private val dataset: List<Content>, private val listener: (Content) -> Unit): RecyclerView.Adapter<ItemCardAdapter.ItemCardViewHolder>() {

    class ItemCardViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.content_title)
        val image: ImageView = view.findViewById(R.id.content_image)
        val genre: TextView = view.findViewById(R.id.content_genre)
        val overview: TextView = view.findViewById(R.id.content_overview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemCardViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_card, parent, false)

        return  ItemCardViewHolder(view)
    }
    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: ItemCardViewHolder, position: Int) {
        val content = dataset[position]

        holder.image.setImageResource(content.imageResourceId)
        holder.title.text = content.title
        holder.genre.text = content.genre.joinToString(", ")
        holder.overview.text = content.overview
        holder.itemView.setOnClickListener {listener(content)}
    }
}
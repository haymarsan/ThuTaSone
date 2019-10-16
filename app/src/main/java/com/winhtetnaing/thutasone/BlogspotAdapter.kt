package com.winhtetnaing.thutasone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import com.squareup.picasso.Picasso
import com.winhtetnaing.thutasone.data.model.Entry
import kotlinx.android.synthetic.main.list_item.view.*
import java.text.SimpleDateFormat

class BlogspotAdapter : RecyclerView.Adapter<BlogspotAdapter.BlogspotViewHolder>() {
    var entryList: List<Entry> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogspotViewHolder {
        return BlogspotViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.list_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = entryList.size

    override fun onBindViewHolder(holder: BlogspotViewHolder, position: Int) {

        holder.itemView.tvBlogTitle.text = entryList[position].title.value
        holder.itemView.tvBlogDate.text =
            SimpleDateFormat("dd MMM, yyyy HH:MM:SS").format(entryList[position].published.value)
        holder.itemView.tvBlogDescription.text = entryList[position].title.value+ "....."
        Picasso.get().load(entryList[position].mediaThumb.url).into(holder.itemView.ivBlogImage)
    }

    interface OnItemClickListener {
        fun onItemClick(entry: Entry)
    }

    private var listener: OnItemClickListener? = null


    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener
    }

    inner class BlogspotViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.findViewById<MaterialCardView>(R.id.cdMain).setOnClickListener {
                val position = adapterPosition
                if (listener != null && position != RecyclerView.NO_POSITION) {
                    listener!!.onItemClick(entryList.get(position))
                }
            }
        }
    }
}
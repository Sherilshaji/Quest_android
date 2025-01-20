package com.example.exam

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        val myTextView:TextView=itemView.findViewById(R.id.textview1)
}
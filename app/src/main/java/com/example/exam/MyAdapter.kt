package com.example.exam

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(activity:RecyclerViewMain): RecyclerView.Adapter<MyViewHolder>() {

    private var mutableList= mutableListOf(
        "ABC",
        "DEF",
        "GHI",
        "JKL",
        "MNO"
    )

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val mContext=parent.context
        val layoutInflater=LayoutInflater.from(mContext)
        val view=layoutInflater.inflate(R.layout.recyclerview_row,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mutableList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val text1 = mutableList[position]
        holder.myTextView.text = text1
    }
}
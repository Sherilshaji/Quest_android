package com.example.exam

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewMain:Fragment() {

    private lateinit var mRecyclerView: RecyclerView
    private var mAdapter: MyAdapter = MyAdapter(this)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView=inflater.inflate(R.layout.recyclerview_main,container,false)
        mRecyclerView=rootView.findViewById(R.id.recycler1)
        mRecyclerView.layoutManager= LinearLayoutManager(context,RecyclerView.VERTICAL,false)
        mRecyclerView.adapter=mAdapter
        return rootView
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}
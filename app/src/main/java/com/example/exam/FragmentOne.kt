package com.example.exam

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragmentOne:Fragment() {

    private lateinit var mRecyclerView: RecyclerView
    private var mAdapter: MyAdapter = MyAdapter()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView=inflater.inflate(R.layout.fragment1,container,false)
        mRecyclerView=rootView.findViewById(R.id.recycler1)
        mRecyclerView.layoutManager= LinearLayoutManager(context,RecyclerView.VERTICAL,false)
        mRecyclerView.adapter=mAdapter
        return rootView
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}
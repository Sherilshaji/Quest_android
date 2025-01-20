package com.example.exam

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class FragmentTwo: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView=inflater.inflate(R.layout.view_main,container,false)

        val tabLayout=rootView.findViewById<TabLayout>(R.id.tabLayout)
        val viewPager=rootView.findViewById<ViewPager2>(R.id.viewPager)

        val viewFragmentOne=ViewPagerFragment1()
        val viewFragmentTwo=ViewPagerFragment2()

        val adapter=ViewAdapter(this)
        adapter.addFragment(viewFragmentOne,"Fragment1")
        adapter.addFragment(viewFragmentTwo,"Fragment2")

        viewPager.adapter=adapter
        viewPager.currentItem=0
        viewPager.offscreenPageLimit=1
                TabLayoutMediator(tabLayout, viewPager){ tab,position->
                    tab.text=adapter.getTabTitle(position)
                }.attach()
        return rootView
    }

}
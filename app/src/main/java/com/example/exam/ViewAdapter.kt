package com.example.exam

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewAdapter(fragment: Fragment):FragmentStateAdapter(fragment) {

    val mFragmentList:MutableList<Fragment> = ArrayList()
    val mFragmentTitleList:MutableList<String> = ArrayList()


    override fun getItemCount(): Int {
        return mFragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return mFragmentList[position]
    }
    fun getTabTitle(position: Int):String{
        return mFragmentTitleList[position]
    }
    fun addFragment(fragment: Fragment,title:String){
        mFragmentList.add(fragment)
        mFragmentTitleList.add(title)
    }

}
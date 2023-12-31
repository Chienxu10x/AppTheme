package com.example.appcc.base

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class BaseFragmentStateAdapter(fragment: BaseFragment) : FragmentStateAdapter(fragment) {
    private val listFragment = mutableListOf<Fragment>()
    private val listTitle = mutableListOf<String>()

    fun addFragment(fragment: Fragment, title : String){
        listFragment.add(fragment)
        listTitle.add(title)
    }
    fun  getTitle(position: Int): String{
        return listTitle[position]
    }
    override fun getItemCount(): Int {
        return listFragment.size
    }

    override fun createFragment(position: Int): Fragment {
        return listFragment[position]
    }
}
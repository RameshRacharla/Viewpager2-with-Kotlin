package com.rameshracharla.viewpager2.ui.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.rameshracharla.viewpager2.ui.activity.MainActivity
import com.rameshracharla.viewpager2.ui.fragment.FragmentOne
import com.rameshracharla.viewpager2.ui.fragment.FragmentThree
import com.rameshracharla.viewpager2.ui.fragment.FragmentTwo

class MyAdapter(mainActivity: MainActivity) : FragmentStateAdapter(mainActivity) {

    private val FRAGMENTS_SIZE = 3

    override fun getItemCount(): Int {
        return this.FRAGMENTS_SIZE
    }

    override fun createFragment(position: Int): Fragment {

        when (position) {
            0 -> {
                return FragmentOne()
            }
            1 -> {
                return FragmentTwo()
            }
            2 -> {
                return FragmentThree()
            }
        }
        return FragmentOne()
    }
}

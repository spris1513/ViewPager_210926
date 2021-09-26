package com.example.viewpager_210926.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpager_210926.fragments.AgeFragment
import com.example.viewpager_210926.fragments.GreetingFragment
import com.example.viewpager_210926.fragments.NameFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        if(position == 0){
            return "인사말"
        }
        else if (position == 1) {
            return "이름"
        }
        else {
            return "나이"
        }
    }

    override fun getCount(): Int {

        return 3

    }

    override fun getItem(position: Int): Fragment {

        if (position == 0){
            return GreetingFragment()
        }
        else if (position == 1){
            return NameFragment()
        }
        else {
            return AgeFragment()
        }

    }
}
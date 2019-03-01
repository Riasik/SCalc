package com.ryasik.scalc.Adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.ryasik.scalc.Fragments.FragmentThree
import com.ryasik.scalc.Fragments.FrontWheelFragment
import com.ryasik.scalc.Fragments.RearWheelFragment

class SampleAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? = when (position) {
        0 -> FrontWheelFragment.newInstance()
        1 -> RearWheelFragment.newInstance()
        2 -> FragmentThree.newInstance()
        else -> null
    }

    override fun getPageTitle(position: Int): CharSequence = when (position) {
        0 -> "TAB 1"
        1 -> "TAB 2"
        2 -> "TAB 3"
        else -> ""
    }

    override fun getCount(): Int = 3
}
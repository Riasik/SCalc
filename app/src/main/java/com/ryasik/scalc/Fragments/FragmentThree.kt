package com.ryasik.scalc.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ryasik.scalc.R

class FragmentThree: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater!!.inflate(R.layout.front_wheel_fragment, container, false)

    companion object {

        fun newInstance(): FragmentThree = FragmentThree()
    }
}
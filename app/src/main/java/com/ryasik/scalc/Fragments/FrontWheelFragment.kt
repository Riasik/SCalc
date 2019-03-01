package com.ryasik.scalc.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ryasik.scalc.R



class FrontWheelFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view : View? =inflater.inflate(R.layout.front_wheel_fragment, container, false)
        view?.findViewById<View>(R.id.btn_front_hub)!!.setOnClickListener(View.OnClickListener {
            ChoseDialogFragment().show(fragmentManager, "ChoseDialogFragment") })
        view?.findViewById<View>(R.id.btn_rim)!!.setOnClickListener(View.OnClickListener {
            ChoseDialogFragment().show(fragmentManager, "ChoseDialogFragment") })

        return view
    }

    companion object {
        fun newInstance(): FrontWheelFragment = FrontWheelFragment()
    }

}

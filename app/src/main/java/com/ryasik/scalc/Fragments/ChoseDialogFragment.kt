package com.ryasik.scalc.Fragments

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Spinner
import com.ryasik.scalc.R

class ChoseDialogFragment: DialogFragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var makerSp: Spinner = view?.findViewById<View>(R.id.maker_spinner) as Spinner
        var modelSp: Spinner = view?.findViewById<View>(R.id.model_spinner) as Spinner

        return inflater.inflate(R.layout.dialog_fragent, container)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }

    override fun onStart() {
        super.onStart()
        dialog.window?.setWindowAnimations(R.style.dialog_slide_animation)
    }
//    fun spinnerData(list: ArrayList<>) {
//
//    }
}
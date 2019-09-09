package com.example.utilitydemo

import android.annotation.SuppressLint
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.layout_dialog.*

@SuppressLint("ValidFragment")
class BottomSheetDialog : BottomSheetDialogFragment, View.OnClickListener {

    interface OnOptionSelectedListener {
        fun onOptionSelection(option: String)
    }

    private var listener: OnOptionSelectedListener
    private var mOptions: ArrayList<String>


    constructor(onOptionSlectedListener: OnOptionSelectedListener, options: ArrayList<String>) : super(){
        listener = onOptionSlectedListener
        mOptions = options
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return super.onCreateDialog(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.layout_dialog, container, false)
        view.findViewById<TextView>(R.id.text1).setOnClickListener(this)

        return view;
    }

    override fun onClick(p0: View?) {
        listener.onOptionSelection("Text1")
        dismiss()
    }

}
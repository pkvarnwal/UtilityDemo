package com.example.utilitydemo

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import java.util.ArrayList

class a : BottomSheetDialogFragment(){

    interface OnOptionSelectedListener {
        fun onOptionSelection(option: String)
    }

    private var mOnOptionSelectedListener: OnOptionSelectedListener? = null

    fun a(onOptionSelectedListener: OnOptionSelectedListener) {
        mOnOptionSelectedListener = onOptionSelectedListener
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return BottomSheetDialog(requireContext(), getTheme())
    }

    override fun onCreateView(inflater: LayoutInflater, parent: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.layout_dialog, parent, false)

        return view
    }
}
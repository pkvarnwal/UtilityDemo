package com.example.utilitydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
//        val text = edit.text.toString()
//
//        if (Utility.isNetworkAvailable(this)) {
//            Toast.makeText(this, "is valid", Toast.LENGTH_LONG).show()
//        } else {
//            Toast.makeText(this, "not valid", Toast.LENGTH_LONG).show()
//        }

        val bottomSheetDialog = BottomSheetDialog(object : BottomSheetDialog.OnOptionSelectedListener {

            override fun onOptionSelection(option: String) {
                Toast.makeText(this@MainActivity, option, Toast.LENGTH_LONG).show()
            }

        }, arrayListOf("Shree"))
        bottomSheetDialog.show(supportFragmentManager, bottomSheetDialog.tag)
    }
}

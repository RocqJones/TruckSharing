package com.yujun.trucksharing.msgutils

import android.text.Editable
import android.text.TextWatcher
import android.widget.TextView

class MyButtonObserver(private val mButton: TextView) : TextWatcher {
    override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
    override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
        mButton.isEnabled = charSequence.toString().trim { it <= ' ' }.isNotEmpty()
    }

    override fun afterTextChanged(editable: Editable) {}
}
package com.kareem.isocial.ui.base

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.kareem.isocial.R

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {
    abstract val LOG_TAG: String?
    abstract val LayoutInflater: (LayoutInflater) -> VB
    private var _binding: ViewBinding? = null

    protected val binding
        get() = _binding as VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ISocial)
        _binding = LayoutInflater(layoutInflater)
        setContentView(binding.root)
        setup()
    }

    abstract fun setup()
    protected fun log(msg: Any) {
        Log.v(LOG_TAG, msg.toString())
    }


}
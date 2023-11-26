package com.kareem.isocial.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kareem.isocial.R
import com.kareem.isocial.databinding.FragmentSearchBinding
import com.kareem.isocial.ui.base.BaseFragment

class SearchFragment : BaseFragment<FragmentSearchBinding>() {
    override val LOG_TAG: String = SearchFragment::class.java.simpleName
    override val LayoutInflater: (LayoutInflater) -> FragmentSearchBinding = FragmentSearchBinding::inflate

    override fun setup() {

    }

}
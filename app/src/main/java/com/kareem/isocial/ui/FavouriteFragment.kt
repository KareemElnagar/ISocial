package com.kareem.isocial.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kareem.isocial.R
import com.kareem.isocial.databinding.FragmentHomeBinding
import com.kareem.isocial.ui.base.BaseFragment


class FavouriteFragment : BaseFragment<FragmentHomeBinding>() {
    override val LOG_TAG: String = FavouriteFragment::class.java.simpleName
    override val LayoutInflater: (LayoutInflater) -> FragmentHomeBinding = FragmentHomeBinding::inflate

    override fun setup() {

    }

}
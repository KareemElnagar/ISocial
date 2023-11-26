package com.kareem.isocial.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kareem.isocial.R
import com.kareem.isocial.databinding.FragmentProfileBinding
import com.kareem.isocial.ui.base.BaseFragment


class ProfileFragment : BaseFragment<FragmentProfileBinding>() {
    override val LOG_TAG: String = ProfileFragment::class.java.simpleName
    override val LayoutInflater: (LayoutInflater) -> FragmentProfileBinding = FragmentProfileBinding::inflate

    override fun setup() {

    }

}
package com.kareem.isocial.ui

import android.content.Context
import android.view.LayoutInflater
import androidx.lifecycle.MutableLiveData
import com.kareem.isocial.databinding.FragmentProfileBinding
import com.kareem.isocial.ui.base.BaseFragment
import com.kareem.isocial.util.Constants


class ProfileFragment : BaseFragment<FragmentProfileBinding>() {
    override val LOG_TAG: String = ProfileFragment::class.java.simpleName
    override val LayoutInflater: (LayoutInflater) -> FragmentProfileBinding =
        FragmentProfileBinding::inflate
    private var userNameLiveData = MutableLiveData<String>()

    override fun setup() {
        saveUserName()
        loadUserName()

    }

    private fun loadUserName() {
        val sharedPreferences = requireActivity().getSharedPreferences(
            Constants.SHARED_PREFS_NAME,
            Context.MODE_PRIVATE
        )
        val userName = sharedPreferences.getString(Constants.USER_NAME, "")
        binding.usernameTV.text = userName

    }

    private fun saveUserName() {
        binding.saveButton.setOnClickListener {
            val sharedPreference =
                requireActivity().getSharedPreferences(
                    Constants.SHARED_PREFS_NAME,
                    Context.MODE_PRIVATE
                )
            val editor = sharedPreference.edit()
            val input = binding.usernameInput.text.toString()
            editor.putString(Constants.USER_NAME, input).apply()
        }
    }


}
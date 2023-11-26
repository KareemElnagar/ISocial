package com.kareem.isocial.ui

import android.view.LayoutInflater
import android.view.SurfaceControl.Transaction
import androidx.fragment.app.Fragment
import com.kareem.isocial.R
import com.kareem.isocial.databinding.ActivityMainBinding
import com.kareem.isocial.ui.base.BaseActivity
import com.kareem.isocial.ui.home.HomeFragment
import java.lang.Exception

class MainActivity : BaseActivity<ActivityMainBinding>(){
    private val homeFragment = HomeFragment()
    private val searchFragment = SearchFragment()
    private val favouriteFragment = FavouriteFragment()
    private val profileFragment = ProfileFragment()

    override val LOG_TAG = MainActivity::class.simpleName
    override val LayoutInflater: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate


    override fun setup() {
        replaceFragment(homeFragment)
        initBottomNav()

    }

    private fun replaceFragment(fragment: Fragment) {

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.sub_view_container,fragment)
        transaction.commit()

    }

    private fun initBottomNav() {
        binding.bottomNavBar.setOnItemSelectedListener {item->
            replaceFragment(
                when(item.itemId){
                    R.id.navHome -> homeFragment
                    R.id.navFav -> favouriteFragment
                    R.id.navProfile -> profileFragment
                    R.id.navSearch -> searchFragment
                    else-> throw Exception("UNKNOWN FRAGMENT")
                }
            )
            true

        }

    }
}
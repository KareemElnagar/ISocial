package com.kareem.isocial.ui.home

import android.view.LayoutInflater
import android.widget.Toast
import com.kareem.isocial.data.DataSource
import com.kareem.isocial.data.domain.HomeItem
import com.kareem.isocial.data.domain.Post
import com.kareem.isocial.data.domain.Story
import com.kareem.isocial.data.domain.enums.HomeItemType
import com.kareem.isocial.databinding.FragmentHomeBinding
import com.kareem.isocial.ui.base.BaseFragment
import com.kareem.isocial.util.toHomeItem

class HomeFragment : BaseFragment<FragmentHomeBinding>(), HomeActionsListener {
    override val LOG_TAG: String = HomeFragment::class.java.simpleName
    override val LayoutInflater: (LayoutInflater) -> FragmentHomeBinding =
        FragmentHomeBinding::inflate

    lateinit var adapter: HomeAdapter
    override fun setup() {
        initRecycler()

    }

    fun initRecycler() {
        val itemsList: MutableList<HomeItem<Any>> = mutableListOf()
        itemsList.add(HomeItem(DataSource.getStories(), HomeItemType.TYPE_STORY))
        itemsList.add(HomeItem("Update your status", HomeItemType.TYPE_NEW_POST))
        itemsList.addAll(
            DataSource.getPost().map {
                it.toHomeItem()
            })
        adapter = HomeAdapter(
            itemsList, this
        )
        binding.recyclerHome.adapter = adapter
    }

    override fun onFavouritePost(post: Post) {
        Toast.makeText(context, "Coming soon", Toast.LENGTH_SHORT).show()
    }

    override fun onSharePost() {
        Toast.makeText(context, "Coming soon", Toast.LENGTH_SHORT).show()
    }

    override fun onClickStory(story: Story) {
        Toast.makeText(context, "Coming soon", Toast.LENGTH_SHORT).show()
    }

    override fun addStory() {
        Toast.makeText(context, "Coming soon", Toast.LENGTH_SHORT).show()
    }

}
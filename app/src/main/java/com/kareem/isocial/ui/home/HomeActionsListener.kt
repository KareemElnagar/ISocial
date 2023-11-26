package com.kareem.isocial.ui.home

import com.kareem.isocial.data.domain.Post
import com.kareem.isocial.data.domain.Story

interface HomeActionsListener {
    fun onFavouritePost(post: Post)
    fun onSharePost()
    fun onClickStory(story: Story)
    fun addStory()

}
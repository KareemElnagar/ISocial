package com.kareem.isocial.util

import com.kareem.isocial.data.domain.HomeItem
import com.kareem.isocial.data.domain.Post
import com.kareem.isocial.data.domain.enums.HomeItemType

fun Post.toHomeItem(): HomeItem<Any> {
    return HomeItem(this, HomeItemType.TYPE_POST)
}
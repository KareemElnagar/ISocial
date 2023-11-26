package com.kareem.isocial.data.domain

import com.kareem.isocial.data.domain.enums.HomeItemType

data class HomeItem<T> (
    val item : T,
    val type : HomeItemType,

    )
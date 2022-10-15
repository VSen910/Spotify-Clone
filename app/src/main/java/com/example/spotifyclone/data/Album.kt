package com.example.spotifyclone.data

import androidx.annotation.DrawableRes

data class Album(
    @DrawableRes val image: Int,
    val title: String,
    val artists: String
)

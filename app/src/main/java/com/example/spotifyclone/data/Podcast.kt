package com.example.spotifyclone.data

import androidx.annotation.DrawableRes

data class Podcast(
    @DrawableRes val image: Int,
    val genre: String,
    val title: String,
    val creator: String
)
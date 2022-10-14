package com.example.spotifyclone.data

import androidx.annotation.DrawableRes

data class SongsCard(
    @DrawableRes val image: Int,
    val title: String,
    val artist: String
)

package com.example.spotifyclone.data

import androidx.annotation.DrawableRes

data class SongUiState(
    @DrawableRes val image: Int = 0,
    val title: String = "",
    val artists: String = ""
)

package com.example.spotifyclone.ui

import androidx.annotation.DrawableRes
import androidx.lifecycle.ViewModel
import com.example.spotifyclone.data.SongUiState
import com.example.spotifyclone.data.SongsCard
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SongViewModel: ViewModel() {
    private val _uistate = MutableStateFlow(SongUiState())
    val uiState: StateFlow<SongUiState> = _uistate.asStateFlow()

    fun setImage(@DrawableRes image: Int) {
        _uistate.update { currentState ->
            currentState.copy(image = image)
        }
    }

    fun setTitle(title: String) {
        _uistate.update {
            it.copy(title = title)
        }
    }

    fun setArtists(artists: String) {
        _uistate.update {
            it.copy(artists = artists)
        }
    }

    fun setSong(song: SongsCard) {
        _uistate.update {
            it.copy(
                image = song.image,
                title = song.title,
                artists = song.artist
            )
        }
    }
}
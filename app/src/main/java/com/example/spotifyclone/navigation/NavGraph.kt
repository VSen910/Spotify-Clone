package com.example.spotifyclone.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.spotifyclone.Lib
import com.example.spotifyclone.Premium
import com.example.spotifyclone.R
import com.example.spotifyclone.ui.*

@Composable
fun NavGraph (
    navController: NavHostController,
    viewModel: SongViewModel = viewModel()
){
    val uiState by viewModel.uiState.collectAsState()

    NavHost(
        navController = navController,
        startDestination =  Screens.Home.route )
    {

        composable(route = Screens.Home.route) {
            Home(navController = navController)
        }
        composable(route = Screens.Search.route) {
            Search(navController = navController)
        }
        composable(route = Screens.Library.route) {
            Lib(navController = navController)
        }
        composable(route = Screens.Premium.route) {
            Premium(navController = navController)
        }
        composable(route = Screens.LikedSongs.route) {
            SongListPage(
                navController = navController,
                onClick = {
                    viewModel.setSong(it)
                    navController.navigate(route = "NowPlaying")
                }
            )
        }
        composable(route = Screens.NowPlaying.route) {
            Now(
                navController = navController,
                songUiState = uiState
            )
        }
    }
}
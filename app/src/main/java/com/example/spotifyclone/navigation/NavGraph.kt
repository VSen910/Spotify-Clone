package com.example.spotifyclone.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.spotifyclone.Lib
import com.example.spotifyclone.Premium
import com.example.spotifyclone.R
import com.example.spotifyclone.ui.Home
import com.example.spotifyclone.ui.Search

@Composable
fun NavGraph (navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination =  Screens.Home.route )
    {
        composable(route = Screens.Home.route) {
            Home(navController)
        }
        composable(route = Screens.Search.route) {
            Search(navController)
        }
        composable(route = Screens.Library.route) {
            Lib(navController)
        }
        composable(route = Screens.Premium.route) {
            Premium(navController)
        }

    }
}
package com.example.spotifyclone.navigation

sealed class Screens(
    val route: String
) {
    object Home: Screens("HomeScreen")
    object Search: Screens("SearchScreen")
    object Library: Screens("LibraryPage")
    object Premium: Screens("PremiumPage")
}

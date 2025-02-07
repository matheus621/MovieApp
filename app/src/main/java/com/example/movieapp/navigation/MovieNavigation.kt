package com.example.movieapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.movieapp.screens.home.HomeScreen

@Composable
fun MovieNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = MoviesScreens.HomeScreen.name) {
        composable(MoviesScreens.HomeScreen.name) {
            HomeScreen(navController = navController)
        }
    }
}
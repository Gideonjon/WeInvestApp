package com.example.weinvestapp.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.weinvestapp.screens.OnboardingScreen
import com.example.weinvestapp.screens.SplashScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Screens.SplashScreen.route

    ) {
        composable(
            route = Screens.SplashScreen.route
        ) {
            SplashScreen(navController = navController)
        }
        composable(
            route = Screens.OnboardingScreen.route
        ) {
            OnboardingScreen(navController = navController)
        }

    }


}
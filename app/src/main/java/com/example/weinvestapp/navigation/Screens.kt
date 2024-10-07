package com.example.weinvestapp.navigation

sealed class Screens(val route : String) {
    object SplashScreen : Screens(route = "SplashScreen")
    object OnboardingScreen : Screens(route = "OnboardingScreen")



}
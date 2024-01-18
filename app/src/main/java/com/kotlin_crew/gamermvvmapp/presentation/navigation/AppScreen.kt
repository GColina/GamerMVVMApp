package com.kotlin_crew.gamermvvmapp.presentation.navigation

sealed class AppScreen(val route: String) {
    object Login : AppScreen("login")
    object SignUp : AppScreen("signup")
}
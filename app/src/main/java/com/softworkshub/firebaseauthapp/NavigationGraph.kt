package com.softworkshub.firebaseauthapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.softworkshub.firebaseauthapp.pages.HomeView
import com.softworkshub.firebaseauthapp.pages.LoginView
import com.softworkshub.firebaseauthapp.pages.SignUpView

@Composable
fun NavigationGraph(authViewModel: AuthViewModel) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login", builder = {
        composable("login") {
            LoginView(authViewModel, navController)
        }
        composable("signup") {
            SignUpView(authViewModel, navController)
        }
        composable("home") {
            HomeView(authViewModel, navController)
        }
    })
}
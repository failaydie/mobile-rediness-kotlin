package com.example.mobile_readiness_kotlin.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mobile_readiness_kotlin.ui.account.Account
import com.example.mobile_readiness_kotlin.ui.detail_movie.DetailMovie
import com.example.mobile_readiness_kotlin.ui.favorite.Favorite
import com.example.mobile_readiness_kotlin.ui.home.Home

@Composable
fun NavGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController = navController, startDestination = "home", modifier = modifier) {
        composable("home") { Home(navController) }
        composable("favorite") { Favorite() }
        composable("account") { Account() }
        composable("detail") { DetailMovie() }

    }
}
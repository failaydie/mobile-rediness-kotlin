package com.example.mobile_readiness_kotlin.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.navigation.NavController
import com.example.mobile_readiness_kotlin.R

@Composable
fun Navbar(navController: NavController) {
    NavigationItem(
        navController = navController,
        items = listOf(
            NavigationItemModel(
                name = "Home",
                route = "home",
                icon = ImageVector.vectorResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Go to Home"
            ),
            NavigationItemModel(
                name = "Favorite",
                route = "favorite",
                icon = ImageVector.vectorResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Go to Profile"
            ),
            NavigationItemModel(
                name = "Account",
                route = "account",
                icon = ImageVector.vectorResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Go to Settings"
            )
        )
    )
}
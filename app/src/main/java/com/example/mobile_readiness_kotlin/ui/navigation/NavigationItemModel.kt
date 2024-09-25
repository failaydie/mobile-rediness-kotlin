package com.example.mobile_readiness_kotlin.ui.navigation

import androidx.compose.ui.graphics.vector.ImageVector

data class NavigationItemModel(
    val name: String,
    val route: String,
    val icon: ImageVector,
    val contentDescription: String
)

package com.example.mobile_readiness_kotlin.ui.navigation

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun NavigationItem(navController: NavController, items: List<NavigationItemModel>) {
    NavigationBar(
        modifier = Modifier
            .fillMaxWidth()
            .height(65.dp),
        containerColor = Color.White) {
        val backStackEntry = navController.currentBackStackEntryAsState()
        items.forEach { item ->
            val isSelected = item.route == backStackEntry.value?.destination?.route
            NavigationBarItem(
                selected = isSelected,
                onClick = { navController.navigate(item.route) },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.contentDescription,
                    )
                },
                label = { Text(item.name) },
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxHeight(),
            )
        }
    }
}
package com.example.mobile_readiness_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.mobile_readiness_kotlin.ui.components.card.CardMovie
import com.example.mobile_readiness_kotlin.ui.navigation.NavGraph
import com.example.mobile_readiness_kotlin.ui.navigation.Navbar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            Scaffold(
                bottomBar = {
                    Navbar(navController = navController)
                }
            ) { innerPadding ->
                NavGraph(navController = navController, modifier = Modifier.padding(innerPadding))
            }
        }
    }
}



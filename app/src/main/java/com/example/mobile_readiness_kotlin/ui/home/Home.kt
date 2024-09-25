package com.example.mobile_readiness_kotlin.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Home(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        val scrollState = rememberScrollState()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .padding(18.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(
                text = "Hello, Faikar Mochamad Ghifari!",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedTextField(
                    value = "Search Movie...",
                    onValueChange = { },
                    modifier = Modifier
                        .padding(end = 10.dp)
                        .height(45.dp)
                        .weight(1f),
                    singleLine = true
                )
                Button(
                    shape = RoundedCornerShape(5.dp),
                    onClick = { },
                    modifier = Modifier
                        .height(45.dp)
                ) {
                    Text(text = "Search")
                }
            }
            NowPlaying()
            Popular()
            Text(
                text = "Top Rated",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
            TopRated()
            TopRated()
            TopRated()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ShowHome() {
    val navController = rememberNavController()
    Home(navController = navController)
}




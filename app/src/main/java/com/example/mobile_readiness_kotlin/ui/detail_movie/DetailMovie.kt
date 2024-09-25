package com.example.mobile_readiness_kotlin.ui.detail_movie

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mobile_readiness_kotlin.R
import com.example.mobile_readiness_kotlin.ui.components.card.CardMovie

@Composable
fun DetailMovie() {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        CardMovie(imageResId = R.drawable.wednesday, type = "basic",)
    }
}

@Preview(showBackground = true)
@Composable
fun ShowDetailMovie() {
    DetailMovie()
}

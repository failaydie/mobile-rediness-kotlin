package com.example.mobile_readiness_kotlin.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobile_readiness_kotlin.R
import com.example.mobile_readiness_kotlin.ui.components.card.CardMovie

@Composable
fun NowPlaying(){
    Text(
        text = "Now Playing",
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold
    )
    LazyRow(
        modifier = Modifier
            .height(210.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        items(5) {
            CardMovie(
                imageResId = R.drawable.wednesday,
                title = "Wednesday",
                otherInfo = "23 Nov 2024"
            )
        }
    }
}
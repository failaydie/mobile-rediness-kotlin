package com.example.mobile_readiness_kotlin.ui.components.card

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.mobile_readiness_kotlin.R

@Composable
fun CardMovie(
    imageResId: Int,
    type: String? = "withDescription",
    title: String? = "",
    otherInfo: String? = ""
) {
    Box(
    ) {
        MovieCardContent(
            imageResId = imageResId,
            title = title ?: "",
            otherInfo = otherInfo ?: "",
            type = type ?: "withDescription"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ShowCard() {
    CardMovie(
        imageResId = R.drawable.wednesday,
        title = "Wednesday",
        otherInfo = "23 Nov 2024"
    )
}







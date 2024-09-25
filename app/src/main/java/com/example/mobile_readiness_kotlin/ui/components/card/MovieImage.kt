package com.example.mobile_readiness_kotlin.ui.components.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun MovieImage(imageResId: Int, type: String? = "withDescription") {
    Image(
        painter = painterResource(id = imageResId),
        contentDescription = "null",
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(if (type == "basic") 1f else 0.8f)
            .padding(bottom = if (type == "basic") 0.dp else 5.dp),
        contentScale = ContentScale.FillBounds
    )
}

package com.example.mobile_readiness_kotlin.ui.components.card

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MovieCardContent(
    imageResId: Int,
    type: String? = "withDescription",
    title: String? =  "",
    otherInfo: String? = "",
) {
    Card(
        modifier = Modifier
            .width(125.dp)
            .wrapContentHeight(),
        elevation = CardDefaults.cardElevation(5.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            MovieImage(imageResId, type = type)
            if (type == "withDescription") {
                TextItem(title = title, otherInfo = otherInfo)
            }
        }
    }
}




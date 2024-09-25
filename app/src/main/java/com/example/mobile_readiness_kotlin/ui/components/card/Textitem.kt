package com.example.mobile_readiness_kotlin.ui.components.card

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextItem(title: String? = "", otherInfo: String? = ""){
    Text(
        text = title ?: "",
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold,
        modifier = Modifier
            .padding(horizontal = 10.dp)
    )
    Text(
        text = otherInfo ?: "",
        fontSize = 11.sp,
        fontWeight = FontWeight.Normal,
        modifier = Modifier
            .padding(horizontal = 10.dp, vertical = 0.dp)
    )
}

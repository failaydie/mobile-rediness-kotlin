package com.example.mobile_readiness_kotlin.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobile_readiness_kotlin.R

@Composable
fun TopRated() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        elevation = CardDefaults.cardElevation(5.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
    ) {
        Row(
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.wednesday),
                contentDescription = "null",
                modifier = Modifier
                    .width(110.dp)
                    .fillMaxHeight(),
                contentScale = ContentScale.FillBounds
            )
            Column(
                modifier = Modifier
                    .padding(horizontal = 25.dp, vertical = 30.dp)
            ) {
                Text(
                    text = "Wednesday",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 2.dp)
                )
                Text(
                    text = "22 Nov 2024",
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(bottom = 6.dp)
                )
                Text(
                    text = "Film pendek berjudul Anak Lanang ini akan menceritakan empat anak yang sedang menaiki becak. Selama perjalanan tersebut, keempat anak laki-laki membahas berbagai masalah kehidupan sehari-hari. Film ini juga terpengaruh oleh perceraian orang tuanya.",
                    fontSize = 9.sp,
                    fontWeight = FontWeight.Normal,
                )
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun ShowTopRated() {
    TopRated()
}
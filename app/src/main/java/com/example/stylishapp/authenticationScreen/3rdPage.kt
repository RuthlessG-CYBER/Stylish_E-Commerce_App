package com.example.stylishapp.authenticationScreen

import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Row


import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.stylishapp.R

@Composable
fun ThirdPage(navController: NavController){

    Box(modifier = Modifier.fillMaxSize())
    {
        Card(modifier = Modifier
            .padding(start = 20.dp, top = 40.dp)
            .align(Alignment.TopStart),
            colors = CardDefaults.cardColors(
                containerColor = Color.Transparent
            ))
        {
            Text("2/3",
                fontSize = 20.sp,
                fontStyle = FontStyle.Normal,
                color = Color.Red,
                fontWeight = FontWeight.Black
            )
        }

        Spacer(modifier = Modifier
            .height(190.dp))

        Card(modifier = Modifier
            .align(Alignment.Center),
            colors = CardDefaults.cardColors(
                containerColor = Color.Transparent,
                contentColor = Color.Transparent
            ))
        {
            Card(
                modifier = Modifier
                    .height(250.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.Transparent
                )
            )
            {
                Image(
                    painter = painterResource(R.drawable.third_page1),
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Card(
                modifier = Modifier
                    .height(30.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.Transparent
                )
            ) {
                Text(
                    "Make Payment",
                    modifier = Modifier.fillMaxSize(),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            }

            Spacer(modifier = Modifier.height(5.dp))

            Card(
                modifier = Modifier
                    .height(100.dp)
                    .width(350.dp)
                    .padding(5.dp)
                    .align(Alignment.CenterHorizontally),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.Transparent
                )
            ) {
                Text(
                    "Payment Karo koi bat nahi but bad me kuch nahi pata mujhe",
                    modifier = Modifier.fillMaxSize(),
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black,
                    fontStyle = FontStyle.Italic
                )
            }
        }
        Card(modifier = Modifier
            .height(65.dp)
            .padding(5.dp)
            .align(Alignment.BottomCenter),
            colors = CardDefaults.cardColors(
                containerColor = Color.Transparent,
                contentColor = Color.Transparent
            ))
        {
            Row(modifier = Modifier
                .height(55.dp)
                .padding(bottom = 15.dp)
                .padding(start = 5.dp, end = 5.dp)
                .fillMaxWidth())
            {
                TextButton(onClick = { navController.navigate("SecondPage") },
                    modifier = Modifier.width(120.dp)
                )
                {
                    Text("<-Previous",
                        textAlign = TextAlign.Center,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Black,
                        color = Color.Black,
                        fontStyle = FontStyle.Italic
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                TextButton(onClick = { navController.navigate("ForthPage") },
                    modifier = Modifier.width(80.dp)
                )
                {
                    Text("Next->",
                        textAlign = TextAlign.Center,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Black,
                        color = Color.Red,
                        fontStyle = FontStyle.Italic
                    )
                }
            }
        }
    }

}
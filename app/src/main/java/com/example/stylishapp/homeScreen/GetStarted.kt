package com.example.stylishapp.homeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
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
fun GetStarted(navController: NavController){
    Column(modifier = Modifier.fillMaxSize())
    {
        Box(modifier = Modifier.fillMaxSize())
        {

            Image(painter = painterResource(R.drawable.background_7th), contentDescription = "BackGround Style Image",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Box(modifier = Modifier.padding(top = 482.dp)
                .background(Color(0xFF000000).copy(alpha = 0.4f))
                )
            {
                Card(modifier = Modifier.fillMaxSize(),
                    colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.White
                )
                )
                {
                    Spacer(Modifier.height(90.dp))

                    Card(modifier = Modifier
                        .align(Alignment.CenterHorizontally),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent,
                            contentColor = Color.White
                        )
                        ){
                        Text("You want",
                            textAlign = TextAlign.Center,
                            color = Color.White,
                            fontSize = 34.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                    Card(modifier = Modifier
                        .align(Alignment.CenterHorizontally),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent,
                            contentColor = Color.White
                        )
                        ){
                        Text("Authentic, here",
                            textAlign = TextAlign.Center,
                            color = Color.White,
                            fontSize = 34.sp,
                            fontWeight = FontWeight.Medium,
                        )
                    }
                    Card(modifier = Modifier
                        .align(Alignment.CenterHorizontally),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent,
                            contentColor = Color.White
                        )
                        ){
                        Text("you go!",
                            textAlign = TextAlign.Center,
                            color = Color.White,
                            fontSize = 34.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }

                    Spacer(Modifier.height(10.dp))

                    Card(modifier = Modifier
                        .align(Alignment.CenterHorizontally),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent,
                            contentColor = Color.White
                        )
                    ){
                        Text("Find it here, buy it now!",
                            textAlign = TextAlign.Center,
                            color = Color.White,
                            fontSize = 14.sp,
                            fontStyle = FontStyle.Normal
                        )
                    }

                    Spacer(Modifier.height(45.dp))

                    TextButton(onClick = { navController.navigate("home") },
                        modifier = Modifier
                            .height(55.dp)
                            .width(279.dp)
                            .align(Alignment.CenterHorizontally),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFF83758),
                            contentColor = Color.White
                        ),
                        shape = RoundedCornerShape(5.dp)
                        )
                    {
                        Text("Get Started",
                            fontSize = 23.sp
                            )
                    }
                }
            }
        }
    }
}
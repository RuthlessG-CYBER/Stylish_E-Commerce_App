package com.example.stylishapp.splashScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.stylishapp.R
import kotlinx.coroutines.delay

@Composable
fun FirstPage(navController: NavController) {

    LaunchedEffect(Unit) {
        delay(2000)
        navController.navigate("SecondPage") {
            popUpTo(navController.graph.startDestinationId) { inclusive = true }
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.stylish),
            contentDescription = "Stylish",
            modifier = Modifier
                .height(100.dp)
                .width(250.dp)
        )
    }
}
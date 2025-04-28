package com.example.stylishapp.authenticationScreen


import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ForgotPassword(navController: NavController){
    var email by remember { mutableStateOf("") }

    Card(modifier = Modifier
        .fillMaxSize(),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent
        )
        )
    {
        Card(modifier = Modifier
            .height(150.dp)
            .fillMaxWidth()
            .padding(top = 25.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Transparent
            )
            ) {
            TextButton(onClick = {navController.navigate("FifthPage")},
                modifier = Modifier
                    .height(35.dp)
                    .width(70.dp)
                    .align(Alignment.End))
            {
                Text("Back",
                    textAlign = TextAlign.Center,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Bold,
                    color = Color.Red
                )
            }
            Card(modifier = Modifier
                .height(100.dp)
                .width(220.dp)
                .align(Alignment.Start),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                )
            ){
                Text(
                    "Forgot",
                    modifier = Modifier
                        .padding(top = 1.dp, start = 15.dp),
                    color = Color.Black,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic
                )
                Text(
                    "Password?",
                    modifier = Modifier
                        .padding(start = 15.dp),
                    color = Color.Black,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic
                )
            }
        }

        Spacer(Modifier.height(20.dp))

        OutlinedTextField(
            modifier = Modifier
                .height(65.dp)
                .width(380.dp)
                .align(Alignment.CenterHorizontally),
            shape = RoundedCornerShape(20.dp),
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "Email Icon"
                )
            }
        )

        Card(modifier = Modifier
            .padding(start = 30.dp, end = 30.dp, top = 10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Transparent
            )
            )
        {
            Text("* We will send you a message to set or reset your new password",
                modifier = Modifier,
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold
            )
        }

        Spacer(Modifier.height(20.dp))

        Card(
            modifier = Modifier
                .height(55.dp)
                .width(380.dp)
                .align(Alignment.CenterHorizontally),
            colors = CardDefaults.cardColors(
                containerColor = Color.Red,
                contentColor = Color.White
            )
        )
        {
            Text("Submit",
                fontSize = 20.sp,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 15.dp))

        }
    }
}
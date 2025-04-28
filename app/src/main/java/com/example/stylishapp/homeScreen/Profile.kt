package com.example.stylishapp.homeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.stylishapp.R

@Composable
fun Profile(navController: NavController){
    var email1 by remember { mutableStateOf("") }
    var password1 by rememberSaveable { mutableStateOf("") }
    var pin by remember { mutableStateOf("") }
    var city by remember { mutableStateOf("") }
    var address by remember { mutableStateOf("") }
    var state by remember { mutableStateOf("") }
    var country by remember { mutableStateOf("") }



    Column(modifier = Modifier
        .fillMaxSize()
    )
    {
        Spacer(Modifier.height(30.dp))

        Card(
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth()
                .padding(start = 5.dp, end = 7.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Transparent
            )
        )
        {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 10.dp, end = 10.dp)
            )
            {
                IconButton(
                    onClick = {navController.navigate("home")},
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .height(30.dp)
                        .width(30.dp)
                )
                {
                    Icon(
                        Icons.Default.KeyboardArrowLeft,
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize()
                    )
                }
                IconButton(
                    onClick = {},
                    modifier = Modifier.align(Alignment.CenterEnd)
                        .height(30.dp)
                        .width(30.dp)
                )
                {
                    Icon(
                        Icons.Default.ShoppingCart, contentDescription = "",
                        modifier = Modifier.fillMaxSize())
                }

                Card(modifier = Modifier
                    .align(Alignment.Center),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                    ){
                    Text("Profile",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Black
                        )
                }

            }
        }

        Card(modifier = Modifier
            .verticalScroll(rememberScrollState()),
            shape = RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Transparent
            )
        )
        {
            Card(modifier = Modifier
                .height(90.dp)
                .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                )
            )
            {
                Box(modifier = Modifier
                    .fillMaxSize())
                {
                    Card(modifier = Modifier
                        .align(Alignment.Center),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        )
                    )
                    {
                        Box{
                            Image(painter = painterResource(R.drawable.profile),
                                contentDescription = "Profile Edit",
                                Modifier.height(80.dp).width(80.dp)
                            )
                            OutlinedCard(modifier = Modifier
                                .height(23.dp)
                                .width(23.dp)
                                .align(Alignment.BottomEnd),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(0xFF3A9DBF)
                                ),
                                shape = RoundedCornerShape(10.dp)
                            )
                            {
                                Icon(Icons.Default.Edit,
                                    contentDescription = "",
                                    modifier = Modifier.fillMaxSize(),
                                    tint = Color.White
                                )
                            }
                        }
                    }
                }
            }

            Card(modifier = Modifier
                .padding(start = 15.dp, top = 20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                )
            )
            {
                Card(modifier = Modifier
                    .padding(start = 5.dp, end = 5.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                )
                {
                    Text("Personal Details",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Black,
                        fontStyle = FontStyle.Italic
                    )
                }
            }

            Spacer(Modifier.height(5.dp))

            Card(modifier = Modifier
                .padding(start = 17.dp, top = 10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                )
                )
            {
                Card(modifier = Modifier
                    .padding(start = 7.dp, end = 7.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                    )
                {
                    Text("Email Address",
                        fontSize = 13.sp
                    )
                }
            }

            Spacer(Modifier.height(10.dp))

            OutlinedTextField(
                value = email1,
                onValueChange = {email1 = it},
                modifier = Modifier
                    .height(48.dp)
                    .fillMaxWidth()
                    .padding(start = 24.dp, end = 24.dp)

            )

            Card(modifier = Modifier
                .padding(start = 17.dp, top = 10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                )
                )
            {
                Card(modifier = Modifier
                    .padding(start = 7.dp, end = 7.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                    )
                {
                    Text("Password",
                        fontSize = 13.sp
                    )
                }
            }

            Spacer(Modifier.height(10.dp))

            OutlinedTextField(
                value = password1,
                onValueChange = {password1 = it},
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                modifier = Modifier
                    .height(48.dp)
                    .fillMaxWidth()
                    .padding(start = 24.dp, end = 24.dp)

            )


            Card(onClick = {navController.navigate("changepassword")},
                modifier = Modifier
                .height(25.dp)
                .padding(start = 17.dp, top = 7.dp, end = 17.dp).align(Alignment.End),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                )
                )
            {
                Card(modifier = Modifier
                    .padding(start = 7.dp, end = 7.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                )
                {
                    Text("Change Password",
                        fontSize = 13.sp,
                        fontStyle = FontStyle.Italic,
                        textDecoration = TextDecoration.Underline,
                        color = Color(0xFFF83758),
                        modifier = Modifier.padding(start = 3.dp, end = 3.dp)
                    )
                }
            }

            Spacer(Modifier.height(10.dp))

            Card(modifier = Modifier
                .padding(start = 15.dp, top = 15.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                )
            )
            {
                Card(modifier = Modifier
                    .padding(start = 5.dp, end = 5.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                )
                {
                    Text("Personal Details",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Black,
                        fontStyle = FontStyle.Italic
                    )
                }
            }

            Spacer(Modifier.height(5.dp))

            Card(modifier = Modifier
                .padding(start = 17.dp, top = 10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                )
                )
            {
                Card(modifier = Modifier
                    .padding(start = 7.dp, end = 7.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                    )
                {
                    Text("Address",
                        fontSize = 13.sp
                    )
                }
            }

            Spacer(Modifier.height(10.dp))

            OutlinedTextField(
                value = address,
                onValueChange = {address = it},
                modifier = Modifier
                    .height(48.dp)
                    .fillMaxWidth()
                    .padding(start = 24.dp, end = 24.dp)

            )

            Spacer(Modifier.height(5.dp))

            Card(modifier = Modifier
                .padding(start = 17.dp, top = 10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                )
                )
            {
                Card(modifier = Modifier
                    .padding(start = 7.dp, end = 7.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                    )
                {
                    Text("PinCode",
                        fontSize = 13.sp
                    )
                }
            }

            Spacer(Modifier.height(10.dp))

            OutlinedTextField(
                value = pin,
                onValueChange = {pin = it},
                modifier = Modifier
                    .height(48.dp)
                    .fillMaxWidth()
                    .padding(start = 24.dp, end = 24.dp)

            )
            Spacer(Modifier.height(5.dp))

            Card(modifier = Modifier
                .padding(start = 17.dp, top = 10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                )
                )
            {
                Card(modifier = Modifier
                    .padding(start = 7.dp, end = 7.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                    )
                {
                    Text("State",
                        fontSize = 13.sp
                    )
                }
            }

            Spacer(Modifier.height(10.dp))

            OutlinedTextField(
                value = state,
                onValueChange = {state = it},
                modifier = Modifier
                    .height(48.dp)
                    .fillMaxWidth()
                    .padding(start = 24.dp, end = 24.dp)

            )
            Spacer(Modifier.height(5.dp))

            Card(modifier = Modifier
                .padding(start = 17.dp, top = 10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                )
                )
            {
                Card(modifier = Modifier
                    .padding(start = 7.dp, end = 7.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                    )
                {
                    Text("Country",
                        fontSize = 13.sp
                    )
                }
            }

            Spacer(Modifier.height(10.dp))

            OutlinedTextField(
                value = country,
                onValueChange = {country = it},
                modifier = Modifier
                    .height(48.dp)
                    .fillMaxWidth()
                    .padding(start = 24.dp, end = 24.dp)

            )

            Spacer(Modifier.height(20.dp))

            TextButton(
                onClick = {},
                modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
                    .padding(start = 20.dp, end = 20.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color(0xFFFFFFFF),
                    containerColor = Color(0xFFF83758)
                )
            )
            {
                Text(text = "Save",
                    fontSize = 15.sp
                )
            }

            Spacer(Modifier.height(25.dp))
        }

    }
}

@Composable
fun ChangePassword(navController: NavController) {
    var email by remember { mutableStateOf("") }

    Card(
        modifier = Modifier
            .fillMaxSize(),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent
        )
    )
    {
        Card(
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
                .padding(top = 25.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Transparent
            )
        ) {
            TextButton(
                onClick = { navController.navigate("Profile") },
                modifier = Modifier
                    .height(35.dp)
                    .width(70.dp)
                    .align(Alignment.End)
            )
            {
                Text(
                    "Back",
                    textAlign = TextAlign.Center,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Bold,
                    color = Color.Red
                )
            }
            Card(
                modifier = Modifier
                    .height(100.dp)
                    .width(220.dp)
                    .align(Alignment.Start),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                )
            ) {
                Text(
                    "Change",
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

        Card(
            modifier = Modifier
                .padding(start = 30.dp, end = 30.dp, top = 10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Transparent
            )
        )
        {
            Text(
                "* We will send you a message to set or reset your new password",
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
            Text(
                "Get OTP",
                fontSize = 20.sp,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 15.dp)
            )

        }
    }
}

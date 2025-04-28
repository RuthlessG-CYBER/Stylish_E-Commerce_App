package com.example.stylishapp.authenticationScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.navigation.NavHostController

import com.example.stylishapp.R
import com.example.stylishapp.viewmodel.LoginViewModel

// LogIn Page
@Composable
fun FifthPage(viewModel: LoginViewModel, navController: NavHostController){

    var email by remember { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf("All the fields are required") }



    Column(modifier = Modifier
        .fillMaxSize())
    {
        Box(modifier = Modifier.fillMaxSize())
        {
            Card(modifier = Modifier.align(Alignment.Center).padding(top = 25.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                ))
            {
                Column(modifier = Modifier
                    .height(110.dp)
                    .fillMaxWidth()
                    .padding(start = 20.dp, top = 20.dp))
                {
                    Card(
                        modifier = Modifier
                            .height(95.dp)
                            .fillMaxWidth(),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent,
                            contentColor = Color.Black
                        ))
                    {

                        Box(modifier = Modifier.fillMaxSize())
                        {
                            Text(
                                "Welcome",
                                modifier = Modifier
                                    .padding(top = 1.dp),
                                color = Color.Black,
                                fontSize = 40.sp,
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Italic
                            )
                            Text(
                                "Back",
                                modifier = Modifier
                                    .padding(top = 40.dp, start = 3.dp),
                                color = Color.Black,
                                fontSize = 40.sp,
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Italic
                            )

                        }
                    }
                }

                Spacer(modifier = Modifier.height(70.dp))

                Box(modifier = Modifier
                    .fillMaxSize()
                    .align(Alignment.CenterHorizontally))
                {
                    Card(
                        modifier = Modifier
                            .height(550.dp)
                            .padding(20.dp)
                            .align(Alignment.Center),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent,
                            contentColor = Color.Black
                        ))
                    {

                        OutlinedTextField(
                            modifier = Modifier
                                .height(65.dp)
                                .width(380.dp)
                                .align(Alignment.CenterHorizontally),
                            shape = RoundedCornerShape(10.dp),
                            value = email,
                            onValueChange = { email = it },
                            label = { Text("Username or Email") },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Filled.Email,
                                    contentDescription = "Email Icon"
                                )
                            }
                        )
                        OutlinedTextField(
                            modifier = Modifier
                                .height(65.dp)
                                .width(380.dp)
                                .align(Alignment.CenterHorizontally),
                            shape = RoundedCornerShape(10.dp),
                            value = password,
                            onValueChange = { password = it },
                            label = { Text("Password") },
                            visualTransformation = PasswordVisualTransformation(),
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Filled.Lock,
                                    contentDescription = "Email Icon"
                                )
                            }
                        )
                        TextButton(onClick = {navController.navigate("ForgotPassword")},
                            modifier = Modifier
                                .align(Alignment.End)
                        ){
                            Text(
                                "Forgot Password?",
                                modifier = Modifier,
                                color = Color.Red,
                                maxLines = 1,
                                fontSize = 16.sp
                            )
                        }
                        Spacer(modifier = Modifier.height(20.dp))

                        Card(onClick = {
                            viewModel.login(email, password, navController)
                        },
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
                            Text("LogIn",
                                fontSize = 20.sp,
                                modifier = Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .padding(top = 15.dp))

                        }
                        Spacer(modifier = Modifier.height(20.dp))

                        if (email.isBlank() || password.isBlank()) {
                            Text(
                                text = errorMessage,
                                color = MaterialTheme.colorScheme.error,
                                modifier = Modifier.align(Alignment.CenterHorizontally)
                            )
                        }

                        Spacer(Modifier.height(20.dp))
                        Card(modifier = Modifier
                            .height(200.dp)
                            .fillMaxWidth()
                            .align(Alignment.End),
                            colors = CardDefaults.cardColors(
                                contentColor = Color.Black,
                                containerColor = Color.Transparent
                            )
                        )
                        {
                            Text("- OR Continue with -",
                                modifier = Modifier.align(Alignment.CenterHorizontally)
                                    .padding(top = 15.dp),
                                color = Color.Black,
                                fontSize = 15.sp
                            )

                            Card(modifier = Modifier
                                .fillMaxSize()
                                .padding(top = 10.dp)
                                .align(Alignment.CenterHorizontally),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.Transparent,
                                    contentColor = Color.Black
                                )
                            )
                            {
                                Row(modifier = Modifier
                                    .align(Alignment.CenterHorizontally))
                                {
                                    OutlinedCard(
                                        modifier = Modifier.height(50.dp).width(50.dp),
                                        shape = RoundedCornerShape(30.dp),
                                        colors = CardDefaults.cardColors(
                                            contentColor = Color.Transparent,
                                            containerColor = Color.Transparent
                                        )
                                    )
                                    {
                                        Image(painter = painterResource(R.drawable.google_logo),
                                            contentDescription = "Google",
                                            contentScale = ContentScale.Crop)

                                    }
                                    Spacer(modifier = Modifier.width(30.dp))
                                    OutlinedCard(modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp),
                                        shape = RoundedCornerShape(30.dp),
                                        colors = CardDefaults.cardColors(
                                            contentColor = Color.Black,
                                            containerColor = Color.Transparent
                                        )
                                    )
                                    {
                                        Image(painter = painterResource(R.drawable.apple_logo),
                                            contentDescription = "Google",
                                            contentScale = ContentScale.Crop)
                                    }
                                    Spacer(modifier = Modifier.width(30.dp))
                                    OutlinedCard(modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp),
                                        shape = RoundedCornerShape(30.dp),
                                        colors = CardDefaults.cardColors(
                                            contentColor = Color.Black,
                                            containerColor = Color.Transparent
                                        )
                                    )
                                    {
                                        Image(painter = painterResource(R.drawable.facebook_logo),
                                            contentDescription = "Google",
                                            contentScale = ContentScale.Crop)
                                    }
                                }
                                Spacer(Modifier.height(10.dp))
                                TextButton(
                                    onClick = {navController.navigate("signup")},
                                    modifier = Modifier.align(Alignment.CenterHorizontally),
                                    colors = ButtonDefaults.buttonColors(
                                        contentColor = Color.Black,
                                        containerColor = Color.Transparent
                                    )
                                )
                                {
                                    Text(text = "Create an Account? SignUp")
                                }


                            }

                        }

                    }

                }
            }
        }
    }
}
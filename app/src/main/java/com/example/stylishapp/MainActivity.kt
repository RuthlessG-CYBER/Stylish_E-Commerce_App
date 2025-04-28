package com.example.stylishapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.stylishapp.navigaton.Navigation


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            val navController = rememberNavController()
//            val authViewModel: AuthViewModel = viewModel(factory = AuthViewModelFactory(this))
//            Navigation(navController, authViewModel)
            val navHostController = rememberNavController()
            Navigation(navController = navHostController)

        }
    }
}

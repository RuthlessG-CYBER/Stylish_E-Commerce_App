package com.example.stylishapp.navigaton

import android.content.Context
import android.content.SharedPreferences
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.stylishapp.homeScreen.TrendingProducts
import com.example.stylishapp.authenticationScreen.FifthPage
import com.example.stylishapp.authenticationScreen.ForthPage
import com.example.stylishapp.authenticationScreen.SecondPage
import com.example.stylishapp.authenticationScreen.SixthPage
import com.example.stylishapp.authenticationScreen.ThirdPage
import com.example.stylishapp.homeScreen.ChangePassword
import com.example.stylishapp.homeScreen.HomePage
import com.example.stylishapp.homeScreen.Profile
import com.example.stylishapp.splashScreen.FirstPage
import com.example.stylishapp.authenticationScreen.ForgotPassword
import com.example.stylishapp.homeScreen.GetStarted
import com.example.stylishapp.viewmodel.LoginViewModel
import com.example.stylishapp.viewmodel.SignupViewModel

@Composable
fun Navigation(navController: NavHostController){

    NavHost(navController = navController, startDestination = "FirstPage"){
        composable("FirstPage"){ FirstPage(navController) }
        composable("SecondPage"){ SecondPage(navController) }
        composable("ThirdPage"){ ThirdPage(navController) }
        composable("ForthPage"){ ForthPage(navController) }
        composable("login"){ FifthPage( LoginViewModel(), navController ) }
        composable("signup"){ SixthPage( SignupViewModel(), navController) }
        composable("forgotpassword"){ ForgotPassword(navController) }
        composable("profile"){ Profile(navController) }
        composable("home"){ HomePage(navController) }
        composable("trendingproducts"){ TrendingProducts(navController) }
        composable("changepassword"){ ChangePassword(navController) }
        composable("getStarted"){ GetStarted(navController) }

    }

}

//class AuthViewModel(context: Context) : ViewModel() {

//    private val sharedPreferences: SharedPreferences =
//        context.getSharedPreferences("user_prefs", Context.MODE_PRIVATE)
//
//    fun saveUser(email: String, password: String) {
//        sharedPreferences.edit().apply {
//            putString("email", email)
//            putString("password", password)
//            apply()
//        }
//    }
//
//    fun isUserValid(email: String, password: String): Boolean {
//        val savedEmail = sharedPreferences.getString("email", null)
//        val savedPassword = sharedPreferences.getString("password", null)
//        return email == savedEmail && password == savedPassword
//    }
//    fun getSavedEmail(): String? {
//        // Fetch the saved email from SharedPreferences
//        return sharedPreferences.getString("email", null)
//    }
//
//}
//
//class AuthViewModelFactory(private val context: Context) : ViewModelProvider.Factory {
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        if (modelClass.isAssignableFrom(AuthViewModel::class.java)) {
//            @Suppress("UNCHECKED_CAST")
//            return AuthViewModel(context) as T
//        }
//        throw IllegalArgumentException("Unknown ViewModel class")
//    }
//}
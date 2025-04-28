package com.example.stylishapp.viewmodel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavHostController
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST


class LoginViewModel : ViewModel() {
    var loginMessage by mutableStateOf("")

    fun login(email: String, password: String, navController: NavHostController) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val request = LoginRequest(email, password)
                val response = RetrofitClient.apiService.loginUser(request)

                withContext(Dispatchers.Main) {
                    if (response.isSuccessful) {
                        loginMessage = response.body()?.message ?: "Login successful!"
                        // Navigate to Homepage after successful login
                        navController.navigate("home")
                    } else {
                        loginMessage = "Login failed: ${response.errorBody()?.string()}"
                    }
                }
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    loginMessage = "Error: ${e.localizedMessage}"
                    Log.e("LoginViewModel", "Login failed", e)
                }
            }
        }
    }
}

class SignupViewModel : ViewModel() {
    var signupMessage by mutableStateOf("")

    fun signup(username: String, email: String, password: String, navController: NavHostController) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val request = SignupRequest(username, email, password)
                val response = RetrofitClient.apiService.signupUser(request)

                withContext(Dispatchers.Main) {
                    if (response.isSuccessful) {
                        signupMessage = response.body()?.message ?: "Signup successful!"
                        // Navigate to Login Screen after successful signup
                        navController.navigate("login")
                    } else {
                        signupMessage = "Signup failed: ${response.errorBody()?.string()}"
                    }
                }
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    signupMessage = "Error: ${e.localizedMessage}"
                    Log.e("SignupViewModel", "Signup failed", e)
                }
            }
        }
    }
}

object RetrofitClient {
    val apiService: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://android-backend-4e5t.onrender.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}

interface ApiService {
    @POST("/api/users/login")
    suspend fun loginUser(
        @Body request: LoginRequest
    ): Response<LoginResponse>

    @POST("/api/users/signup")
    suspend fun signupUser(
        @Body request: SignupRequest
    ): Response<SignupResponse>
}
data class LoginResponse(
    val success: Boolean,
    val message: String
)

data class LoginRequest(
    val email: String,
    val password: String
)

data class SignupResponse(
    val success: Boolean,
    val message: String
)

data class SignupRequest(
    val username: String,
    val email: String,
    val password: String
)
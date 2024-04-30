package com.grace.build_with

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.grace.build_with.navigation.AppNavHost


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigateScreen()



           }
        }
    }





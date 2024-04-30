package com.grace.build_with.screens.settings

import android.provider.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.grace.build_with.screens.profile.ProfileScreen

@Composable
fun SettingsScreen(navController: NavHostController){

}
@Preview(showBackground = true)
@Composable
fun SettingsScreenPreview() {
    SettingsScreen(rememberNavController())
}

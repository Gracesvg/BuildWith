package com.grace.build_with.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route:String,
    val title:String,
    val icon:ImageVector
){
    object Home:BottomBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )
    object Professionals:BottomBarScreen(
        route = "professionals",
        title = "Professional",
        icon = Icons.Default.Person
    )
    object Bookmarks:BottomBarScreen(
        route = "bookmarks",
        title = "Bookmarks",
        icon = Icons.Default.FavoriteBorder
    )
    object Magazine:BottomBarScreen(
        route = "menu",
        title = "Menu",
        icon = Icons.Default.Menu
    )

}

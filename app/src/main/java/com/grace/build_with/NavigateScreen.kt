package com.grace.build_with

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ContentAlpha
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.LocalContentColor
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.grace.build_with.navigation.BottomBarScreen
import com.grace.build_with.navigation.AppNavHost
import com.grace.build_with.navigation.ROUTE_PROFILE
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigateScreen(){
    
    val  navController= rememberNavController()



    Scaffold(
        topBar = {
            TopAppBar(modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 10.dp)
                .clip(shape = RoundedCornerShape(30.dp)),
                title = {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)),

                        Alignment.Center
                        ) {
                            Text(text = "")
                        }
                    },

                    backgroundColor = Color(0xFFAEC9AF),
                    contentColor = Color.Black,
                    elevation = 8.dp,
                    actions = {

                        IconButton(
                            onClick = {
                            },
                        ) {
                            Icon(
                                imageVector = Icons.Default.Search,
                                modifier = Modifier
                                    .clickable {},
                                contentDescription = "Icon",
                            )
                        }
                        IconButton(
                            onClick = { },
                        ) {
                            Icon(
                                Icons.Default.AccountCircle,
                                modifier = Modifier
                                    .clickable { navController.navigate(ROUTE_PROFILE) },
                                contentDescription = null
                            )
                        }
                    }
                )

        },


            bottomBar = {


            BottomBar(navController = navController)

            }

    ){

        AppNavHost(navController = navController)
    }
}
@Composable
fun BottomBar(navController: NavHostController){
    val screens = listOf(
        BottomBarScreen.Home,
        BottomBarScreen.Professionals,
        BottomBarScreen.Bookmarks,
        BottomBarScreen.Magazine
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?. destination


    BottomNavigation(
        modifier = Modifier
                    .clip(shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)),
        backgroundColor = Color(0xFFAEC9AF),
                contentColor = Color.Black
    ) {
        screens.forEach{ screen ->
            AddItem(screen = screen,
                currentDestination =currentDestination ,
                navcontroller =navController )

        }
    }
}
@Composable
fun  RowScope.AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navcontroller:NavHostController
){
    BottomNavigationItem(

//        label ={
//            Text(text = screen.title)
//        },
        icon={
            Icon(imageVector = screen.icon, contentDescription = "")
        },
        selected =currentDestination?.hierarchy?.any{
            it.route== screen.route
        } == true,
        unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled),
//        interactionSource = MutableInteractionSource(rememberInteraction()),
        onClick ={
            navcontroller.navigate(screen.route){
                popUpTo(navcontroller.graph.findStartDestination().id){
                    saveState= true
                }
                launchSingleTop = true
                restoreState = true

            }
        }
    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavDrawer(){
    val drawerItems = listOf(
        DrawerItems(Icons.Default.Face,"Profile" ,0,false),
        DrawerItems(Icons.Default.AddCircle," Professional Account" ,0,false),
        DrawerItems(Icons.Default.ShoppingCart,"Create a request" ,0,false),
        DrawerItems(Icons.Default.Notifications,"Notifications" ,12,true),
        DrawerItems(Icons.Default.Settings,"Settings" ,0,false)
    )
    val scope = rememberCoroutineScope()
    var selectedItem by remember {
        mutableStateOf(drawerItems[0])
    }
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)


    ModalNavigationDrawer(drawerContent = {
        ModalDrawerSheet(modifier = Modifier.padding(horizontal = 2.dp, vertical = 2.dp),
        ) {
            Column (
                Modifier.fillMaxSize(),

                verticalArrangement = Arrangement.spacedBy(12.dp)

            ){
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(Color(0xFFAEC9AF)),
                    contentAlignment = Alignment.Center
                ){
                    Column(
                        Modifier.wrapContentSize(),
                        verticalArrangement = Arrangement.SpaceAround,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.grace),
                            contentDescription = "",
                            modifier = Modifier
                                .size(130.dp)
                                .clip(CircleShape)
                        )
                        androidx.compose.material3.Text(
                            text = "Mrs.Mbori",
                            Modifier
                                .fillMaxWidth()
                                .padding(top = 15.dp),
                            fontSize = 15.sp,
                            textAlign = TextAlign.Center
                        )
                    }
                    Divider(Modifier.align(Alignment.BottomCenter),
                        thickness = 1.dp,
                        color = Color.Gray
                    )
                }
                drawerItems.forEach{
                    NavigationDrawerItem(label = { androidx.compose.material3.Text(text = it.text) },
                        selected = it == selectedItem,
                        onClick = {
                            selectedItem =it
                            scope.launch {
                                drawerState.close()
                            }
                        },
                        modifier = Modifier.padding(horizontal = 15.dp, vertical = 8.dp),
                        icon={
                            androidx.compose.material3.Icon(imageVector = it.icon,
                            contentDescription =it.text )
                        },
                        badge = {
                            if (it.hasBadge){
                                BadgedBox(badge = {
                                    Badge {
                                        androidx.compose.material3.Text(text = it.badgeCount.toString(),
                                            fontSize = 15.sp)
                                    }
                                }) {


                                }
                            }
                        })
                }

            }
        }
    }){

}
}
data class DrawerItems(
    val icon: ImageVector,
    val text:String,
    val badgeCount:Int,
    val hasBadge:Boolean
)


@Preview(showBackground = true)
@Composable
fun NavigateScreenPreview() {
    NavigateScreen()
}
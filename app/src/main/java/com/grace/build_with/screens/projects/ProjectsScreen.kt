package com.grace.build_with.screens.projects

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.grace.build_with.AddItem
import com.grace.build_with.R
import com.grace.build_with.navigation.BottomBarScreen
import com.grace.build_with.navigation.ROUTE_BATHROOM
import com.grace.build_with.navigation.ROUTE_ELECTRICAL_INSTALLATIONS
import com.grace.build_with.navigation.ROUTE_FLOOR_WORK
import com.grace.build_with.navigation.ROUTE_FURNITURE_DESIGN
import com.grace.build_with.navigation.ROUTE_GARDENING
import com.grace.build_with.navigation.ROUTE_HOME
import com.grace.build_with.navigation.ROUTE_HOUSE_BUILDING
import com.grace.build_with.navigation.ROUTE_INTERIOR_DESIGN
import com.grace.build_with.navigation.ROUTE_KITCHEN_PLANNING
import com.grace.build_with.navigation.ROUTE_PLUMBING
import com.grace.build_with.navigation.ROUTE_RENOVATION
import com.grace.build_with.navigation.ROUTE_ROOF_PROJECT
import com.grace.build_with.navigation.ROUTE_TILE_WORK

@Composable
fun ProjectsScreen(navController: NavHostController) {
    var selected by remember { mutableStateOf(false)
        
    }
//    val screens = listOf(
//        BottomBarScreen.Home,
//        BottomBarScreen.Professionals,
//        BottomBarScreen.Bookmarks,
//        BottomBarScreen.Magazine
//    )
//    val navBackStackEntry by navController.currentBackStackEntryAsState()
//    val currentDestination = navBackStackEntry?. destination





    Box(modifier = Modifier.fillMaxSize()
        .background(Color(0x7EF1F1F1)),
    ){

    }

    Column (
        Modifier.fillMaxSize()
            .verticalScroll(rememberScrollState())
    ){
        Spacer(modifier = Modifier.height(10.dp))

        Spacer(modifier = Modifier.height(10.dp))

        Spacer(modifier = Modifier.height(10.dp))

        Spacer(modifier = Modifier.height(10.dp))

        Spacer(modifier = Modifier.height(10.dp))



        Row (
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
//            screens.forEach{ screen ->
//                AddItem(screen = screen,
//                    currentDestination =currentDestination ,
//                    navcontroller =navController )
//
//            }

            Icon(Icons.Filled.Close,
                null,
                modifier = Modifier
                    .padding(start = 25.dp, end = 25.dp)
                    .size(30.dp)
                    .clickable {
                        navController.navigate(ROUTE_HOME)
                    },
                tint = Color.Gray)
            Spacer(modifier = Modifier.width(40.dp))


            Text("Need Help?",
                modifier = Modifier.padding(20.dp),
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Gray,
                fontFamily = FontFamily.SansSerif
            )
        }

        Spacer(modifier = Modifier.height(5.dp))
        androidx.compose.material3.Text(
            text = "With a Project",
            modifier = Modifier.padding(15.dp),
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            fontFamily = FontFamily.SansSerif
        )

        Spacer(modifier = Modifier.height(10.dp))
        androidx.compose.material3.Text(
            text = "Bathroom Project",
            modifier = Modifier
                .padding(15.dp)
                .clickable {
                    navController.navigate(ROUTE_BATHROOM)
                    selected = selected
                },
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            fontFamily = FontFamily.SansSerif,

        )


        Divider(modifier = Modifier.padding(start = 15.dp, end = 15.dp))
        Spacer(modifier = Modifier.height(5.dp))
        androidx.compose.material3.Text(
            text = "Electrical Installation",
            modifier = Modifier
                .padding(15.dp)
                .clickable { navController.navigate(ROUTE_ELECTRICAL_INSTALLATIONS) },

            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            fontFamily = FontFamily.SansSerif
        )

        Divider(modifier = Modifier.padding(start = 15.dp, end = 15.dp))
        Spacer(modifier = Modifier.height(5.dp))
        androidx.compose.material3.Text(
            text = "Floor Work",
            modifier = Modifier
                .padding(15.dp)
                .clickable { navController.navigate(ROUTE_FLOOR_WORK) },
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            fontFamily = FontFamily.SansSerif
        )

        Divider(modifier = Modifier.padding(start = 15.dp, end = 15.dp))
        Spacer(modifier = Modifier.height(5.dp))
        androidx.compose.material3.Text(
            text = "Furniture Design",
            modifier = Modifier
                .padding(15.dp)
                .clickable { navController.navigate(ROUTE_FURNITURE_DESIGN) },
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            fontFamily = FontFamily.SansSerif
        )

        Divider(modifier = Modifier.padding(start = 15.dp, end = 15.dp))
        Spacer(modifier = Modifier.height(5.dp))
        androidx.compose.material3.Text(
            text = "Gardening",
            modifier = Modifier
                .padding(15.dp)
                .clickable { navController.navigate(ROUTE_GARDENING) },
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            fontFamily = FontFamily.SansSerif
        )

        Divider(modifier = Modifier.padding(start = 15.dp, end = 15.dp))
        Spacer(modifier = Modifier.height(5.dp))
        androidx.compose.material3.Text(
            text = "House Building",
            modifier = Modifier
                .padding(15.dp)
                .clickable { navController.navigate(ROUTE_HOUSE_BUILDING) },
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            fontFamily = FontFamily.SansSerif
        )

        Divider(modifier = Modifier.padding(start = 15.dp, end = 15.dp))
        Spacer(modifier = Modifier.height(5.dp))
        androidx.compose.material3.Text(
            text = "Interior Design",
            modifier = Modifier
                .padding(15.dp)
                .clickable { navController.navigate(ROUTE_INTERIOR_DESIGN)},
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            fontFamily = FontFamily.SansSerif
        )
        Divider(modifier = Modifier.padding(start = 15.dp, end = 15.dp))
        Spacer(modifier = Modifier.height(5.dp))
        androidx.compose.material3.Text(
            text = "Kitchen Planning",
            modifier = Modifier
                .padding(20.dp)
                .clickable { navController.navigate(ROUTE_KITCHEN_PLANNING) },
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            fontFamily = FontFamily.SansSerif
        )
        Divider(modifier = Modifier.padding(start = 15.dp, end = 15.dp))
        Spacer(modifier = Modifier.height(5.dp))
        androidx.compose.material3.Text(
            text = "Plumbing",
            modifier = Modifier
                .padding(20.dp)
                .clickable { navController.navigate(ROUTE_PLUMBING)},
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            fontFamily = FontFamily.SansSerif
        )
        Divider(modifier = Modifier.padding(start = 15.dp, end = 15.dp))
        Spacer(modifier = Modifier.height(5.dp))
        androidx.compose.material3.Text(
            text = "Renovation",
            modifier = Modifier
                .padding(15.dp)
                .clickable { navController.navigate(ROUTE_RENOVATION) },
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            fontFamily = FontFamily.SansSerif
        )
        Divider(modifier = Modifier.padding(start = 15.dp, end = 15.dp))
        Spacer(modifier = Modifier.height(5.dp))
        androidx.compose.material3.Text(
            text = "Roof ",
            modifier = Modifier
                .padding(15.dp)
                .clickable { navController.navigate(ROUTE_ROOF_PROJECT) },
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            fontFamily = FontFamily.SansSerif
        )
        Divider(modifier = Modifier.padding(start = 15.dp, end = 15.dp))
        Spacer(modifier = Modifier.height(5.dp))
        androidx.compose.material3.Text(
            text = "Tile Work ",
            modifier = Modifier
                .padding(15.dp)
                .clickable { navController.navigate(ROUTE_TILE_WORK) },
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            fontFamily = FontFamily.SansSerif
        )
        Divider(modifier = Modifier.padding(start = 15.dp, end = 15.dp))

        Spacer(modifier = Modifier.height(20.dp))
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedButton(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 25.dp, end = 25.dp),
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF94AD95))
        ) {

            androidx.compose.material3.Text(
                text = "NEXT",
                fontFamily = FontFamily.SansSerif,
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold

            ) }

        }

    }



@Preview(showBackground = true)
@Composable
fun ProjectsScreenPreview() {
    ProjectsScreen(rememberNavController())
}
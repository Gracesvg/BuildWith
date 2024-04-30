package com.grace.build_with.screens.home


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.grace.build_with.Item
import com.grace.build_with.R
import com.grace.build_with.navigation.ROUTE_PROJECTS


@Composable
fun HomeScreen(navController: NavHostController) {

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0x7EF1F1F1))) {
    }
    Column(modifier = Modifier
        .fillMaxSize()

    ) {
        Spacer(modifier = Modifier.height(10.dp))

        Spacer(modifier = Modifier.height(10.dp))

        Spacer(modifier = Modifier.height(10.dp))

        Spacer(modifier = Modifier.height(10.dp))

        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Rooms",
            modifier = Modifier.padding(20.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold, color = Color.Gray,
            fontFamily = FontFamily.SansSerif
        )
        Spacer(modifier = Modifier.height(10.dp))

        Card(
            colors = CardDefaults.cardColors(Color(0xFFAEC9AF)),
            modifier = Modifier
                .fillMaxWidth()
                .height(115.dp)
                .padding(start = 15.dp, end = 15.dp)

        ) {
            Column(modifier =Modifier.verticalScroll(rememberScrollState())) {
                Text(
                    text = "Need Help With Your Home Project?",
                    modifier = Modifier.padding(20.dp),
                    fontSize = 13.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White,
                    fontFamily = FontFamily.SansSerif
                )
                OutlinedButton(
                    onClick = {
                        navController.navigate(ROUTE_PROJECTS)
                    },
                    modifier = Modifier
                        .size(width = 200.dp, height = 35.dp)
                        .padding(start = 15.dp),
                    shape = RoundedCornerShape(15.dp),
                    border = BorderStroke(3.dp, Color(0xFF697C6A))
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Ask a professional",
                            fontFamily = FontFamily.SansSerif,
                            color = Color.White,
                            fontSize = 10.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                        Spacer(modifier = Modifier.width(5.dp))

                        Icon(
                            Icons.AutoMirrored.Filled.KeyboardArrowRight,

                            null
                        )
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        ListLayout()


    }
}
@Composable
fun ListLayout(){
    val iconlist= mutableListOf(

        Item(R.drawable.sink,""),
        Item(R.drawable.arch,""),
        Item(R.drawable.bed1,""),
        Item(R.drawable.mainbath,""),
        Item(R.drawable.dine,""),
        Item(R.drawable.bed2,""),
        Item(R.drawable.arch1,""),
        Item(R.drawable.garden1,""),
        Item(R.drawable.pool,""),
        Item(R.drawable.kitchen,""),
        Item(R.drawable.diy,""),
        Item(R.drawable.deco,""),
        Item(R.drawable.house2,""),
        Item(R.drawable.dine1,""),
        Item(R.drawable.pool1,""),
        Item(R.drawable.diy1,""),
        Item(R.drawable.furnish,""),
        Item(R.drawable.tilisi,""),
        Item(R.drawable.love,""),
        Item(R.drawable.dine,""),
        Item(R.drawable.house8,""),
        Item(R.drawable.bath,""),


    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp)
    ) {
        LazyVerticalStaggeredGrid(
            columns = StaggeredGridCells.Fixed(2),
            contentPadding = PaddingValues(2.dp),
            verticalItemSpacing = 15.dp,
            horizontalArrangement = Arrangement.spacedBy(10.dp)

        ) {
            items(iconlist) { image ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .background(Color(0x7EF1F1F1))
                        .clickable {  },
                    shape = RoundedCornerShape(size = 13.dp)
                ) {
                    Column(verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Image(
                            painter = painterResource(id = image.image),
                            contentDescription = "",
                            contentScale = ContentScale.FillWidth,
                            modifier = Modifier
                                .fillMaxSize()

                                .padding(start = 2.dp)
                        )

                    }

                }
            }

        }


//        LazyColumn(modifier = Modifier
//            .padding(start = 15.dp, end = 15.dp)
//        ){
//            items(20){ image ->
//
//                   Card(modifier = Modifier
//                       .fillMaxWidth()
//                       .background(Color(0x7EF1F1F1)),
//                       shape = RoundedCornerShape(size = 13.dp)
//                   ) {
//                       Spacer(modifier = Modifier.width(5.dp))
//                       Row(
//                           modifier = Modifier.fillMaxWidth(),
//                           verticalAlignment = Alignment.CenterVertically
//                       ) {
//                           Image(
//                               painter = painterResource(id = image),
//                               contentDescription = "",
//                               modifier = Modifier
//                                   .fillMaxWidth()
//                                   .padding(start = 5.dp)
//                           )
//
//
//                       }
//
//                   }
//
//
//
//            }
//        }


    }
}














@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(rememberNavController())
}



package com.grace.build_with.screens.decor

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
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


@Composable
fun Decor_Photos(navController: NavHostController) {

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
            text = "Furnishing & Decoration",
            modifier = Modifier.padding(20.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold, color = Color.Gray,
            fontFamily = FontFamily.SansSerif
        )
        Spacer(modifier = Modifier.height(10.dp))

        ListLayout()


    }
}
@Composable
fun ListLayout(){
    val iconlist= mutableListOf(

        Item(R.drawable.deco,""),
        Item(R.drawable.deco1,""),
        Item(R.drawable.deco2,""),
        Item(R.drawable.deco3,""),
        Item(R.drawable.deco4,""),
        Item(R.drawable.deco5,""),
        Item(R.drawable.deco6,""),
        Item(R.drawable.deco7,""),
        Item(R.drawable.furnish,""),



        Item(R.drawable.deco,""),
        Item(R.drawable.deco1,""),
        Item(R.drawable.deco2,""),
        Item(R.drawable.deco3,""),
        Item(R.drawable.deco4,""),
        Item(R.drawable.deco5,""),
        Item(R.drawable.deco6,""),
        Item(R.drawable.deco7,""),
        Item(R.drawable.furnish,""),





        Item(R.drawable.deco,""),
        Item(R.drawable.deco1,""),
        Item(R.drawable.deco2,""),
        Item(R.drawable.deco3,""),
        Item(R.drawable.deco4,""),
        Item(R.drawable.deco5,""),
        Item(R.drawable.deco6,""),
        Item(R.drawable.deco7,""),
        Item(R.drawable.furnish,""),





        Item(R.drawable.deco,""),
        Item(R.drawable.deco1,""),
        Item(R.drawable.deco2,""),
        Item(R.drawable.deco3,""),
        Item(R.drawable.deco4,""),
        Item(R.drawable.deco5,""),
        Item(R.drawable.deco6,""),
        Item(R.drawable.deco7,""),
        Item(R.drawable.furnish,""),


        Item(R.drawable.deco,""),
        Item(R.drawable.deco1,""),
        Item(R.drawable.deco2,""),
        Item(R.drawable.deco3,""),
        Item(R.drawable.deco4,""),
        Item(R.drawable.deco5,""),
        Item(R.drawable.deco6,""),
        Item(R.drawable.deco7,""),
        Item(R.drawable.furnish,""),


        Item(R.drawable.deco,""),
        Item(R.drawable.deco1,""),
        Item(R.drawable.deco2,""),
        Item(R.drawable.deco3,""),
        Item(R.drawable.deco4,""),
        Item(R.drawable.deco5,""),
        Item(R.drawable.deco6,""),
        Item(R.drawable.deco7,""),
        Item(R.drawable.furnish,""),




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
                        .clickable { },
                    shape = RoundedCornerShape(size = 13.dp)
                ) {
                    Column(
                        verticalArrangement = Arrangement.SpaceBetween,
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
    }
}


@Preview(showBackground = true)
@Composable
fun Decor_PhotosPreview() {
    Decor_Photos(rememberNavController())
}



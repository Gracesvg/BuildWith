package com.grace.build_with.screens.magazine

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import com.grace.build_with.R
import com.grace.build_with.navigation.ROUTE_ARCHITECTURE_PHOTOS
import com.grace.build_with.navigation.ROUTE_BATH_AREA
import com.grace.build_with.navigation.ROUTE_BEDROOM
import com.grace.build_with.navigation.ROUTE_DECOR
import com.grace.build_with.navigation.ROUTE_DINING
import com.grace.build_with.navigation.ROUTE_DIY_PHOTOS
import com.grace.build_with.navigation.ROUTE_GARDEN
import com.grace.build_with.navigation.ROUTE_HOUSES
import com.grace.build_with.navigation.ROUTE_KITCHEN
import com.grace.build_with.navigation.ROUTE_POOLS
import com.grace.build_with.navigation.ROUTE_PROJECTS



@Composable
fun MagazineScreen(navController: NavHostController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0x7EF1F1F1)),
    ){
    }


    Column(modifier = Modifier
        .fillMaxSize()) {
        Spacer(modifier = Modifier.height(10.dp))

        Spacer(modifier = Modifier.height(10.dp))

        Spacer(modifier = Modifier.height(10.dp))

        Spacer(modifier = Modifier.height(10.dp))

        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Magazine",
            modifier = Modifier.padding(20.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold, color = Color.Gray,
            fontFamily = FontFamily.SansSerif
        )
        Spacer(modifier = Modifier.height(10.dp))

        Card(colors =  CardDefaults.cardColors(Color(0xFFAEC9AF)),
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .padding(start = 15.dp, end = 15.dp)
                .verticalScroll(rememberScrollState())


            ) {
            Column() {
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
                    Row (horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Text(
                            text = "Ask a professional",
                            fontFamily = FontFamily.SansSerif,
                            color = Color.White,
                            fontSize = 10.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                        Spacer(modifier = Modifier.width(5.dp))

                        Icon(
                            Icons.Default.KeyboardArrowRight,

                            null
                        )
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Column(modifier = Modifier.verticalScroll(rememberScrollState())
        ) {


            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(390.dp)
                    .padding(start = 15.dp, end = 15.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(290.dp)
                        .background(Color(0x7EF1F1F1))
                ) {
                    Image(
                        painter = painterResource(id =R.drawable.bedintro),
                        contentDescription = "",
                        contentScale = ContentScale.FillHeight,
                        modifier = Modifier
                            .fillMaxSize()

                            .padding(start = 2.dp)
                    )

                }
                Spacer(modifier = Modifier.height(30.dp))

                Button(onClick = {navController.navigate(ROUTE_BEDROOM)
                },
                    colors = ButtonDefaults.buttonColors(Color(0xFFAEC9AF)),
                    modifier = Modifier
                        .width(130.dp)
                        .padding(start = 18.dp)


                ) {
                    Text(
                        text = "Bedroom",
                        fontFamily = FontFamily.SansSerif,
                        color = Color.White,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.SemiBold

                    )
                }


            }
            Spacer(modifier = Modifier.height(20.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(380.dp)
                    .padding(start = 15.dp, end = 15.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(290.dp)
                        .background(Color(0x7EF1F1F1)),
                ) {
                    Image(
                        painter = painterResource(id =R.drawable.bathintro),
                        contentDescription = "",
                        contentScale = ContentScale.FillHeight,
                        modifier = Modifier
                            .fillMaxSize()

                    )

                }
                Spacer(modifier = Modifier.height(30.dp))

                Button(onClick = {navController.navigate(ROUTE_BATH_AREA)
                },
                    colors = ButtonDefaults.buttonColors(Color(0xFFAEC9AF)),
                    modifier = Modifier
                        .width(140.dp)
                        .padding(start = 18.dp)


                ) {
                    Text(
                        text = "Bathroom",
                        fontFamily = FontFamily.SansSerif,
                        color = Color.White,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.SemiBold

                    )
                }

            }
            Spacer(modifier = Modifier.height(20.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(380.dp)
                    .padding(start = 15.dp, end = 15.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(290.dp)
                        .background(Color(0x7EF1F1F1)),
                ) {
                    Image(
                        painter = painterResource(id =R.drawable.fdintro),
                        contentDescription = "",
                        contentScale = ContentScale.FillHeight,
                        modifier = Modifier
                            .fillMaxSize()

                    )


                }
                Spacer(modifier = Modifier.height(30.dp))

                Button(onClick = {navController.navigate(ROUTE_DECOR)
                },
                    colors = ButtonDefaults.buttonColors(Color(0xFFAEC9AF)),
                    modifier = Modifier
                        .width(220.dp)
                        .padding(start = 18.dp)


                ) {
                    Text(
                        text = "Furnishing & Decoration",
                        fontFamily = FontFamily.SansSerif,
                        color = Color.White,
                        fontSize = 9.sp,
                        fontWeight = FontWeight.SemiBold

                    )
                }

            }
            Spacer(modifier = Modifier.height(20.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(380.dp)
                    .padding(start = 15.dp, end = 15.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(290.dp)
                        .background(Color(0x7EF1F1F1)),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.archintro),
                        contentDescription = "",
                        contentScale = ContentScale.FillHeight,
                        modifier = Modifier
                            .fillMaxSize()

                            .padding(start = 2.dp)
                    )

                }
                Spacer(modifier = Modifier.height(30.dp))

                Button(onClick = {
                    navController.navigate(ROUTE_ARCHITECTURE_PHOTOS)
                },
                    colors = ButtonDefaults.buttonColors(Color(0xFFAEC9AF)),
                    modifier = Modifier
                        .width(150.dp)
                        .padding(start = 18.dp)


                ) {
                    Text(
                        text = "Architecture",
                        fontFamily = FontFamily.SansSerif,
                        color = Color.White,
                        fontSize = 9.sp,
                        fontWeight = FontWeight.SemiBold

                    )
                }

            }
            Spacer(modifier = Modifier.height(20.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(380.dp)
                    .padding(start = 15.dp, end = 15.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(290.dp)
                        .background(Color(0x7EF1F1F1)),
                ) {
                    Image(
                        painter = painterResource(id =R.drawable.diyintro),
                        contentDescription = "",
                        contentScale = ContentScale.FillHeight,
                        modifier = Modifier
                            .fillMaxSize()

                    )

                }
                Spacer(modifier = Modifier.height(30.dp))

                Button(onClick = { navController.navigate(ROUTE_DIY_PHOTOS)},
                    colors = ButtonDefaults.buttonColors(Color(0xFFAEC9AF)),
                    modifier = Modifier
                        .width(130.dp)
                        .padding(start = 18.dp)


                ) {
                    Text(
                        text = "DIY",
                        fontFamily = FontFamily.SansSerif,
                        color = Color.White,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.SemiBold

                    )
                }

            }
            Spacer(modifier = Modifier.height(20.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(380.dp)
                    .padding(start = 15.dp, end = 15.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(290.dp)
                        .background(Color(0x7EF1F1F1)),
                ) {
                    Image(
                        painter = painterResource(id =R.drawable.gardenintro),
                        contentDescription = "",
                        contentScale = ContentScale.FillHeight,
                        modifier = Modifier
                            .fillMaxSize()

                    )

                }
                Spacer(modifier = Modifier.height(30.dp))

                Button(onClick = {navController.navigate(ROUTE_GARDEN)
                },
                    colors = ButtonDefaults.buttonColors(Color(0xFFAEC9AF)),
                    modifier = Modifier
                        .width(130.dp)
                        .padding(start = 18.dp)

                ) {
                    Text(
                        text = "Garden",
                        fontFamily = FontFamily.SansSerif,
                        color = Color.White,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.SemiBold

                    )
                }

            }
            Spacer(modifier = Modifier.height(20.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(380.dp)
                    .padding(start = 15.dp, end = 15.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(290.dp)
                        .background(Color(0x7EF1F1F1)),
                ) {
                    Image(
                        painter = painterResource(id =R.drawable.hseintro),
                        contentDescription = "",
                        contentScale = ContentScale.FillHeight,
                        modifier = Modifier
                            .fillMaxSize()

                    )

                }
                Spacer(modifier = Modifier.height(30.dp))

                Button(onClick = {navController.navigate(ROUTE_HOUSES)
                },
                    colors = ButtonDefaults.buttonColors(Color(0xFFAEC9AF)),
                    modifier = Modifier
                        .width(130.dp)
                        .padding(start = 18.dp)

                ) {
                    Text(
                        text = "Houses",
                        fontFamily = FontFamily.SansSerif,
                        color = Color.White,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.SemiBold

                    )
                }

            }
            Spacer(modifier = Modifier.height(20.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(380.dp)
                    .padding(start = 15.dp, end = 15.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(290.dp)
                        .background(Color(0x7EF1F1F1)),
                ) {
                    Image(
                        painter = painterResource(id =R.drawable.poolintro),
                        contentDescription = "",
                        contentScale = ContentScale.FillHeight,
                        modifier = Modifier
                            .fillMaxSize()

                    )

                }
                Spacer(modifier = Modifier.height(30.dp))

                Button(onClick = {navController.navigate(ROUTE_POOLS)
                },
                    colors = ButtonDefaults.buttonColors(Color(0xFFAEC9AF)),
                    modifier = Modifier
                        .width(130.dp)
                        .padding(start = 18.dp)

                ) {
                    Text(
                        text = "Pools",
                        fontFamily = FontFamily.SansSerif,
                        color = Color.White,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.SemiBold

                    )
                }

            }
            Spacer(modifier = Modifier.height(20.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(380.dp)
                    .padding(start = 15.dp, end = 15.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(290.dp)
                        .background(Color(0x7EF1F1F1)),
                ) {
                    Image(
                        painter = painterResource(id =R.drawable.kitchenintro),
                        contentDescription = "",
                        contentScale = ContentScale.FillHeight,
                        modifier = Modifier
                            .fillMaxSize()

                    )

                }
                Spacer(modifier = Modifier.height(30.dp))

                Button(onClick = { navController.navigate(ROUTE_KITCHEN)
                },
                    colors = ButtonDefaults.buttonColors(Color(0xFFAEC9AF)),
                    modifier = Modifier
                        .width(130.dp)
                        .padding(start = 18.dp)


                ) {
                    Text(
                        text = "Kitchen",
                        fontFamily = FontFamily.SansSerif,
                        color = Color.White,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.SemiBold

                    )
                }

            }
            Spacer(modifier = Modifier.height(20.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(380.dp)
                    .padding(start = 15.dp, end = 15.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(290.dp)
                        .background(Color(0x7EF1F1F1)),
                ) {
                    Image(
                        painter = painterResource(id =R.drawable.dineintro),
                        contentDescription = "",
                        contentScale = ContentScale.FillHeight,
                        modifier = Modifier
                            .fillMaxSize()

                    )

                }
                Spacer(modifier = Modifier.height(30.dp))

                Button(onClick = {navController.navigate(ROUTE_DINING)
                },
                    colors = ButtonDefaults.buttonColors(Color(0xFFAEC9AF)),
                    modifier = Modifier
                        .width(130.dp)
                        .padding(start = 18.dp)

                ) {
                    Text(
                        text = "Dining",
                        fontFamily = FontFamily.SansSerif,
                        color = Color.White,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.SemiBold

                    )
                }
            }
        }
    }

}


@Preview(showBackground = true)
@Composable
fun MagazineScreenPreview(){
    MagazineScreen(rememberNavController())
}
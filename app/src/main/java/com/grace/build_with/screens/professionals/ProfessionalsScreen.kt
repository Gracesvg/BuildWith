package com.grace.build_with.screens.professionals

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.provider.MediaStore
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.grace.build_with.navigation.ROUTE_BOOKMARKS
import com.grace.build_with.navigation.ROUTE_PROJECTS

@Composable
fun ProfessionalsScreen(navController: NavHostController) {
    val context = LocalContext.current


    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0x7EF1F1F1)),
    ){
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
            text = "Professionals",
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
        ) {
            Column {
                Text(
                    text = "Need Help From A Professional?",
                    modifier = Modifier.padding(20.dp),
                    fontSize = 15.sp,
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
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {


        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(480.dp)
                .padding(start = 15.dp, end = 15.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(280.dp)
                    .background(Color(0x7EF1F1F1)),
            ) {
            }
            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Advanta Africa",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.DarkGray,
                    fontFamily = FontFamily.SansSerif
                )

                Icon(imageVector = Icons.Default.AccountCircle,
                    contentDescription = "alternative Login",
                    modifier = Modifier
                        .size(32.dp)
                        .clickable {
                            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                            ActivityCompat.startActivityForResult(
                                context as Activity,
                                takePictureIntent,
                                1,
                                null
                            )
                        }
                        .clip(CircleShape)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {


                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Gray
                )
                Spacer(modifier = Modifier.width(290.dp))
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.FavoriteBorder,
                    contentDescription = "",
                    modifier = Modifier
                        .size(20.dp)
                        .clickable {
                            navController.navigate(
                                ROUTE_BOOKMARKS
                            )
                        })
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "Interior Designers & Decorators in Gurgaon, Haryana,India",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Gray,
                    fontFamily = FontFamily.SansSerif
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 45.dp, end = 45.dp)
                    .wrapContentSize(align = Alignment.BottomStart),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Call, contentDescription = "",
                    modifier = Modifier
                        .size(15.dp)
                        .clickable {
                            val intent =
                                Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918511812660"))

                            if (ContextCompat.checkSelfPermission(
                                    context,
                                    android.Manifest.permission.CALL_PHONE
                                ) != PackageManager.PERMISSION_GRANTED
                            ) {
                                ActivityCompat.requestPermissions(
                                    context as Activity,
                                    arrayOf(android.Manifest.permission.CALL_PHONE),
                                    1
                                )
                            } else {
                                context.startActivity(intent)
                            }
                        }
                )
                Spacer(modifier = Modifier.width(5.dp))

                Text("Call")
                Spacer(modifier = Modifier.width(125.dp))

                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.MailOutline, contentDescription = "",
                    modifier = Modifier
                        .size(15.dp)
                        .clickable {
                            val uri = Uri.parse("smsto:07456789")

                            val intent = Intent(Intent.ACTION_SENDTO, uri)

                            intent.putExtra("Hello", "How is today's weather")

                        }
                )
                Spacer(modifier = Modifier.width(5.dp))

                Text("Message")
            }


        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(460.dp)
                .padding(start = 15.dp, end = 15.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(280.dp)
                    .background(Color(0x7EF1F1F1)),
            ) {
            }
            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Livonta Global Pvt.Ltd -Medical",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.DarkGray,
                    fontFamily = FontFamily.SansSerif
                )

                Icon(imageVector = Icons.Default.AccountCircle,
                    contentDescription = "alternative Login",
                    modifier = Modifier
                        .size(32.dp)
                        .clickable {
                            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                            ActivityCompat.startActivityForResult(
                                context as Activity,
                                takePictureIntent,
                                1,
                                null
                            )
                        }
                        .clip(CircleShape)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {


                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Gray
                )
                Spacer(modifier = Modifier.width(290.dp))
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.FavoriteBorder,
                    contentDescription = "",
                    modifier = Modifier.size(20.dp)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "Other Businesses in Ahmedabad",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Gray,
                    fontFamily = FontFamily.SansSerif
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 45.dp, end = 45.dp)
                    .wrapContentSize(align = Alignment.BottomStart),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Call, contentDescription = "",
                    modifier = Modifier
                        .size(15.dp)
                        .clickable {
                            val intent =
                                Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918511812660"))

                            if (ContextCompat.checkSelfPermission(
                                    context,
                                    android.Manifest.permission.CALL_PHONE
                                ) != PackageManager.PERMISSION_GRANTED
                            ) {
                                ActivityCompat.requestPermissions(
                                    context as Activity,
                                    arrayOf(android.Manifest.permission.CALL_PHONE),
                                    1
                                )
                            } else {
                                context.startActivity(intent)
                            }
                        }
                )
                Spacer(modifier = Modifier.width(5.dp))

                Text("Call")
                Spacer(modifier = Modifier.width(125.dp))

                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.MailOutline, contentDescription = "",
                    modifier = Modifier
                        .size(15.dp)
                        .clickable {
                            val uri = Uri.parse("smsto:07456789")

                            val intent = Intent(Intent.ACTION_SENDTO, uri)

                            intent.putExtra("Hello", "How is todays weather")

                        }
                )
                Spacer(modifier = Modifier.width(5.dp))

                Text("Message")
            }


        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(480.dp)
                .padding(start = 15.dp, end = 15.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(280.dp)
                    .background(Color(0x7EF1F1F1)),
            ) {
            }
            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "GreenArk",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.DarkGray,
                    fontFamily = FontFamily.SansSerif
                )

                Icon(imageVector = Icons.Default.AccountCircle,
                    contentDescription = "alternative Login",
                    modifier = Modifier
                        .size(32.dp)
                        .clickable {
                            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                            ActivityCompat.startActivityForResult(
                                context as Activity,
                                takePictureIntent,
                                1,
                                null
                            )
                        }
                        .clip(CircleShape)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {


                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Gray
                )
                Spacer(modifier = Modifier.width(290.dp))
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.FavoriteBorder,
                    contentDescription = "",
                    modifier = Modifier.size(20.dp)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "Interior Designers & Decorators in Gurugram",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Gray,
                    fontFamily = FontFamily.SansSerif
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 45.dp, end = 45.dp)
                    .wrapContentSize(align = Alignment.BottomStart),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Call, contentDescription = "",
                    modifier = Modifier
                        .size(15.dp)
                        .clickable {
                            val intent =
                                Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918511812660"))

                            if (ContextCompat.checkSelfPermission(
                                    context,
                                    android.Manifest.permission.CALL_PHONE
                                ) != PackageManager.PERMISSION_GRANTED
                            ) {
                                ActivityCompat.requestPermissions(
                                    context as Activity,
                                    arrayOf(android.Manifest.permission.CALL_PHONE),
                                    1
                                )
                            } else {
                                context.startActivity(intent)
                            }
                        }
                )
                Spacer(modifier = Modifier.width(5.dp))

                Text("Call")
                Spacer(modifier = Modifier.width(125.dp))

                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.MailOutline, contentDescription = "",
                    modifier = Modifier
                        .size(15.dp)
                        .clickable {
                            val uri = Uri.parse("smsto:07456789")

                            val intent = Intent(Intent.ACTION_SENDTO, uri)

                            intent.putExtra("Hello", "How is todays weather")

                        }
                )
                Spacer(modifier = Modifier.width(5.dp))

                Text("Message")
            }


        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(480.dp)
                .padding(start = 15.dp, end = 15.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(280.dp)
                    .background(Color(0x7EF1F1F1)),
            ) {
            }
            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Rich & Aki",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.DarkGray,
                    fontFamily = FontFamily.SansSerif
                )

                Icon(imageVector = Icons.Default.AccountCircle,
                    contentDescription = "alternative Login",
                    modifier = Modifier
                        .size(32.dp)
                        .clickable {
                            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                            ActivityCompat.startActivityForResult(
                                context as Activity,
                                takePictureIntent,
                                1,
                                null
                            )
                        }
                        .clip(CircleShape)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {


                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Gray
                )
                Spacer(modifier = Modifier.width(290.dp))
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.FavoriteBorder,
                    contentDescription = "",
                    modifier = Modifier.size(20.dp)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "Interior Designers & Decorators in Gurgaon, Haryana,India",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Gray,
                    fontFamily = FontFamily.SansSerif
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 45.dp, end = 45.dp)
                    .wrapContentSize(align = Alignment.BottomStart),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Call, contentDescription = "",
                    modifier = Modifier
                        .size(15.dp)
                        .clickable {
                            val intent =
                                Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918511812660"))

                            if (ContextCompat.checkSelfPermission(
                                    context,
                                    android.Manifest.permission.CALL_PHONE
                                ) != PackageManager.PERMISSION_GRANTED
                            ) {
                                ActivityCompat.requestPermissions(
                                    context as Activity,
                                    arrayOf(android.Manifest.permission.CALL_PHONE),
                                    1
                                )
                            } else {
                                context.startActivity(intent)
                            }
                        }
                )
                Spacer(modifier = Modifier.width(5.dp))

                Text("Call")
                Spacer(modifier = Modifier.width(125.dp))

                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.MailOutline, contentDescription = "",
                    modifier = Modifier
                        .size(15.dp)
                        .clickable {
                            val uri = Uri.parse("smsto:07456789")

                            val intent = Intent(Intent.ACTION_SENDTO, uri)

                            intent.putExtra("Hello", "How is todays weather")

                        }
                )
                Spacer(modifier = Modifier.width(5.dp))

                Text("Message")
            }


        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(460.dp)
                .padding(start = 15.dp, end = 15.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(280.dp)
                    .background(Color(0x7EF1F1F1)),
            ) {
            }
            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "MGK Studio",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.DarkGray,
                    fontFamily = FontFamily.SansSerif
                )

                Icon(imageVector = Icons.Default.AccountCircle,
                    contentDescription = "alternative Login",
                    modifier = Modifier
                        .size(32.dp)
                        .clickable {
                            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                            ActivityCompat.startActivityForResult(
                                context as Activity,
                                takePictureIntent,
                                1,
                                null
                            )
                        }
                        .clip(CircleShape)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {


                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Gray
                )
                Spacer(modifier = Modifier.width(290.dp))
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.FavoriteBorder,
                    contentDescription = "",
                    modifier = Modifier.size(20.dp)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "Interior Architects in Rome, Italy",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Gray,
                    fontFamily = FontFamily.SansSerif
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 45.dp, end = 45.dp)
                    .wrapContentSize(align = Alignment.BottomStart),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Call, contentDescription = "",
                    modifier = Modifier
                        .size(15.dp)
                        .clickable {
                            val intent =
                                Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918511812660"))

                            if (ContextCompat.checkSelfPermission(
                                    context,
                                    android.Manifest.permission.CALL_PHONE
                                ) != PackageManager.PERMISSION_GRANTED
                            ) {
                                ActivityCompat.requestPermissions(
                                    context as Activity,
                                    arrayOf(android.Manifest.permission.CALL_PHONE),
                                    1
                                )
                            } else {
                                context.startActivity(intent)
                            }
                        }
                )
                Spacer(modifier = Modifier.width(5.dp))

                Text("Call")
                Spacer(modifier = Modifier.width(125.dp))

                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.MailOutline, contentDescription = "",
                    modifier = Modifier
                        .size(15.dp)
                        .clickable {
                            val uri = Uri.parse("smsto:07456789")

                            val intent = Intent(Intent.ACTION_SENDTO, uri)

                            intent.putExtra("Hello", "How is todays weather")

                        }
                )
                Spacer(modifier = Modifier.width(5.dp))

                Text("Message")
            }


        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(480.dp)
                .padding(start = 15.dp, end = 15.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(280.dp)
                    .background(Color(0x7EF1F1F1))
            ) {
            }
            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "LDA Buildemant",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.DarkGray,
                    fontFamily = FontFamily.SansSerif
                )

                Icon(imageVector = Icons.Default.AccountCircle,
                    contentDescription = "alternative Login",
                    modifier = Modifier
                        .size(32.dp)
                        .clickable {
                            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                            ActivityCompat.startActivityForResult(
                                context as Activity,
                                takePictureIntent,
                                1,
                                null
                            )
                        }
                        .clip(CircleShape)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {


                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Gray
                )
                Spacer(modifier = Modifier.width(290.dp))
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.FavoriteBorder,
                    contentDescription = "",
                    modifier = Modifier.size(20.dp)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "General contractors in Lisboa, Portugal",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Gray,
                    fontFamily = FontFamily.SansSerif
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 45.dp, end = 45.dp)
                    .wrapContentSize(align = Alignment.BottomStart),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Call, contentDescription = "",
                    modifier = Modifier
                        .size(15.dp)
                        .clickable {
                            val intent =
                                Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918511812660"))

                            if (ContextCompat.checkSelfPermission(
                                    context,
                                    android.Manifest.permission.CALL_PHONE
                                ) != PackageManager.PERMISSION_GRANTED
                            ) {
                                ActivityCompat.requestPermissions(
                                    context as Activity,
                                    arrayOf(android.Manifest.permission.CALL_PHONE),
                                    1
                                )
                            } else {
                                context.startActivity(intent)
                            }
                        }
                )
                Spacer(modifier = Modifier.width(5.dp))

                Text("Call")
                Spacer(modifier = Modifier.width(125.dp))

                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.MailOutline, contentDescription = "",
                    modifier = Modifier
                        .size(15.dp)
                        .clickable {
                            val uri = Uri.parse("smsto:07456789")

                            val intent = Intent(Intent.ACTION_SENDTO, uri)

                            intent.putExtra("Hello", "How is todays weather")

                        }
                )
                Spacer(modifier = Modifier.width(5.dp))

                Text("Message")
            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(460.dp)
                .padding(start = 15.dp, end = 15.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(280.dp)
                    .background(Color(0x7EF1F1F1))
            ) {
            }
            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "The First",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.DarkGray,
                    fontFamily = FontFamily.SansSerif
                )

                Icon(imageVector = Icons.Default.AccountCircle,
                    contentDescription = "alternative Login",
                    modifier = Modifier
                        .size(32.dp)
                        .clickable {
                            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                            ActivityCompat.startActivityForResult(
                                context as Activity,
                                takePictureIntent,
                                1,
                                null
                            )
                        }
                        .clip(CircleShape)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {


                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Gray
                )
                Spacer(modifier = Modifier.width(290.dp))
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.FavoriteBorder,
                    contentDescription = "",
                    modifier = Modifier.size(20.dp)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "Real Estate agents in Berlin",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Gray,
                    fontFamily = FontFamily.SansSerif
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 45.dp, end = 45.dp)
                    .wrapContentSize(align = Alignment.BottomStart),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Call, contentDescription = "",
                    modifier = Modifier
                        .size(15.dp)
                        .clickable {
                            val intent =
                                Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918511812660"))

                            if (ContextCompat.checkSelfPermission(
                                    context,
                                    android.Manifest.permission.CALL_PHONE
                                ) != PackageManager.PERMISSION_GRANTED
                            ) {
                                ActivityCompat.requestPermissions(
                                    context as Activity,
                                    arrayOf(android.Manifest.permission.CALL_PHONE),
                                    1
                                )
                            } else {
                                context.startActivity(intent)
                            }
                        }
                )
                Spacer(modifier = Modifier.width(5.dp))

                Text("Call")
                Spacer(modifier = Modifier.width(125.dp))

                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.MailOutline, contentDescription = "",
                    modifier = Modifier
                        .size(15.dp)
                        .clickable {
                            val uri = Uri.parse("smsto:07456789")

                            val intent = Intent(Intent.ACTION_SENDTO, uri)

                            intent.putExtra("Hello", "How is todays weather")

                        }
                )
                Spacer(modifier = Modifier.width(5.dp))

                Text("Message")
            }


        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(460.dp)
                .padding(start = 15.dp, end = 15.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(280.dp)
                    .background(Color(0x7EF1F1F1)),
            ) {
            }
            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Domysum Architects LTD",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.DarkGray,
                    fontFamily = FontFamily.SansSerif
                )

                Icon(imageVector = Icons.Default.AccountCircle,
                    contentDescription = "alternative Login",
                    modifier = Modifier
                        .size(32.dp)
                        .clickable {
                            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                            ActivityCompat.startActivityForResult(
                                context as Activity,
                                takePictureIntent,
                                1,
                                null
                            )
                        }
                        .clip(CircleShape)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {


                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Gray
                )
                Spacer(modifier = Modifier.width(290.dp))
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.FavoriteBorder,
                    contentDescription = "",
                    modifier = Modifier.size(20.dp)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "Architects in Nairobi",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Gray,
                    fontFamily = FontFamily.SansSerif
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 45.dp, end = 45.dp)
                    .wrapContentSize(align = Alignment.BottomStart),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Call, contentDescription = "",
                    modifier = Modifier
                        .size(15.dp)
                        .clickable {
                            val intent =
                                Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918511812660"))

                            if (ContextCompat.checkSelfPermission(
                                    context,
                                    android.Manifest.permission.CALL_PHONE
                                ) != PackageManager.PERMISSION_GRANTED
                            ) {
                                ActivityCompat.requestPermissions(
                                    context as Activity,
                                    arrayOf(android.Manifest.permission.CALL_PHONE),
                                    1
                                )
                            } else {
                                context.startActivity(intent)
                            }
                        }
                )
                Spacer(modifier = Modifier.width(5.dp))

                Text("Call")
                Spacer(modifier = Modifier.width(125.dp))

                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.MailOutline, contentDescription = "",
                    modifier = Modifier
                        .size(15.dp)
                        .clickable {
                            val uri = Uri.parse("smsto:07456789")

                            val intent = Intent(Intent.ACTION_SENDTO, uri)

                            intent.putExtra("Hello", "How is todays weather")

                        }
                )
                Spacer(modifier = Modifier.width(5.dp))

                Text("Message")
            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(480.dp)
                .padding(start = 15.dp, end = 15.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(280.dp)
                    .background(Color(0x7EF1F1F1)),
            ) {
            }
            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Advanta Africa",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.DarkGray,
                    fontFamily = FontFamily.SansSerif
                )

                Icon(imageVector = Icons.Default.AccountCircle,
                    contentDescription = "alternative Login",
                    modifier = Modifier
                        .size(32.dp)
                        .clickable {
                            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                            ActivityCompat.startActivityForResult(
                                context as Activity,
                                takePictureIntent,
                                1,
                                null
                            )
                        }
                        .clip(CircleShape)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {


                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Gray
                )
                Spacer(modifier = Modifier.width(290.dp))
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.FavoriteBorder,
                    contentDescription = "",
                    modifier = Modifier.size(20.dp)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "Interior Designers & Decorators in Gurgaon, Haryana,India",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Gray,
                    fontFamily = FontFamily.SansSerif
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 45.dp, end = 45.dp)
                    .wrapContentSize(align = Alignment.BottomStart),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Call, contentDescription = "",
                    modifier = Modifier
                        .size(15.dp)
                        .clickable {
                            val intent =
                                Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918511812660"))

                            if (ContextCompat.checkSelfPermission(
                                    context,
                                    android.Manifest.permission.CALL_PHONE
                                ) != PackageManager.PERMISSION_GRANTED
                            ) {
                                ActivityCompat.requestPermissions(
                                    context as Activity,
                                    arrayOf(android.Manifest.permission.CALL_PHONE),
                                    1
                                )
                            } else {
                                context.startActivity(intent)
                            }
                        }
                )
                Spacer(modifier = Modifier.width(5.dp))

                Text("Call")
                Spacer(modifier = Modifier.width(125.dp))

                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.MailOutline, contentDescription = "",
                    modifier = Modifier
                        .size(15.dp)
                        .clickable {
                            val uri = Uri.parse("smsto:07456789")

                            val intent = Intent(Intent.ACTION_SENDTO, uri)

                            intent.putExtra("Hello", "How is todays weather")

                        }
                )
                Spacer(modifier = Modifier.width(5.dp))

                Text("Message")
            }


        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(460.dp)
                .padding(start = 15.dp, end = 15.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(280.dp)
                    .background(Color(0x7EF1F1F1)),
            ) {
            }
            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "GG Interior",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.DarkGray,
                    fontFamily = FontFamily.SansSerif
                )

                Icon(imageVector = Icons.Default.AccountCircle,
                    contentDescription = "alternative Login",
                    modifier = Modifier
                        .size(32.dp)
                        .clickable {
                            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                            ActivityCompat.startActivityForResult(
                                context as Activity,
                                takePictureIntent,
                                1,
                                null
                            )
                        }
                        .clip(CircleShape)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {


                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Black
                )
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "",
                    modifier = Modifier.size(15.dp),
                    tint = Color.Gray
                )
                Spacer(modifier = Modifier.width(290.dp))
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.FavoriteBorder,
                    contentDescription = "",
                    modifier = Modifier.size(20.dp)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "Interior Architects in Aosta",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Gray,
                    fontFamily = FontFamily.SansSerif
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 45.dp, end = 45.dp)
                    .wrapContentSize(align = Alignment.BottomStart),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Call, contentDescription = "",
                    modifier = Modifier
                        .size(15.dp)
                        .clickable {
                            val intent =
                                Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918511812660"))

                            if (ContextCompat.checkSelfPermission(
                                    context,
                                    android.Manifest.permission.CALL_PHONE
                                ) != PackageManager.PERMISSION_GRANTED
                            ) {
                                ActivityCompat.requestPermissions(
                                    context as Activity,
                                    arrayOf(android.Manifest.permission.CALL_PHONE),
                                    1
                                )
                            } else {
                                context.startActivity(intent)
                            }
                        }
                )
                Spacer(modifier = Modifier.width(5.dp))

                Text("Call")
                Spacer(modifier = Modifier.width(125.dp))

                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.MailOutline, contentDescription = "",
                    modifier = Modifier
                        .size(15.dp)
                        .clickable {
                            val uri = Uri.parse("smsto:07456789")

                            val intent = Intent(Intent.ACTION_SENDTO, uri)

                            intent.putExtra("Hello", "How is todays weather")

                        }
                )
                Spacer(modifier = Modifier.width(5.dp))

                Text("Message")
            }
            }

             }

    }


}

@Preview(showBackground = true)
@Composable
fun ProfessionalsScreenPreview(){
    ProfessionalsScreen(rememberNavController())
}
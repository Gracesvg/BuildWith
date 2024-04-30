package com.grace.build_with.screens.contact_information

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
import androidx.compose.material.Checkbox
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.grace.build_with.R
import com.grace.build_with.navigation.ROUTE_CONTACT_INFORMATION
import com.grace.build_with.navigation.ROUTE_PUBLISH

@Composable
fun ContactInformationScreen(navController: NavHostController) {
    var firstname by remember { mutableStateOf(TextFieldValue("")) }
    var lastname by remember { mutableStateOf(TextFieldValue("")) }
    var email by remember { mutableStateOf(TextFieldValue("")) }

    val (checked,onCheckedChange)= rememberSaveable {
        mutableStateOf(false)
    }

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0x7EF1F1F1)))
        {
    }

    Column (
        Modifier.verticalScroll(rememberScrollState())
    ) {

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Filled.KeyboardArrowLeft,
                null,
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp)
                    .size(32.dp)
                    .clickable {},
                tint = Color.Gray
            )
            Spacer(modifier = Modifier.width(25.dp))


            Text(
                "Personal Contact",
                modifier = Modifier.padding(20.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Gray,
                fontFamily = FontFamily.SansSerif
            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value =firstname ,
            onValueChange ={firstname=it},
            modifier = Modifier.fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            placeholder = { Text(text = "Enter firstname")}
        )
        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value =lastname ,
            onValueChange ={lastname=it},
            modifier = Modifier.fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            placeholder = { Text(text = "Enter lastname")}
        )
        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value =email ,
            onValueChange ={email=it},
            modifier = Modifier.fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            placeholder = { Text(text = "Enter email")}
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(checked =checked , onCheckedChange =onCheckedChange )
                Text( "This project will take place at the same address")
            }
        }

        Spacer(modifier = Modifier.height(325.dp))
        Divider(modifier = Modifier.padding(start = 5.dp, end = 5.dp))
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedButton(
            onClick = {},
            modifier = Modifier
                .clickable { navController.navigate(ROUTE_PUBLISH) }
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF94AD95))
        ) {

            androidx.compose.material3.Text(
                text = "NEXT",
                fontFamily = FontFamily.SansSerif,
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold

            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ContactInformationScreenPreview() {
    ContactInformationScreen(rememberNavController())
}
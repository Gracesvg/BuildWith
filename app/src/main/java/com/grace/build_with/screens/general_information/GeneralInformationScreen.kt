package com.grace.build_with.screens.general_information

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
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
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
import com.grace.build_with.navigation.ROUTE_CONTACT_INFORMATION
import com.grace.build_with.navigation.ROUTE_GENERAL_INFORMATION


@Composable
fun GeneralInformationScreen(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize()
        .background(Color(0x7EF1F1F1)),


        ) {
    }

    Column(
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
                tint = Color.White
            )
            Spacer(modifier = Modifier.width(25.dp))


            androidx.compose.material.Text(
                "General Information",
                modifier = Modifier.padding(20.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White,
                fontFamily = FontFamily.SansSerif
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Create a title for your request")
            Icon(
                imageVector = Icons.Filled.KeyboardArrowDown,
                contentDescription = "",
                modifier = Modifier.size(25.dp)
                    .clickable { },
                tint = Color.Black
            )
        }
        Divider(modifier = Modifier.padding(start = 10.dp, end = 10.dp))

        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Describe your request in more detail  ")
            Icon(
                imageVector = Icons.Filled.KeyboardArrowDown,
                contentDescription = "",
                modifier = Modifier.size(25.dp)
                    .clickable { },
                tint = Color.Black
            )
        }
        Divider(modifier = Modifier.padding(start = 10.dp, end = 10.dp))

        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Upload a photo for further description")
            Icon(
                imageVector = Icons.Filled.KeyboardArrowDown,
                contentDescription = "",
                modifier = Modifier.size(25.dp)
                    .clickable { },
                tint = Color.Black
            )
        }
        Divider(modifier = Modifier.padding(start = 10.dp, end = 10.dp))

        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("What is the current status of your project?")
            Icon(
                imageVector = Icons.Filled.KeyboardArrowDown,
                contentDescription = "",
                modifier = Modifier.size(25.dp)
                    .clickable { },
                tint = Color.Black
            )
        }
        Divider(modifier = Modifier.padding(start = 10.dp, end = 10.dp))
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("What is your budget for the project?")
            Icon(
                imageVector = Icons.Filled.KeyboardArrowDown,
                contentDescription = "",
                modifier = Modifier.size(25.dp)
                    .clickable { },
                tint = Color.Black
            )
        }
        Divider(modifier = Modifier.padding(start = 10.dp, end = 10.dp))

        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("What is the deadline of the project?")
            Icon(
                imageVector = Icons.Filled.KeyboardArrowDown,
                contentDescription = "",
                modifier = Modifier.size(25.dp)
                    .clickable { },
                tint = Color.Black
            )
        }
        OutlinedButton(
            onClick = {},
            modifier = Modifier
                .clickable { navController.navigate(ROUTE_CONTACT_INFORMATION) }
                .fillMaxWidth()
                .padding(start = 25.dp, end = 25.dp),
            shape = RoundedCornerShape(15.dp),
            border = BorderStroke(3.dp, Color.DarkGray)
        ) {

            Text(
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
fun GeneralInformationScreenPreview() {
    GeneralInformationScreen(rememberNavController())
}
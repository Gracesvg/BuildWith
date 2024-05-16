package com.grace.build_with.screens.profile

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.net.Uri
import android.os.Build
import android.provider.MediaStore
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.ActivityCompat
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.grace.build_with.data.AuthViewModel
import com.grace.build_with.navigation.ROUTE_HOME
import com.grace.build_with.navigation.ROUTE_REGISTERPROFESSIONAL
import com.grace.build_with.navigation.ROUTE_SETTINGS
import com.grace.build_with.navigation.ROUTE_SIGNUP
import com.grace.build_with.navigation.ROUTE_UPDATEPROFESSIONALS

@Composable
fun ProfileScreen(navController: NavHostController) {
    val context = LocalContext.current

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0x7EF1F1F1)),
    ){
    }

    Column (
        Modifier.verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.height(10.dp))
        Spacer(modifier = Modifier.height(10.dp))
        Spacer(modifier = Modifier.height(10.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(
                Icons.Filled.Close,
                null,
                modifier = Modifier
                    .padding(start = 25.dp, end = 15.dp)
                    .size(30.dp)
                    .clickable {navController.navigate(ROUTE_HOME){
                        popUpTo(navController.graph.findStartDestination().id){
                            saveState= true
                        }

                    } },
                tint = Color.Gray
            )
            Spacer(modifier = Modifier.width(40.dp))


            Text(
                "Profile",
                modifier = Modifier.padding(20.dp),
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Gray,
                fontFamily = FontFamily.SansSerif
            )
            Spacer(modifier = Modifier.width(40.dp))

            Text(
                "Save",
                modifier = Modifier
                    .padding(end = 15.dp)
                    .clickable {
//                        notification.value = "Profile Updated "
                    },
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Gray,
                fontFamily = FontFamily.SansSerif
            )
        }
        Divider(modifier = Modifier.padding(start = 5.dp, end = 5.dp))
        Spacer(modifier = Modifier.height(20.dp))

        ProfileImage()
        Spacer(modifier = Modifier.height(20.dp))

        Divider(modifier = Modifier.padding(start = 5.dp, end = 5.dp))
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable { }) {
            androidx.compose.material3.Icon(
                imageVector = Icons.Filled.Person,
                tint = Color(0xFF94AD95),
                contentDescription = "",

                modifier = Modifier.size(32.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))

            Text(
                text = "Username,Phone Numbers, Email",
                modifier = Modifier
                    .padding(15.dp)
                    .clickable { },
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray,
                fontFamily = FontFamily.SansSerif
            )
        }


        Divider(modifier = Modifier.padding(start = 5.dp, end = 5.dp))
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable { }) {
            androidx.compose.material3.Icon(
                imageVector = Icons.Filled.Lock,
                tint = Color(0xFF94AD95),

                contentDescription = "",
                modifier = Modifier.size(32.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))

            Text(
                text = "Passwords & Security",
                modifier = Modifier
                    .padding(15.dp)
                    .clickable { },
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray,
                fontFamily = FontFamily.SansSerif
            )
        }

        Divider(modifier = Modifier.padding(start = 5.dp, end = 5.dp))
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable { }) {
            androidx.compose.material3.Icon(
                imageVector = Icons.Filled.Notifications,
                tint = Color(0xFF94AD95),

                contentDescription = "",
                modifier = Modifier.size(32.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))

            Text(
                text = "Notifications",
                modifier = Modifier
                    .padding(15.dp)
                    .clickable { },
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray,
                fontFamily = FontFamily.SansSerif
            )
        }
        Divider(modifier = Modifier.padding(start = 5.dp, end = 5.dp))
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable {
                navController.navigate(ROUTE_REGISTERPROFESSIONAL)
            }) {
            androidx.compose.material3.Icon(
                imageVector = Icons.Filled.Build,
                tint = Color(0xFF94AD95),

                contentDescription = "",
                modifier = Modifier.size(32.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))

            Text(
                text = "Register Business",
                modifier = Modifier
                    .padding(15.dp)
                    .clickable { },
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray,
                fontFamily = FontFamily.SansSerif
            )
        }
        Divider(modifier = Modifier.padding(start = 5.dp, end = 5.dp))
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable {
                navController.navigate(ROUTE_REGISTERPROFESSIONAL)
            }) {
            androidx.compose.material3.Icon(
                imageVector = Icons.Filled.Build,
                tint = Color(0xFF94AD95),

                contentDescription = "",
                modifier = Modifier.size(32.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))

            Text(
                text = "Update Registered Business",
                modifier = Modifier
                    .padding(15.dp)
                    .clickable {
                        navController.navigate(ROUTE_UPDATEPROFESSIONALS)

                    },
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray,
                fontFamily = FontFamily.SansSerif
            )
        }

        Divider(modifier = Modifier.padding(start = 5.dp, end = 5.dp))
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable { }) {
            Icon(
                imageVector = Icons.Filled.Settings,
                tint = Color(0xFF94AD95),

                contentDescription = "",
                modifier = Modifier.size(32.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))

            Text(
                text = "Account Settings",
                modifier = Modifier
                    .padding(15.dp)
                    .clickable { navController.navigate(ROUTE_SETTINGS) },
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray,
                fontFamily = FontFamily.SansSerif
            )
        }




        Spacer(modifier = Modifier.height(325.dp))
        Divider(modifier = Modifier.padding(start = 5.dp, end = 5.dp))
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedButton(
            onClick = {
                val xyz = AuthViewModel(navController, context)
                xyz.logout()
            },
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.BottomCenter),
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF94AD95))

        ) {

            androidx.compose.material3.Text(
                text = "SignOut",
                modifier = Modifier.clickable { navController.navigate(ROUTE_SIGNUP) },

                fontFamily = FontFamily.SansSerif,
                color = Color.White,
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold

            )
        }








    }

    }
@Composable
fun ProfileImage(){
    val context = LocalContext.current
    var imageUri by remember { mutableStateOf<Uri?>(null) }
    val bitmap =  remember { mutableStateOf<Bitmap?>(null) }

    val launcher =rememberLauncherForActivityResult(contract = ActivityResultContracts.GetContent())
    { uri: Uri? ->
        imageUri = uri }

    imageUri?.let {
        if (Build.VERSION.SDK_INT < 28) {
            bitmap.value = MediaStore.Images.Media.getBitmap(context.contentResolver,it)

        } else {
            val source = ImageDecoder.createSource(context.contentResolver,it)
            bitmap.value = ImageDecoder.decodeBitmap(source)

        }

        bitmap.value?.let {  btm ->
            Image(bitmap = btm.asImageBitmap(), contentDescription =null,
                modifier = Modifier.size(400.dp).wrapContentSize().clickable { launcher.launch("image/*")})
        }
    }
    Column(modifier = Modifier
        .padding(start = 5.dp)
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(shape = CircleShape,
            modifier = Modifier
                .padding(5.dp)
                .size(100.dp)
        ) {}
        Spacer(modifier = Modifier.height(5.dp))
        Text("Edit  Profile",
            modifier = Modifier
                .padding(2.dp)
                .clickable {
                    val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                    ActivityCompat.startActivityForResult(
                        context as Activity,
                        takePictureIntent,
                        1,
                        null
                    )
                },
            fontSize = 15.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Gray,
            fontFamily = FontFamily.SansSerif

        )


    }







}


@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen(rememberNavController())
}

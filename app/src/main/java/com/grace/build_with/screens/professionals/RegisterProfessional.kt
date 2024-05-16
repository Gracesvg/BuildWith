package com.grace.build_with.screens.professionals

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.grace.build_with.data.ProfessionalViewModel
import com.grace.build_with.navigation.ROUTE_PROFESSIONALS
import com.grace.build_with.screens.bookmarks.BookmarkScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddProfessionalUserScreen(navController: NavHostController) {
    var context = LocalContext.current
    var ProfessionalName by remember { mutableStateOf(TextFieldValue("")) }
    var ProfessionalId by remember { mutableStateOf(TextFieldValue("")) }
    var ProfessionalNo by remember { mutableStateOf(TextFieldValue("")) }
    var Professionalemail by remember { mutableStateOf(TextFieldValue("")) }
    var Professionaldescription by remember { mutableStateOf(TextFieldValue("")) }



    Column(

        modifier = Modifier
            .fillMaxSize()
            .background(Color(0x7EF1F1F1)),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {


        Spacer(modifier = Modifier.height(10.dp))
        Spacer(modifier = Modifier.height(10.dp))

        Spacer(modifier = Modifier.height(10.dp))

        Spacer(modifier = Modifier.height(10.dp))

        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text = "REGISTER BUSINESS",
            modifier = Modifier.padding(20.dp),
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold, color = Color.Gray,
            fontFamily = FontFamily.SansSerif
        )
        Spacer(modifier = Modifier.height(30.dp))

        //Textfields
        Column(modifier = Modifier.padding(20.dp)) {
            androidx.compose.material.OutlinedTextField(
                value = ProfessionalName,
                onValueChange = { ProfessionalName = it },
                shape = CutCornerShape(5.dp),
                modifier = Modifier.fillMaxWidth(),
                label = { androidx.compose.material.Text(text = "ProfessionalName") },
                placeholder = { androidx.compose.material.Text(text = "Enter ProfessionalName") },
                leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = ProfessionalId,
                onValueChange = { ProfessionalId = it },
                shape = CutCornerShape(5.dp),
                modifier = Modifier
                    .fillMaxWidth(),
                label = { androidx.compose.material.Text(text = "ProfessionalId") },
                placeholder = { androidx.compose.material.Text(text = "Enter ProfessionalId") },
                leadingIcon = { Icon(imageVector = Icons.Default.DateRange, contentDescription = "") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            )

            Spacer(modifier = Modifier.height(20.dp))

            androidx.compose.material.OutlinedTextField(
                value = ProfessionalNo,
                onValueChange = { ProfessionalNo = it },
                shape = CutCornerShape(5.dp),
                modifier = Modifier
                    .fillMaxWidth(),
                label = { Text(text = "ProfessionalNo") },
                placeholder = { Text(text = "Enter ProfessionalNo") },
                leadingIcon = { Icon(imageVector = Icons.Default.Call, contentDescription = "") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

            )

            Spacer(modifier = Modifier.height(20.dp))

            androidx.compose.material.OutlinedTextField(
                value = Professionalemail,
                onValueChange = { Professionalemail = it },
                shape = CutCornerShape(5.dp),
                modifier = Modifier
                    .fillMaxWidth(),
                label = {Text(text = "Professionalemail") },
                placeholder = { Text(text = "Enter Professionalemail") },
                leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation()
            )
            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = Professionaldescription,
                onValueChange = { Professionaldescription = it },
                shape = CutCornerShape(5.dp),
                modifier = Modifier
                    .fillMaxWidth(),
                label = { Text(text = "Professionaldescription") },
                placeholder = { Text(text = "Enter description") },
                leadingIcon = { Icon(imageVector = Icons.Default.Edit, contentDescription = "") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            )
        }
        Button(
            onClick = {
                val AuthViewModel = ProfessionalViewModel(navController, context)
                AuthViewModel.saveProfessionalUser(
                    ProfessionalName.text.trim(),
                    ProfessionalId.text.trim(),
                    ProfessionalNo.text.trim(),
                    Professionalemail.text.trim(),
//                    Professionaldescription.text.trim()
                )
                navController.navigate(ROUTE_PROFESSIONALS)

            },
            modifier = Modifier.width(300.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFFAEC9AF)),
        ) {
            Text(text = "Submit")
        }
    }
}
@Preview(showBackground = true)
@Composable
fun AddProfessionalUserScreenPreview() {
    AddProfessionalUserScreen(rememberNavController())
}

package com.grace.build_with.screens.signup

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.grace.build_with.data.AuthViewModel
import com.grace.build_with.navigation.ROUTE_LOGIN

@Composable
fun SignupScreen(navController: NavHostController) {
    val mContext = LocalContext.current
    var firstname by remember { mutableStateOf(TextFieldValue("")) }
    var lastname by remember { mutableStateOf(TextFieldValue("")) }
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0x7EF1F1F1)),
        horizontalAlignment = Alignment.CenterHorizontally)
    {



        Spacer(modifier = Modifier.height(20.dp))


        Spacer(modifier = Modifier.height(320.dp))

        Text(
            text = "SIGN UP",
            fontSize = 10.sp,
            color = Color.DarkGray,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.SemiBold,

            )
        Spacer(modifier = Modifier.height(30.dp))

        //Textfields
        Column(modifier = Modifier.padding(20.dp)) {
            OutlinedTextField(value = firstname ,
                onValueChange = {firstname=it},
                shape = CutCornerShape(5.dp),
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Firstname")},
                placeholder = { Text(text = "Enter firstname")},
                leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(value = lastname ,
                onValueChange = {lastname=it},
                shape = CutCornerShape(5.dp),
                modifier = Modifier
                    .fillMaxWidth(),
                label = { Text(text = "Lastname")},
                placeholder = { Text(text = "Enter lastname")},
                leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(value = email ,
                onValueChange = {email=it},
                shape = CutCornerShape(5.dp),
                modifier = Modifier
                    .fillMaxWidth(),
                label = { Text(text = "Email")},
                placeholder = { Text(text = "Enter email")},
                leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(value = password ,
                onValueChange = {password=it},
                shape = CutCornerShape(5.dp),
                modifier = Modifier
                    .fillMaxWidth(),
                label = { Text(text = "Password")},
                placeholder = { Text(text = "Type your password")},
                leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation()
            )

        }

        Button(onClick = {
            // HANDLE SIGNUP LOGIC //
            var xyz = AuthViewModel(navController, mContext)
            xyz.signup(email.text.trim(),password.text.trim())
        },
            colors = androidx.compose.material.ButtonDefaults.buttonColors(Color.Transparent),
            modifier = Modifier.width(300.dp),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(text = "Register", color = Color.DarkGray)
        }
        Spacer(modifier = Modifier.height(10.dp))

        Row {
            Text(
                text = "Already have an account?"
            )

            Text(
                text = "Login",
                modifier = Modifier.clickable {
                    navController.navigate(ROUTE_LOGIN)
                },
                fontSize = 15.sp
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun RegisterScreenPreview() {
    SignupScreen(rememberNavController())


}

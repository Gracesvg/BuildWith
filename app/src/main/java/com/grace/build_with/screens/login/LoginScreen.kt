package com.grace.build_with.screens.login

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.grace.build_with.R
import com.grace.build_with.data.AuthViewModel
import com.grace.build_with.navigation.ROUTE_SIGNUP

@Composable
fun LoginScreen(navController: NavHostController) {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    val context = LocalContext.current
    val (checked,onCheckedChange)= rememberSaveable {
        mutableStateOf(false)
    }


    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "SIGN IN",
            fontSize = 10.sp,
            color = Color.DarkGray,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(30.dp))


                //Text-fields
                Column(modifier = Modifier.padding(20.dp)) {

                    Spacer(modifier = Modifier.height(20.dp))

                    OutlinedTextField(
                        value = email,
                        onValueChange = { email = it },
                        shape = RoundedCornerShape(5.dp),
                        modifier = Modifier
                            .fillMaxWidth(),
                        label = { Text(text = "Email Address") },
                        placeholder = { Text(text = "Enter email") },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Email,
                                contentDescription = ""
                            )
                        },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    OutlinedTextField(
                        value = password,
                        onValueChange = { password = it },
                        modifier = Modifier
                            .fillMaxWidth(),
                        label = { Text(text = "Password") },
                        placeholder = { Text(text = "Type your password") },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Lock,
                                contentDescription = ""
                            )
                        },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        visualTransformation = PasswordVisualTransformation()
                    )
                    Spacer(modifier = Modifier.height(20.dp))

                    Row (
                        modifier = Modifier
                            .fillMaxWidth() ,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Row(
                            horizontalArrangement = Arrangement.Center,

                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Checkbox(checked =checked , onCheckedChange =onCheckedChange )
                            Text( "Remember Me")
                            Modifier.width(5.dp)
                        }
                        TextButton(onClick = {  },
                            contentPadding = PaddingValues(end = 15.dp),

                            ) {
                            Text("Forgot Password?")
                        }
                    }
                }
        Button(
            onClick = {
                        // HANDLE LOGIN LOGIC //
                        val xyz = AuthViewModel(navController, context)
                        xyz.login(email.text, password.text)
                    },
            colors = ButtonDefaults.buttonColors(Color(0xFF697C6A)),
            modifier = Modifier.width(300.dp),
            shape = RoundedCornerShape(10.dp)
            ) {
            Text(text = "Login",
                color = Color.DarkGray)
            }
        Spacer(modifier = Modifier.height(10.dp))

        AlternativeLoginOptions(
            onIconClick ={
                         index ->
                when(index){
                    0 ->{
                        Toast.makeText(context,"LinkedIn Login Click",Toast.LENGTH_SHORT).show()
                    }
                    1 ->{
                        Toast.makeText(context,"Github Login Click",Toast.LENGTH_SHORT).show()

                    }
                    2 ->{
                        Toast.makeText(context,"Google Login Click",Toast.LENGTH_SHORT).show()

                    }
                }
            } ,
            onSignUpClick = { navController.navigate(ROUTE_SIGNUP) },
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(align = Alignment.BottomCenter))

        }
    }
@Composable
fun AlternativeLoginOptions(
    onIconClick:(index:Int)-> Unit,
    onSignUpClick:()-> Unit,
    modifier: Modifier = Modifier,
) {
    val iconList = listOf(
        R.drawable.linkedin,
        R.drawable.github,
        R.drawable.google

    )
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Or Sign In With")
        Spacer(modifier = Modifier.height(10.dp))

        Row(horizontalArrangement = Arrangement.SpaceEvenly) {
            iconList.forEachIndexed { index, iconResId ->
                Icon(painter = painterResource(id = iconResId),
                    contentDescription = "alternative Login",
                    modifier = Modifier
                        .size(40.dp)
                        .clickable {
                            onIconClick(index)
                        }
                        .clip(CircleShape)
                )
                Spacer(modifier = Modifier.width(10.dp))

            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Do not have an account?")

            TextButton(onClick = onSignUpClick) {
                Text("Sign Up")
            }

        }

    }
}




@Preview(showBackground = true)
@Composable
fun loginScreenPreview() {
    LoginScreen(rememberNavController())
    }


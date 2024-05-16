package com.grace.build_with.data

import android.content.Context
import android.widget.Toast
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth
import com.grace.build_with.navigation.ROUTE_HOME
import com.grace.build_with.navigation.ROUTE_LOGIN


class AuthViewModel(var navController: NavController, var context: Context) {
    private var mAuth: FirebaseAuth


    init {
        mAuth = FirebaseAuth.getInstance()

    }

    fun signup(email: String, password: String) {
        if (email.isBlank() || password.isBlank()) {
            Toast.makeText(context, "Please  Email and password cannot be blank", Toast.LENGTH_LONG)
                .show()
        } else {
            mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
                if (it.isSuccessful) {
                    Toast.makeText(context, "Register successful", Toast.LENGTH_SHORT).show()
                    navController.navigate(ROUTE_HOME)
                } else {
                    Toast.makeText(context, "Failed to create user", Toast.LENGTH_SHORT).show()
                }
            }
        }


    }


    fun login(email: String, password: String) {

        if (email.isBlank() || password.isBlank()) {
            Toast.makeText(context, "Please Email and password cannot be blank", Toast.LENGTH_LONG)
                .show()
        } else{
            mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener {
                if (it.isSuccessful){
                    Toast.makeText(context, "Login successful", Toast.LENGTH_SHORT).show()
                    navController.navigate(ROUTE_HOME)
                }
                else{
                    Toast.makeText(context, "Login Failed", Toast.LENGTH_SHORT).show()

                }

            }
        }


    }


    fun logout(){
        mAuth.signOut()
        navController.navigate(ROUTE_LOGIN)
    }

    fun isLoggedIn():Boolean{
        return mAuth.currentUser != null
    }
}
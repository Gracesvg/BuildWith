package com.grace.build_with.data

import android.content.Context
import android.widget.Toast
import androidx.navigation.NavHostController
import com.google.firebase.database.FirebaseDatabase
import com.grace.build_with.models.ProfessionalUser
import com.grace.build_with.navigation.ROUTE_HOME
import com.grace.build_with.navigation.ROUTE_LOGIN




class ProfessionalViewModel(
    var navController: NavHostController,
    var context: Context
) {
    var authViewModel: AuthViewModel

    init {
        authViewModel = AuthViewModel(navController,context)
        if (!authViewModel.isLoggedIn()) {
            navController.navigate(ROUTE_LOGIN)
        }


    }



    fun signUpProfessional(company: String, name: String, email: String) {
        var id = System.currentTimeMillis().toString()
        val professionalData = ProfessionalUser(name,email,company,id)
        var regRef = FirebaseDatabase.getInstance() .getReference()
            .child("ProfessionalsUser/$ id")
        regRef.setValue(professionalData).addOnCompleteListener {


                    if (it.isSuccessful){
                        Toast.makeText(context,"Signup successful", Toast.LENGTH_SHORT).show()
                        navController.navigate(ROUTE_HOME)
                    }
                    else{
                        navController.navigate(ROUTE_LOGIN)
                    }
                }

        }



    }

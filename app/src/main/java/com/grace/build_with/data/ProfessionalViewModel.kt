package com.grace.build_with.data

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.navigation.NavController
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.grace.build_with.models.ProfessionalUser
import com.grace.build_with.navigation.ROUTE_LOGIN




class ProfessionalViewModel(
    var navController: NavController,
    var context: Context
) {
    var authViewModel: AuthViewModel

    init {
        authViewModel = AuthViewModel(navController,context)
        if (!authViewModel.isLoggedIn()) {
            navController.navigate(ROUTE_LOGIN)
        }


    }

    fun saveProfessionalUser(
        name: String,
        email: String,
        phonenumber: String,
        description: String,
    ) {
        var id = System.currentTimeMillis().toString()
        var ProfessionalUserData = ProfessionalUser(name, email, phonenumber, description,  id)
        var ProfessionalUserRef = FirebaseDatabase.getInstance().getReference()
            .child("ProfessionalUser/$id")
//        progress.show()
        ProfessionalUserRef.setValue(ProfessionalUserData).addOnCompleteListener {
//            progress.dismiss()
            if (it.isSuccessful) {
                Toast.makeText(context, "Saving successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "ERROR: ${it.exception!!.message}", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }



    fun viewProfessionalUser(
        professionalUser: MutableState<ProfessionalUser>,
        professionals: SnapshotStateList<ProfessionalUser>
    ): SnapshotStateList<ProfessionalUser> {
        val ref = FirebaseDatabase.getInstance().getReference().child("ProfessionalUser")

        //progress.show()
        ref.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                //progress.dismiss()
                professionals.clear()
                for (snap in snapshot.children) {
                    val value = snap.getValue(ProfessionalUser::class.java)
                    professionalUser.value = value!!
                    professionals.add(value)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context, error.message, Toast.LENGTH_SHORT).show()
            }
        })
        return professionals
    }



    fun deleteProfessionalUser(id: String) {
        var delRef = FirebaseDatabase.getInstance().getReference()
            .child("ProfessionalUser/$id")
//        progress.show()
        delRef.removeValue().addOnCompleteListener {
//            progress.dismiss()
            if (it.isSuccessful) {
                Toast.makeText(context, "Registration Cancelled", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, it.exception!!.message, Toast.LENGTH_SHORT).show()
            }
        }
    }
    fun UpdateProfessionalUser(name: String, id: String, phoneNumber: String, email: String, description: String) {
        val professionalUserRef =
            FirebaseDatabase.getInstance().getReference("ProfessionalUser/$id")
        val updatedData = mapOf(
            "name" to name,
            "id" to id,
            "phoneNumber" to phoneNumber,
            "email" to email,
            "description" to description
        )
        professionalUserRef.updateChildren(updatedData)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Toast.makeText(
                        context,
                        "Professional User updated successfully",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    Toast.makeText(
                        context,
                        "Error updating Professional User: ${task.exception?.message}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
    }
}






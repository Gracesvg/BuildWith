package com.grace.build_with.screens.professionals
//
//import android.widget.Toast
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.text.KeyboardOptions
//import androidx.compose.material3.Button
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.OutlinedTextField
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.text.font.FontFamily
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.input.KeyboardType
//import androidx.compose.ui.text.input.TextFieldValue
//import androidx.compose.ui.text.style.TextDecoration
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavController
//import androidx.navigation.compose.rememberNavController
//import com.google.firebase.database.DataSnapshot
//import com.google.firebase.database.DatabaseError
//import com.google.firebase.database.FirebaseDatabase
//import com.google.firebase.database.ValueEventListener
//import com.grace.build_with.data.ProfessionalViewModel
//import com.grace.build_with.models.ProfessionalUser
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun UpdateProfessionalUserScreen(navController: NavController, id:String) {
//    val context = LocalContext.current
//    var name by remember { mutableStateOf("") }
//    var email by remember { mutableStateOf("") }
//    var phonenumber by remember { mutableStateOf("") }
//    var description by remember { mutableStateOf("") }
//
//    Column(modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally) {
//
//        val currentDataRef = FirebaseDatabase.getInstance().getReference()
//            .child("ProfessionalUser/$id")
//        currentDataRef.addValueEventListener(object: ValueEventListener{
//            override fun onDataChange(snapshot: DataSnapshot) {
//                val professionals = snapshot.getValue(ProfessionalUser::class.java)
//                name = professionals!!.name
//                email = professionals.email
//                phonenumber = professionals.phonenumber
//                description = professionals.description
//            }
//
//            override fun onCancelled(error: DatabaseError) {
//                Toast.makeText(context, error.message, Toast.LENGTH_SHORT).show()
//            }
//        })
//
//        Text(
//            text = "Update ProfessionalUser",
//            fontSize = 30.sp,
//            fontFamily = FontFamily.Cursive,
//            color = Color.Red,
//            modifier = Modifier.padding(20.dp),
//            fontWeight = FontWeight.Bold,
//            textDecoration = TextDecoration.Underline
//        )
//        var professionalName by remember { mutableStateOf(TextFieldValue("Name"))}
//        var professionalId by remember { mutableStateOf(TextFieldValue("Id/BusinessType")) }
//        var professionalNo by remember { mutableStateOf(TextFieldValue("PhoneNo")) }
//        var professionalemail by remember { mutableStateOf(TextFieldValue("Email")) }
//        var professionaldescription by remember { mutableStateOf(TextFieldValue("Description")) }
//
//        OutlinedTextField(
//            value = professionalName,
//            onValueChange = { professionalName = it },
//            label = { Text(text = "professional Name *") },
//            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
//        )
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        OutlinedTextField(
//            value = professionalId,
//            onValueChange = { professionalId = it },
//            label = { Text(text = "professionalId *") },
//            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
//        )
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        OutlinedTextField(
//            value = professionalNo,
//            onValueChange = { professionalNo = it },
//            label = { Text(text = "professional No *") },
//            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
//        )
//        Spacer(modifier = Modifier.height(20.dp))
//
//        OutlinedTextField(
//            value = professionalemail,
//            onValueChange = { professionalemail = it },
//            label = { Text(text = "professional email *") },
//            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
//        )
//        Spacer(modifier = Modifier.height(20.dp))
//
//        OutlinedTextField(
//            value = professionaldescription,
//            onValueChange = { professionaldescription = it },
//            label = { Text(text = "professional description*") },
//            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
//        )
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        Button(onClick = {
////            //-----------WRITE THE SAVE LOGIC HERE---------------//
//            val authViewModel = ProfessionalViewModel(navController,context)
//            authViewModel.UpdateProfessionalUser(
//                professionalName.text.trim(),
//                professionalId.text.trim(),
//                professionalNo.text.trim(),
//                professionalemail.text.trim(),
//                professionaldescription.text.trim())
//
//        }) {
//            Text(text = "Save")
//        }
//
//    }
//}
//
//
//
//@Preview
//@Composable
//fun UpdateProfessionalUserScreen() {
//    UpdateProfessionalUserScreen(rememberNavController(), id = "")
//}

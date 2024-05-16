package com.grace.build_with.models

import androidx.compose.ui.input.pointer.PointerId

class ProfessionalUser {
    var description: String = ""
    var email: String = ""
    var name: String = ""
    var phonenumber: String = ""
    var id: String = ""

    constructor(name: String, email: String, phonenumber: String, description: String,id: String) {
        this.name = name
        this.email = email
        this.phonenumber = phonenumber
        this.description = description
        this.id=id

    }

    constructor()
}

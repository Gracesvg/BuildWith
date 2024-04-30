package com.grace.build_with.models

class ProfessionalUser {
    var name:String = ""
    var email:String = ""
    var company:String = ""
    var phonenumber: String = ""

    constructor(name: String, email: String,company: String,phonenumber:String) {
        this.name = name
        this.email = email
        this.company = company
        this.phonenumber = phonenumber
    }
    constructor()

}
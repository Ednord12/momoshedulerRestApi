package com.example.momosheduler.Controlers

import com.example.momosheduler.Models.UserCompte

import com.example.momosheduler.Repository.UserCompteRepository
import com.example.momosheduler.ServiceLayer
import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.web.bind.annotation.*

@RestController
class UserCompteControler(
/*,var bCryptPasswordEncoder: BCryptPasswordEncoder*/) {


    @Autowired
    lateinit var serviceLayer:ServiceLayer



    @RequestMapping("/simpleemail")
    @ResponseBody
    fun home():String {
        try {
          //  serviceLayer.sendEmail()
            return "Email Sent!"
        }catch( ex: Exception) {
            return "Error in sending email: "+ex

        }

    }


    @GetMapping("/getallusercomptes")
    fun all(): ArrayList<UserCompte> = serviceLayer.getAllUserComptes()


    @GetMapping("/login/{login}/{password}")
    fun login(@PathVariable login: String, @PathVariable password: String): ArrayList<UserCompte> =
            serviceLayer.login(login,password)


    @PostMapping("/createusercomptes")

    fun createCounpt(@RequestBody userCompte:UserCompte):UserCompte {

        if( serviceLayer.existsUserCByLogin(userCompte.phone)){
            return UserCompte()
        }

       var u= serviceLayer.createCompte( userCompte)
        serviceLayer.sendEmail(u.email,u.Id.toString())
        return u
    }

    @GetMapping("/activation/{userId}")
    fun activation(@PathVariable userId:String):String=serviceLayer.userCompteActivation(userId)


    @DeleteMapping("/deleatecomptes/{id}")
    fun deleteOneActionMode(@PathVariable id: Long) = serviceLayer.delete(id)
}
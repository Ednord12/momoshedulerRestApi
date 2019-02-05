package com.example.momosheduler.Controlers

import com.example.momosheduler.Models.ActionMode
import com.example.momosheduler.Models.UserCompte
import com.example.momosheduler.Repository.UserCompteRepository
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.web.bind.annotation.*

@RestController
class UserCompteControler(var userCompteRepository: UserCompteRepository
/*,var bCryptPasswordEncoder: BCryptPasswordEncoder*/){



    @GetMapping("/usercomptes")
    fun all(): ArrayList<UserCompte> = userCompteRepository.findAll() as ArrayList<UserCompte>


    @PostMapping("/usercomptes")
    fun postOneActionMode(@RequestBody userCompte: UserCompte){

        //userCompte.password=bCryptPasswordEncoder.encode(userCompte.password)
        userCompteRepository.save(userCompte)
    }


    @DeleteMapping("/usercomptes/{id}")
    fun deleteOneActionMode(@PathVariable id: Long) = userCompteRepository.deleteById(id)
}
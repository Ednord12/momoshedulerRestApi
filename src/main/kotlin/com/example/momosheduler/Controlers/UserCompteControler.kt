package com.example.momosheduler.Controlers

import com.example.momosheduler.Models.ActionMode
import com.example.momosheduler.Models.UserCompte
import com.example.momosheduler.Repository.UserCompteRepository
import org.springframework.web.bind.annotation.*

@RestController
class UserCompteControler(var userCompteRepository: UserCompteRepository) {



    @GetMapping("/usercomptes")
    fun all(): ArrayList<UserCompte> = userCompteRepository.findAll() as ArrayList<UserCompte>


    @PostMapping("/usercomptes")
    fun postOneActionMode(@RequestBody userCompte: UserCompte) = userCompteRepository.save(userCompte)


    @DeleteMapping("/usercomptes/{id}")
    fun deleteOneActionMode(@PathVariable id: Long) = userCompteRepository.deleteById(id)
}
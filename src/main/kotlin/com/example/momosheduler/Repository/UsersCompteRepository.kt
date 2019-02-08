package com.example.momosheduler.Repository

import com.example.momosheduler.Models.*
import org.springframework.context.annotation.Bean
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface UserCompteRepository : CrudRepository<UserCompte, Long> {

    fun findByPhoneAndPassword(phone: String, password: String): ArrayList<UserCompte>

    @Query("select u from UserCompte u where u.phone=?1")
    fun findUserByPhone(id: String): UserCompte

    fun findByPhone(phone: String):UserCompte
    fun existsByPhone(phone: String):Boolean
}


package com.example.momosheduler

import com.example.momosheduler.Models.Operation
import com.example.momosheduler.Models.UserCompte
import com.example.momosheduler.Repository.OperationRepository
import com.example.momosheduler.Repository.UserCompteRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.context.annotation.Bean

import java.security.Security


@SpringBootApplication()

class MomoshedulerApplication {

    @Bean

    fun init(userCompteRepository: UserCompteRepository) = CommandLineRunner {

        userCompteRepository.save(UserCompte(0, "123",  "user", false,
                false, "Nandard", "AVAHOUNDJE", "ednorddevplus", "66008941"))

        userCompteRepository.save(UserCompte(0, "123",  "user", false,
                false, "ednord", "ASSA", "ednorddevplus", "60311459"))

        userCompteRepository.save(UserCompte(0, "123", "user", false,
                false, "Cano", "HOUDE", "ednorddevplus", "21047146"))



    }
    //fun bCryptPasswordEncoder(): BCryptPasswordEncoder =BCryptPasswordEncoder(10)
}

fun main(args: Array<String>) {
    runApplication<MomoshedulerApplication>(*args)


}
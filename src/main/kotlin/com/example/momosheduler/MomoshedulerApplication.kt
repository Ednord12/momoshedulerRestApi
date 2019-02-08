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

    fun init(userCompteRepository: UserCompteRepository, operationRepository: OperationRepository)
            = CommandLineRunner {

        userCompteRepository.save(UserCompte(0, "123",  "user", false,
                true, "KARL", "GNANHOUI", "ednorddevplus@gmail.com", "66008941"))

        /********************************************/
        operationRepository.save(Operation(0,"KOKOU Arnaud","94665858","MTN","Dépôt",
                "ADJAKITCHE GLORIA","125000","BFD145","AZSFVBFSC"))
        operationRepository.save(Operation(0,"KOKOU Arnaud ","96515858","MTN","Retrait",
                "ASSOU MARC","25000","BFD145","AZSFVBFSC"))
        operationRepository.save(Operation(0,"KOKOU Arnaud","65665858","MOOV","Dépôt",
                "ZINSOU RACHELLE","15000","BFD145","AZSFVBFSC"))
        operationRepository.save(Operation(0,"AKAKPO DAVID","66665512","MTN","Retrait",
                "KOKOU Arnaud","3505000","BFD145","AZSFVBFSC"))
        operationRepository.save(Operation(0,"KOKOU Arnaud","92662525","MOOV","Dépôt",
                "ADA FABRO","5000","BFD145","AZSFVBFSC"))
        operationRepository.save(Operation(0,"KOKOU Arnaud","96333365","MTN","Retrait",
                "BADOU SOPHONIE","25000","BFD145","AZSFVBFSC"))
        operationRepository.save(Operation(0,"DEDRAVO NAWAL","94684848","MOOV","Dépôt",
                "KOKOU Arnaud","12500","BFD145","AZSFVBFSC"))
        operationRepository.save(Operation(0,"KOKOU Arnaud","96898952","MTN","Retrait",
                "QUESSI LIONNEL","124000","BFD145","AZSFVBFSC"))
        operationRepository.save(Operation(0,"KOKOU Arnaud","95336562","MOOV","Dépôt",
                "KOKOU Arnaud","1000","BFD145","AZSFVBFSC"))
        operationRepository.save(Operation(0,"KOKOU Arnaud","976452623","MTN","Retrait",
                "KADOU KINTH","5000","BFD145","AZSFVBFSC"))







    }
    //fun bCryptPasswordEncoder(): BCryptPasswordEncoder =BCryptPasswordEncoder(10)
}

fun main(args: Array<String>) {
    runApplication<MomoshedulerApplication>(*args)


}
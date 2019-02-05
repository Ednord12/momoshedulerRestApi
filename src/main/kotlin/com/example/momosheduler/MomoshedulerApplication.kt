package com.example.momosheduler

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

    //@Bean
    //fun bCryptPasswordEncoder(): BCryptPasswordEncoder =BCryptPasswordEncoder(10)
}

fun main(args: Array<String>) {
    runApplication<MomoshedulerApplication>(*args)


}
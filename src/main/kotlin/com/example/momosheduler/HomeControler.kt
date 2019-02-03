package com.example.momosheduler

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeControler() {
    @RequestMapping("/")
    fun home() = "Welcom"
}
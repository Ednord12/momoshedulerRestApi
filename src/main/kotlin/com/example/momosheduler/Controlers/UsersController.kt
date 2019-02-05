package com.example.momosheduler.Controlers

import com.example.momosheduler.Models.Users
import com.example.momosheduler.Repository.UsersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import javax.websocket.server.PathParam

@RestController
class UsersController(var userRepository: UsersRepository) {


    @GetMapping("/users")
    fun allUsers(): ArrayList<Users> {

        userRepository.save(Users(0, "Ednord", "Avahoundje", "ednorddevplus@gmail.com"))
        return this.userRepository.findAll() as ArrayList<Users>

    }


    //**************

    @PostMapping("/users")
    fun putOneUser(@RequestBody newUsers: Users): Users {

        return userRepository.save(newUsers)
    }

    //*******************


    @PutMapping("/users/{id}")
    fun putOneUser(@PathVariable id: Long, @RequestBody user: Users) {
        userRepository.findById(id).map { u ->
            {
                u.Id = user.Id
                u.email = user.email
                u.name = user.name
                u.phone = user.phone
                u.surname = user.surname
                 userRepository.save(u)
            }
        }.orElseGet {
            {
                user.Id=id.toInt()
                userRepository.save(user)
            }
        }
    }
}




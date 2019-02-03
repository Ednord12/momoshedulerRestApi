package com.example.momosheduler.Controlers

import com.example.momosheduler.Models.ActionMode
import com.example.momosheduler.Models.Customer
import com.example.momosheduler.Repository.CustomerRepository
import org.springframework.web.bind.annotation.*

@RestController
class CustomerControler(var customerRepository: CustomerRepository){



    @GetMapping("/customers")
    fun all(): ArrayList<Customer> = customerRepository.findAll() as ArrayList<Customer>


    @PostMapping("/customers")
    fun postOneActionMode(@RequestBody customer: Customer) = customerRepository.save(customer)


    @DeleteMapping("/customers/{id}")
    fun deleteOneActionMode(@PathVariable id: Long) = customerRepository.deleteById(id)


}
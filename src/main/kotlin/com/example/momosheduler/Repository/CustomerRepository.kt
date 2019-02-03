package com.example.momosheduler.Repository

import com.example.momosheduler.Models.*
import org.springframework.context.annotation.Bean
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Long> {}




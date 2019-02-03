package com.example.momosheduler.Controlers

import com.example.momosheduler.Models.ActionMode
import com.example.momosheduler.Models.Operation
import com.example.momosheduler.Repository.OperationRepository
import org.springframework.web.bind.annotation.*

@RestController
class OperationControler(var operationRepository: OperationRepository){


    @GetMapping("/operations")
    fun all(): ArrayList<Operation> = operationRepository.findAll() as ArrayList<Operation>


    @PostMapping("/operations")
    fun postOneActionMode(@RequestBody operation: Operation) = operationRepository.save(operation)


    @DeleteMapping("/operations/{id}")
    fun deleteOneActionMode(@PathVariable id: Long) = operationRepository.deleteById(id)

}
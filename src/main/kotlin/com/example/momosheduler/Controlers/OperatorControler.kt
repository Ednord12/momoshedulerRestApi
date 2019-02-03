package com.example.momosheduler.Controlers

import com.example.momosheduler.Models.Operator
import com.example.momosheduler.Repository.OperatorRepository
import org.springframework.web.bind.annotation.*

@RestController
class OperatorControler(var operatorRepository: OperatorRepository) {

    @GetMapping("/operators")
    fun all(): ArrayList<Operator> = operatorRepository.findAll() as ArrayList<Operator>


    @PostMapping("/operators/")
    fun postOneOperator(@RequestBody operator: Operator): Operator = operatorRepository.save(operator)

    @PutMapping("/operators/{id}")
    fun replaceOneOperator(@PathVariable id: Long, @RequestBody operator: Operator) {

        operatorRepository.findById(id).map { it ->
            {
                it.operator = operator.operator
                operatorRepository.save(it)
            }
        }.orElseGet {
            {
                operator.Id = id.toInt()
                operatorRepository.save(operator)


            }
        }

    }





}
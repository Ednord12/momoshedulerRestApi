package com.example.momosheduler.Repository

import com.example.momosheduler.Models.*
import org.springframework.context.annotation.Bean
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import java.time.Instant
import java.time.LocalDate
import java.util.*

interface OperationRepository : CrudRepository<Operation, Long> {

    fun findByOperatorAndDatetime(operator:String, datetime:LocalDate= LocalDate.now()): ArrayList<Operation>

    @Query("select op from Operation op where  op.operator= ?1 and op.datetime  between ?2 and ?3")
    fun findByDatetimeBetween(operator: String, startDate:LocalDate , endDate:LocalDate):ArrayList<Operation>
}

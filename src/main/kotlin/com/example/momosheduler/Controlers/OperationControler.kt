package com.example.momosheduler.Controlers

import com.example.momosheduler.Models.ActionMode
import com.example.momosheduler.Models.Operation
import com.example.momosheduler.Repository.OperationRepository
import com.example.momosheduler.ServiceLayer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.time.Instant
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@RestController
class OperationControler(var operationRepository: OperationRepository){


    @Autowired
    lateinit var serviceLayer: ServiceLayer

    @GetMapping("/operation")
    fun all()=serviceLayer.get()


    @GetMapping("/gettodayoperationsbyoperator/{operator}")
    fun getallopertionsbyOperatorAndDate(@PathVariable operator:String): ArrayList<Operation> =
            serviceLayer.getTodayOperationByOperator(operator)


    @GetMapping("/getoperationsbyoperatorandbetweendatetime/{operator}/{startdate}/{enddate}")
    fun getallopertionsbyOperatorAndDate(@PathVariable operator:String,@PathVariable startdate:String,
                                         @PathVariable enddate:String): ArrayList<Operation>{

        var startdate1:LocalDate= LocalDate.parse(startdate)
        var enddate1:LocalDate= LocalDate.parse(enddate)
        return serviceLayer.getOperationByOperatorAndBetween(operator,startdate1,enddate1)
    }



    @DeleteMapping("/deleteoperations/{id}")
    fun deleteOp(operationId: Long) = serviceLayer.deleteOperation(operationId)


    @PostMapping("/addoperations")
    fun deleteOneActionMode(@RequestBody operation: Operation) = serviceLayer.addOperation(operation)

}
package com.example.momosheduler

import com.example.momosheduler.Models.Operation
import com.example.momosheduler.Models.UserCompte
import com.example.momosheduler.Repository.OperationRepository
import com.example.momosheduler.Repository.OperatorRepository

import com.example.momosheduler.Repository.UserCompteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import java.time.Instant
import java.time.LocalDate

@Service
class ServiceLayer {

    @Autowired
    lateinit var userCompteRepository: UserCompteRepository

    @Autowired
    lateinit var operationRepository: OperationRepository


    // *********************userComptes****************************/

    fun getAllUserComptes():ArrayList<UserCompte> = userCompteRepository.findAll() as ArrayList<UserCompte>


    fun login( phone: String,  password: String): ArrayList<UserCompte> =
            userCompteRepository.findByPhoneAndPassword(phone, password)


    fun createCompte(compte: UserCompte): UserCompte=userCompteRepository.save(compte)




    fun delete(id: Long)=userCompteRepository.deleteById(id)




    // *********************operations****************************/

    fun getTodayOperationByOperator(operator:String): ArrayList<Operation> =
            operationRepository.findByOperatorAndDatetime(operator)


    fun getOperationByOperatorAndBetween(operator:String, dayStart:LocalDate, dayEnd:LocalDate):ArrayList<Operation> =
            operationRepository.findByDatetimeBetween(operator,dayStart,dayEnd)

    fun addOperation(operation: Operation):Operation=operationRepository.save(operation)


    fun deleteOperation(operationId:Long)=operationRepository.deleteById(operationId)

    fun get(): MutableIterable<Operation> {
        //operationRepository.save(Operation(0,"GNADOU EUDE","66008941","MTN","DEPOT","AVAHOUNDJE","10000",
          //²"1213fgbfb","4513541"))

        return operationRepository.findAll()
    }


}
package com.example.momosheduler.Models

import java.time.Instant
import javax.annotation.Generated
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id






/***************************************************/

@Entity
data class UserCompte(
        @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
        var Id: Int,
        var userId: String = "",
        var password: String = "",
        var login: String = "",
        var role: String = "",
        var connected: Boolean = false,
        var activate: Boolean = false
){

}


/***************************************************/
@Entity
data class Operator(
        @Id  @GeneratedValue(strategy =  GenerationType.IDENTITY) var Id: Int,
        var operator: String = ""
) {}




/***************************************************/
@Entity
data class Customer(
        @Id
        @GeneratedValue(strategy =  GenerationType.IDENTITY)
        var Id: Int,
        var name: String = "",
        var phone: String = ""

) {}



/***************************************************/
@Entity
data class ActionMode(
        @Id
        @GeneratedValue(strategy =  GenerationType.IDENTITY)
        var Id: Int ,
        var mode: String = ""
) {}



//************************************
@Entity
data  class Users(
        @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
        var Id: Int,
        var name: String = "",
        var surname: String = "",
        var email: String = "",
        var phone: String = ""
){}




/***************************************************/
@Entity
data class Operation(
        @Id
        @GeneratedValue(strategy =  GenerationType.IDENTITY)
        var Id: Int ,
        var operatorId: String = "",
        var actionModeId: String = "",
        var customerId: String = "",
        var solde: String = "",
        var referencecode: String = "",
        var datetime: Instant =Instant.now() ,
        var operationClosed: Boolean = false
) {}

package com.example.momosheduler.Models

import java.time.Instant
import javax.annotation.Generated
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
data  class Users(
        @Id
        @Generated
        var Id: Int = 0,
        var name: String = "",
        var surname: String = "",
        var email: String = "",
        var phone: String = ""
)



/***************************************************/

@Entity
data class UserCompte(
        @Id @GeneratedValue var Id: Int,
        var userId: String = "",
        var password: String = "",
        var login: String = "",
        var role: String = "",
        var connected: Boolean = false,
        var activate: Boolean = false
)


/***************************************************/
@Entity
data class Operator(
        @Id  @GeneratedValue var Id: Int = 0,
        var operator: String = ""
) {}




/***************************************************/
@Entity
data class Customer(
        @Id
        @GeneratedValue
        var Id: Int = 0,
        var name: String = "",
        var phone: String = ""

) {}



/***************************************************/
@Entity
data class ActionMode(
        @Id
        @GeneratedValue
        var Id: Int = 0,
        var mode: String = ""
) {}




/***************************************************/
@Entity
data class Operation(
        @Id
        @GeneratedValue
        var Id: Int = 0,
        var operatorId: String = "",
        var actionModeId: String = "",
        var customerId: String = "",
        var solde: String = "",
        var referencecode: String = "",
        var datetime: Instant =Instant.now() ,
        var operationClosed: Boolean = false
) {}

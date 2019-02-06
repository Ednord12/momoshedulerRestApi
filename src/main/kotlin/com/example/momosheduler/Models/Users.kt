package com.example.momosheduler.Models

import com.fasterxml.jackson.annotation.JsonCreator
import java.time.Instant
import java.time.LocalDate
import java.util.*
import javax.annotation.Generated
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


/***************************************************/

@Entity
class UserCompte (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var Id: Int = 0, var password: String = "",
         var role: String = "",
        var connected: Boolean = false, var activate: Boolean = false,
        var name: String = "", var surname: String = "", var email: String = "",
        var phone: String = "") {


}

/***************************************************/
@Entity
class Operator(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var Id: Int,
        var operator: String = ""
) {}


/***************************************************/
@Entity
class Customer(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var Id: Int,
        var name: String = "",
        var phone: String = ""

) {}


/***************************************************/
@Entity
class ActionMode(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var Id: Int,
        var mode: String = ""
) {}


/***************************************************/
@Entity
class Operation(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var Id: Long=0,
        var operator: String = "",
        var actionMode: String = "",
        var customer: String = "",
        var solde: String = "",
        var customerIDcard: String = "",
        var referencecode: String = "",
        var datetime: LocalDate = LocalDate.now()

) {}

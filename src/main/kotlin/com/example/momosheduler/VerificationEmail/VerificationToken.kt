package com.example.momosheduler.VerificationEmail

import com.example.momosheduler.Models.UserCompte
import com.sun.jmx.snmp.Timestamp
import java.time.LocalDateTime
import java.time.LocalTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
class VerificationToken {

    val EXPIRATION: Long = 60 * 24;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long=0
    var token: String=""

    // @OneToOne(targetEntity = User.class, fetch = FetchType . EAGER)
    // @JoinColumn(nullable = false, name = "user_id")
    lateinit var user: UserCompte;

    lateinit var expiryDate:Date;

   fun alculateExpiryDate( expiryTimeInMinutes:Int):LocalTime
    {
        var cal = LocalTime.now()

        return  cal.plusMinutes(EXPIRATION)
    }


}

// standard constructors, getters and setters

package com.offer.searchingPhrase.entity

import org.joda.time.DateTime
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
internal class Phrase(

    @Id
    private val id: String = UUID.randomUUID().toString(),

    private val searchingPhrase: String,

    val latestSearchingData: DateTime

) {
    constructor() : this("", "", DateTime.now())

    fun phrase(): String = searchingPhrase
}

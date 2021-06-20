package com.offer.integrations.common.data

import org.joda.time.DateTime

//TODO: properties
data class ExternalItem(
    private val name: String,
    private val link: String,
    private val addedDate: DateTime
)

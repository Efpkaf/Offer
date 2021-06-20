package com.offer.integrations.common.pipe

import org.joda.time.DateTime

//TODO: is that all?
data class SearchingItemProperties(
    val searchingPhase: String,
    val lastSearchingDate: DateTime
)


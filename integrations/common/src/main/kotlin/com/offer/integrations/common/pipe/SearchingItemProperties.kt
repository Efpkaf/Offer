package com.offer.integrations.common.pipe

import org.joda.time.DateTime

data class SearchingItemProperties(
    val searchingPhase: String,
    val lastSearchingDate: DateTime
) {
}

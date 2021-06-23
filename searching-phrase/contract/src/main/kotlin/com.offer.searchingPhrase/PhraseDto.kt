package com.offer.searchingPhrase

import org.joda.time.DateTime

data class PhraseDto(val searchingPhase: String, val lastSearchingDate: DateTime) {
    init {
        if(searchingPhase.trim() == "") {
            throw IllegalArgumentException("Searching phrase given by user can not be empty!")
        }
        if(lastSearchingDate.isAfterNow) {
            throw IllegalArgumentException("Last searching date is after now.")
        }
    }
}
data class PhrasesDto(val phrases: List<PhraseDto>)

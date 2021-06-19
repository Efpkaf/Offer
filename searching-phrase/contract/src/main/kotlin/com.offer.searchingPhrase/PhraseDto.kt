package com.offer.searchingPhrase

import org.joda.time.DateTime

data class PhraseDto(val searchingPhase: String, val lastSearchingDate: DateTime)
data class PhrasesDto(val phrases: List<PhraseDto>)

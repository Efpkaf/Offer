package com.offer.searchingPhrase.repository

import com.offer.searchingPhrase.entity.Phrase
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
internal interface PhraseRepository: CrudRepository<Phrase, String> {}

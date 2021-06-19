package com.offer.searchingPhrase.provider

import com.offer.searchingPhrase.PhraseDto
import com.offer.searchingPhrase.PhrasesDto
import com.offer.searchingPhrase.repository.PhraseRepository
import org.springframework.stereotype.Component

@Component
internal data class PhraseRepositoryProvider(
    private val phraseRepository: PhraseRepository
): PhraseProvider {

    override fun process(value: Any?): PhrasesDto {
        return PhrasesDto(phraseRepository.findAll().map { PhraseDto(it.phrase(), it.latestSearchingData) })
    }

}




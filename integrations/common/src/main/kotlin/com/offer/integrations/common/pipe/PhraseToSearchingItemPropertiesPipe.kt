package com.offer.integrations.common.pipe

import com.offer.searchingPhrase.PhrasesDto
import com.offer.step.step.Pipe

data class PhraseToSearchingItemPropertiesPipe(
    val phrases: PhrasesDto
): Pipe<List<SearchingItemProperties>> {

    override fun process(): List<SearchingItemProperties> {
        return phrases.phrases.map { SearchingItemProperties(it.searchingPhase, it.lastSearchingDate) }
    }
}

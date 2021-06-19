package com.offer.integrations.common.pipe

import com.offer.searchingPhrase.PhraseDto
import com.offer.step.step.Pipe

class PhraseToSearchingItemPropertiesPipe: Pipe<PhraseDto, SearchingItemProperties> {

    override fun process(value: PhraseDto): SearchingItemProperties {
        return SearchingItemProperties(value.searchingPhase, value.lastSearchingDate)
    }
}

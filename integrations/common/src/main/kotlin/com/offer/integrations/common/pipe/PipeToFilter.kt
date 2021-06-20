package com.offer.integrations.common.pipe

import com.offer.searchingPhrase.PhrasesDto
import com.offer.step.step.Pipe

fun PhrasesDto.toPipe(): List<SearchingItemProperties> {
    return PhraseToSearchingItemPropertiesPipe(this).process()
}


package com.offer.integrations.common.pipe

import com.offer.searchingPhrase.PhrasesDto

fun PhrasesDto.toSearchingItemPropertiesPipe(): List<SearchingItemProperties> {
    return PhraseToSearchingItemPropertiesPipe(this).process()
}


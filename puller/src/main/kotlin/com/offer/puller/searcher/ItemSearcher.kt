package com.offer.puller.searcher

import com.offer.integrations.common.data.ExternalItems
import org.springframework.stereotype.Component
import com.offer.integrations.common.pipe.PhraseToSearchingItemPropertiesPipe
import com.offer.integrations.common.pipe.SearchingItemProperties
import com.offer.searchingPhrase.provider.PhraseProvider
import com.offer.step.step.Filter

@Component
internal data class ItemSearcher(
    val phraseProvider: PhraseProvider,
    val externalItemsProviders: List<Filter<SearchingItemProperties, ExternalItems>>
) {

    //@Scheduled("********")
    fun run() {
        phraseProvider.process(null)
            .phrases.map { PhraseToSearchingItemPropertiesPipe().process(it) }
            .map { props ->
                externalItemsProviders.map { it.process(props) }
            }
    }
}

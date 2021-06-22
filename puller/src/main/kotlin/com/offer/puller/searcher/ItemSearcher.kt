package com.offer.puller.searcher

import com.offer.integrations.common.data.ExternalItems
import org.springframework.stereotype.Component
import com.offer.integrations.common.pipe.SearchingItemProperties
import com.offer.integrations.common.pipe.toSearchingItemPropertiesPipe
import com.offer.integrations.common.provider.processFilter
import com.offer.searchingPhrase.provider.PhraseProvider
import com.offer.step.step.Filter
import com.offer.publisher.contract.pipe.toPublisherMessagePipe

@Component
internal data class ItemSearcher(
    val phraseProvider: PhraseProvider,
    val externalItemsProviders: List<Filter<SearchingItemProperties, ExternalItems>>
) {

    //@Scheduled("********")
    fun run() {
        phraseProvider.process(null)
            .toSearchingItemPropertiesPipe()
            .processFilter(externalItemsProviders)
            .toPublisherMessagePipe()//TODO: it doesn't see gradle changes. why?
    }
}

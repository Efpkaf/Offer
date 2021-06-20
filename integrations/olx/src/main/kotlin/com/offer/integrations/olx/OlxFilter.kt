package com.offer.integrations.olx

import com.offer.integrations.common.provider.ExternalItemsProvider
import com.offer.integrations.common.data.ExternalItems
import org.springframework.stereotype.Component
import com.offer.integrations.common.pipe.SearchingItemProperties

@Component
internal data class OlxFilter(
    private val client: OlxClient
): ExternalItemsProvider {

    override fun process(value: SearchingItemProperties): ExternalItems {
        return ExternalItems(emptyList())
    }
}



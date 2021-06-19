package com.offer.integrations.otomoto.filter

import com.offer.integrations.common.client.ExternalItemsProvider
import com.offer.integrations.common.data.ExternalItems
import org.springframework.stereotype.Component
import com.offer.integrations.common.pipe.SearchingItemProperties
import com.offer.integrations.otomoto.client.OtomotoClient

@Component
internal data class OtomotoFilter(
    private val client: OtomotoClient
): ExternalItemsProvider {

    override fun process(value: SearchingItemProperties): ExternalItems {
        return ExternalItems(emptyList())
    }
}

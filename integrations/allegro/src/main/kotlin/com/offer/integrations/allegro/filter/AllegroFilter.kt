package com.offer.integrations.allegro.filter

import com.offer.integrations.allegro.client.AllegroClient
import com.offer.integrations.common.client.ExternalItemsProvider
import com.offer.integrations.common.data.ExternalItems
import org.springframework.stereotype.Component
import com.offer.integrations.common.pipe.SearchingItemProperties

@Component
internal data class AllegroFilter(
    private val client: AllegroClient
): ExternalItemsProvider {

    override fun process(value: SearchingItemProperties): ExternalItems {
        return ExternalItems(emptyList())
    }
}

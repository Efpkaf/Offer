package com.offer.integrations.common.provider

import com.offer.integrations.common.data.ExternalItems
import com.offer.integrations.common.pipe.SearchingItemProperties
import com.offer.step.step.Filter

interface ExternalItemsProvider : Filter<SearchingItemProperties, ExternalItems>

fun List<SearchingItemProperties>.processFilter(externalItemsProviders: List<Filter<SearchingItemProperties, ExternalItems>>): ExternalItems {

    return ExternalItems(externalItemsProviders.flatMap { itemProvider ->
        this.flatMap { properties ->
            itemProvider.process(properties).items
        }
    })
}

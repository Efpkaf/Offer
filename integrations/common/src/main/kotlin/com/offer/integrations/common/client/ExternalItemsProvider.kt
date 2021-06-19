package com.offer.integrations.common.client

import com.offer.integrations.common.data.ExternalItems
import com.offer.integrations.common.pipe.SearchingItemProperties
import com.offer.step.step.Filter

interface ExternalItemsProvider : Filter<SearchingItemProperties, ExternalItems> {
}

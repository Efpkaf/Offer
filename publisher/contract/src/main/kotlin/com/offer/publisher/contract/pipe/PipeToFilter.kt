package com.offer.publisher.contract.pipe

import com.offer.integrations.common.data.ExternalItems
import com.offer.publisher.contract.data.Message

fun ExternalItems.toPublisherMessagePipe(): Message {
    return ExternalItemsToPublisherMessagePipe(this).process()
}

package com.offer.publisher.contract.pipe

import com.offer.integrations.common.data.ExternalItems
import com.offer.publisher.contract.data.Message
import com.offer.step.step.Pipe

data class ExternalItemsToPublisherMessagePipe(
    val externalItems: ExternalItems
): Pipe<Message> {
    override fun process(): Message {
        return Message()
    }
}

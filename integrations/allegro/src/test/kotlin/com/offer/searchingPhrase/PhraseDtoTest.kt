package com.offer.searchingPhrase

import org.joda.time.DateTime
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource


internal class PhraseDtoTest {


    @ParameterizedTest
    @ValueSource(strings = ["", " ", "  "])
    fun `should throw error for invalid searching phrase`(searchingPhrase: String) {
        Assertions.assertThrows(IllegalArgumentException::class.java) { PhraseDto(searchingPhrase, DateTime.now() - 100) }
    }
}

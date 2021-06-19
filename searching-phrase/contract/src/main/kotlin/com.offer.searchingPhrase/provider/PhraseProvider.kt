package com.offer.searchingPhrase.provider

import com.offer.searchingPhrase.PhrasesDto
import com.offer.step.step.Filter

interface PhraseProvider : Filter<Any?, PhrasesDto>

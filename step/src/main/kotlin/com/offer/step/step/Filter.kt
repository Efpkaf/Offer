package com.offer.step.step

interface Filter<T, D> {
    fun process(value: T): D
}

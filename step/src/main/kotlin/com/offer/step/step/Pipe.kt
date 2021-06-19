package com.offer.step.step

interface Pipe<T,D> {
    fun process(value: T): D
}

package org.example

data class ClosedRange(val lowerEndpoint: Int, val upperEndpoint: Int) {
    init {
        require(lowerEndpoint <= upperEndpoint)
    }

    override fun toString(): String {
        return "[${lowerEndpoint},${upperEndpoint}]"
    }
}
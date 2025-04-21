package org.example

data class ClosedRange(val lowerEndpoint: Int, val upperEndpoint: Int) {
    override fun toString(): String {
        return "[${lowerEndpoint},${upperEndpoint}]"
    }
}
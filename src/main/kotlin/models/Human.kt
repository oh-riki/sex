package org.sex.models

open class Human(
    val name: String,
) {
    fun readySex() {
        takeOffClothes()
    }

    private fun takeOffClothes() {
        println("${name}が服を脱ぎます")
    }
}
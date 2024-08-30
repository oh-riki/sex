package org.sex.models

class Men(
    name: String,
    val chinkoLength: Double,
) : Human(name) {
    fun bokki() {
        println("${chinkoLength}cmのちんこが${chinkoLength + 5}cmになりました。")
    }

    fun piston() {
        println("${name}: ずっこんばっこん")
    }
}
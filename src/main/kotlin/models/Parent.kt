package org.sex.models

class Parent(
    private val father: Men,
    private val mother: Woman
) {
    private fun ready() {
        mother.readySex()
        father.readySex()
        father.bokki()
    }

    fun makeLove() {
        ready()

        repeat(10) {
            father.piston()
            mother.aegu()
        }
    }
}
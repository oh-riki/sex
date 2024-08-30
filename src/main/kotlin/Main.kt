package org.sex

import org.sex.models.Men
import org.sex.models.Woman
import org.sex.utils.marriage

fun main() {
    val papa = Men(
        name = "りき",
        chinkoLength = 8.2
    )
    val mama = Woman(
        name = "りせ",
    )

    val parent = marriage(papa = papa, mama = mama)

    parent.makeLove()
}


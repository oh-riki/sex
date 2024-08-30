package org.sex.utils

import org.sex.models.Men
import org.sex.models.Parent
import org.sex.models.Woman

fun marriage(papa: Men, mama: Woman): Parent = Parent(
    father = papa,
    mother = mama
)
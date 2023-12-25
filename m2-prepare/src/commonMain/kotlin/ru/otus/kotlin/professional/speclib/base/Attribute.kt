package ru.otus.kotlin.professional.speclib.base

import ru.otus.kotlin.professional.speclib.utils.UUID

data class Attribute(val id: UUID, val name: String, val type: AttrType, val isList: Boolean)
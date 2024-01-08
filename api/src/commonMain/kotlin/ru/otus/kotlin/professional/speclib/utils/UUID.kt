package ru.otus.kotlin.professional.speclib.utils

data class UUID(val value: String)

expect fun generateUUID(): UUID
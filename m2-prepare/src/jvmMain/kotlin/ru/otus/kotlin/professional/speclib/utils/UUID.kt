package ru.otus.kotlin.professional.speclib.utils

actual fun generateUUID(): UUID {
    return UUID(java.util.UUID.randomUUID().toString())
}
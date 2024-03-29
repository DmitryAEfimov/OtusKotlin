package ru.otus.kotlin.professional.speclib.utils

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldHaveSize

class UUIDTestCommon : FunSpec() {
    init {
        test("uuids should be somewhat unique!") {
            List(100) { generateUUID() }.toSet().shouldHaveSize(100)
        }
    }
}
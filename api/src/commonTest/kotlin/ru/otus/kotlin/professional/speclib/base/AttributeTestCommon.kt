package ru.otus.kotlin.professional.speclib.base

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldNotBeEmpty

class AttributeTestCommon : FunSpec() {
    init {
        test("all attribute fields must be initialized") {
            val integerSimpleAttribute = buildAttribute {
                descriptor {
                    name = "simpleIntegerAttribute"
                    type = AttrType.INTEGER
                }
            }

            integerSimpleAttribute.id.toString().shouldNotBeEmpty()
            integerSimpleAttribute.name shouldBe "simpleIntegerAttribute"
            integerSimpleAttribute.type shouldBe AttrType.INTEGER
            integerSimpleAttribute.isList shouldBe false
        }
    }
}
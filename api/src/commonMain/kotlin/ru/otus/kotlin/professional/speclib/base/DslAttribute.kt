package ru.otus.kotlin.professional.speclib.base

import ru.otus.kotlin.professional.speclib.utils.generateUUID

class DescriptorContext {
    var name: String = ""
    var type: AttrType = AttrType.UNDEFINED
    var list: Boolean = false
}
class AttributeBuilder {
    private var name = ""
    private var type = AttrType.UNDEFINED
    private var isList = false

    fun descriptor(block: DescriptorContext.() -> Unit) {
        val context = DescriptorContext().apply(block)

        name = context.name
        type = context.type
        isList = context.list
    }

    fun build() = Attribute(generateUUID(), name, type, isList)
}

fun buildAttribute(block: AttributeBuilder.() -> Unit) = AttributeBuilder().apply(block).build()
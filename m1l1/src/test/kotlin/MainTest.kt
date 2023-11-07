package ru.otus.kotlin.professional.m1l1

import com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut
import main
import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {
    @Test
    fun `when output should write args to console separated by comma`() {
        val output = tapSystemOut {
            main(arrayOf("a", "b", "c"))
        }

        assertEquals("Hello World!\nProgram arguments: a, b, c", output.trim())
    }
}

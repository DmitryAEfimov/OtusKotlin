import com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut
import org.junit.Assert.assertEquals
import org.junit.Test

class ApplicationTest {
    @Test
    fun `main method should return a proper output`() {
        val output = tapSystemOut {
            main(emptyArray())
        }

        assertEquals(
            "Hello World!\nProgram arguments:",
            output.trim()
        )
    }
}
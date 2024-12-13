import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Tag
import kotlin.test.Test


class MainLab3KtTest {
    @Test
    @Tag("var2")
    fun var2z2test() {
        assertFalse(var2z2(1.0, 1.0))
        assertFalse(var2z2(-1.0,-1.0))
        assertFalse(var2z2(-0.5,-0.5))
        assertFalse(var2z2(0.0,-0.5))
        assertFalse(var2z2(-2.5, 1.5))
        assertFalse(var2z2(2.5, -2.5))
        assertFalse(var2z2(0.0, -3.5))
        assertFalse(var2z2(1.9, 0.0))
        assertFalse(var2z2(-3.5, 0.0))

        assertTrue(var2z2(2.0, -2.0))
        assertTrue(var2z2(-1.0, 1.0))
        assertTrue(var2z2(0.0,0.0))
        assertTrue(var2z2(0.0,0.5))
        assertTrue(var2z2(-0.5,0.0))
        assertTrue(var2z2(2.12,-2.12))
    }

    @Test
    @Tag("var2")
    fun var2z3test() {
        assertEquals(1.0, var2z3(-1.0))
        assertEquals(0.5, var2z3(0.5))
        assertEquals(1.0, var2z3(1.5))
        // assertEquals(0.1, var2z3(2.4))
        assertEquals(0.2, var2z3(2.4), 0.001)
    }
}
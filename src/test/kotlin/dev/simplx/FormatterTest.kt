package dev.simplx

import kotlin.test.*

internal class FormatterTest {
    private fun String.printf(vararg args: Any?) = Formatter().format(this, args).toString()

    @Test
    fun int() {
        assertEquals("x=1", "x=%d".printf(1))
    }

    @Test
    fun long() {
        assertEquals("x=1", "x=%d".printf(1L))
    }

    @Test
    fun string() {
        assertEquals("x=hello", "x=%s".printf("hello"))
    }

    @Test
    fun position() {
        assertEquals("hello John! nine=9 six=6",
            "hello %3\$s! nine=%2\$d six=%1\$d".printf(6, 9,"John"))
    }

}
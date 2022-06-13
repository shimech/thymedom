package app.kiyomaro.thymedom

import kotlin.test.Test
import kotlin.test.assertEquals

class ThymeDOMTest {
    @Test
    fun testCreateElement() {
        val element = ThymeDOMElement("div", listOf())
        assertEquals(element, ThymeDOM.createElement("div", listOf()))
    }
}

package app.kiyomaro.thymedom

import kotlin.test.Test
import kotlin.test.assertEquals

class ThymeDOMTest {
    @Test
    fun testCreateElement() {
        val element = ThymeDOMElement("div")
        assertEquals(element, ThymeDOM.createElement("div"))
    }
}

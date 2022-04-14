package app.kiyomaro.thymedom

class ThymeDOM {
    companion object {
        fun createElement(type: String) = ThymeDOMElement(type)
    }
}

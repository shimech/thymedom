package app.kiyomaro.thymedom

import org.thymeleaf.model.IModel
import org.thymeleaf.model.IModelFactory

class ThymeDOM {
    companion object {
        fun createElement(tag: String, childlen: List<Any>) = ThymeDOMElement(tag, childlen)

        fun render(element: ThymeDOMElement, model: IModel, modelFactory: IModelFactory) = element.render(model, modelFactory)
    }
}

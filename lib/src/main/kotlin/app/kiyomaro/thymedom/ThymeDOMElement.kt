package app.kiyomaro.thymedom

import app.kiyomaro.thymedom.error.IllegalChildTypeException
import org.thymeleaf.model.IModel
import org.thymeleaf.model.IModelFactory
import org.unbescape.html.HtmlEscape

data class ThymeDOMElement(
    final val tag: String,
    final val children: List<Any>
) {
    fun render(model: IModel, modelFactory: IModelFactory) {
        model.add(modelFactory.createOpenElementTag(tag))
        children.forEach { child ->
            when (child) {
                is ThymeDOMElement -> child.render(model, modelFactory)
                is String -> model.add(modelFactory.createText(HtmlEscape.escapeHtml5(child)))
                else -> throw IllegalChildTypeException()
            }
        }
        model.add(modelFactory.createCloseElementTag(tag))
    }
}

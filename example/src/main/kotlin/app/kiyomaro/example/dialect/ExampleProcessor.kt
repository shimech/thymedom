package app.kiyomaro.example.dialect

import app.kiyomaro.thymedom.ThymeDOMElement
import org.thymeleaf.context.ITemplateContext
import org.thymeleaf.model.IProcessableElementTag
import org.thymeleaf.processor.element.AbstractElementTagProcessor
import org.thymeleaf.processor.element.IElementTagStructureHandler
import org.thymeleaf.templatemode.TemplateMode

class ExampleProcessor(dialectPrefix: String) : AbstractElementTagProcessor(
    TemplateMode.HTML, dialectPrefix, "example", true, null, false, 10000
) {
    final override fun doProcess(
        context: ITemplateContext,
        tag: IProcessableElementTag,
        structureHandler: IElementTagStructureHandler
    ) {
        val modelFactory = context.getModelFactory()
        val model = modelFactory.createModel()

        val element = ThymeDOMElement(
            "div",
            listOf(
                ThymeDOMElement(
                    "p",
                    listOf(
                        "Created by ThymeDOMElement"
                    )
                ),
                ThymeDOMElement(
                    "p",
                    listOf(
                        "Created by ThymeDOMElement"
                    )
                ),
            )
        )
        element.render(model, modelFactory)

        structureHandler.removeElement()
        structureHandler.replaceWith(model, false)
    }
}

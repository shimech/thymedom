package app.kiyomaro.example.dialect

import org.thymeleaf.dialect.AbstractProcessorDialect

class ThymeleafDialect : AbstractProcessorDialect("thymeleafDialect", "kiyomaro", 1000) {
    final override fun getProcessors(dialectPrefix: String) = hashSetOf(
        ExampleProcessor(dialectPrefix)
    )
}

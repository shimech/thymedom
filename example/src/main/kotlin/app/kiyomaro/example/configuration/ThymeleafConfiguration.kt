package app.kiyomaro.example.configuration

import app.kiyomaro.example.dialect.ThymeleafDialect
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ThymeleafConfiguration {
    @Bean
    fun thymeleafDialect() = ThymeleafDialect()
}

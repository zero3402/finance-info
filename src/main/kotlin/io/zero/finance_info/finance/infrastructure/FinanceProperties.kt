package io.zero.finance_info.finance.infrastructure

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(FinanceProperties::class)
@ConfigurationProperties(prefix = "finances")
data class FinanceProperties(
    val clients: Map<String, FinanceClientProperties> = emptyMap()
)

data class FinanceClientProperties(
    val url: String
)
package io.zero.finance_info.coin.infrastructure

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(ExchangeProperties::class)
@ConfigurationProperties(prefix = "exchanges")
data class ExchangeProperties(
    val clients: Map<String, ExchangeClientProperties> = emptyMap()
)

data class ExchangeClientProperties(
    val url: String
)
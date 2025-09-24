package io.zero.finance_info.coin.infrastructure

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class ExchangeWebClientConfig(private val exchangeProperties: ExchangeProperties) {

    @Bean
    fun exchangeWebClients(): Map<String, WebClient> {
        return exchangeProperties.clients.mapValues { (_, config) ->
            WebClient.builder()
                .baseUrl(config.url)
                .build()
        }
    }
}
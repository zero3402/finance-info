package io.zero.finance_info.finance.infrastructure

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class FinanceWebClientConfig(private val financeProperties: FinanceProperties) {

    @Bean
    fun financeWebClients(): Map<String, WebClient> {
        return financeProperties.clients.mapValues { (_, config) ->
            WebClient.builder()
                .baseUrl(config.url)
                .build()
        }
    }
}
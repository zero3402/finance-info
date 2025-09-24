package io.zero.finance_info.finance.client

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient

@Component
class FinanceClient(private val webClient: WebClient) {
}
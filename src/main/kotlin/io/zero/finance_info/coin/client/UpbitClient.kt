package io.zero.finance_info.coin.client

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient

@Component
class UpbitClient(private val webClient: WebClient) {
}
package io.zero.finance_info.coin.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/exchanges")
class ExchangeApi {

    @GetMapping("/{exchange}/tickers")
    fun getTickersByExchange(@PathVariable exchange: String): Unit {
    }
}
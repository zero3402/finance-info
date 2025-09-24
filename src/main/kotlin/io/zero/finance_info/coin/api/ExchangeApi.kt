package io.zero.finance_info.coin.api

import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/exchanges")
class ExchangeApi {

    @GetMapping("/{exchange}")
    fun getCoinsByExchange(@PathVariable exchange: String): Unit {
    }

    @GetMapping("/{exchange}/tickers/{ticker}")
    fun getCoinByExchange(@PathVariable exchange: String, @PathVariable ticker : String) : Unit {

    }

    @PostMapping("/comparison")
    fun getExchangeComparision(@RequestBody exchanges: String) : Unit {

    }
}
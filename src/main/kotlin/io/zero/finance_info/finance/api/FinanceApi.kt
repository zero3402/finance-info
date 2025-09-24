package io.zero.finance_info.finance.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/finances")
class FinanceApi {

    @GetMapping("/exchange-rate/{currency}")
    fun getExchangeRateByCurrency: Unit {

    }
}
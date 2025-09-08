package io.zero.finance_info.ad.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/ads")
class AdApi {
    @GetMapping
    fun getAds(): Unit {
    }
}
package com.cashrich.cashrich.controller;

import com.cashrich.cashrich.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cashrich/coins")
public class CoinController {

    @Autowired
    private CoinService coinService;

    @GetMapping("/fetch")
    public void fetchCoinData() {
        coinService.fetchCoinData();
    }
}

package com.cashrich.cashrich.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CoinServiceImpl implements CoinService {

    @Override
    public void fetchCoinData() {
        // Call the 3rd party API and store request response in DB along with timestamp
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/quotes/latest?symbol=BTC,ETH,LTC";
        String apiKey = "27ab17d1-215f-49e5-9ca4-afd48810c149";
        // Set headers and make API call
        // Handle response and store data in the database
    }
}

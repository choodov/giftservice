package com.chudov.giftservice.giftcard.client;

import com.chudov.giftservice.giftcard.entity.Balance;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "balance", url = "http://localhost:8090/balance/")
public interface BalanceClient {

    @GetMapping
    List<Balance> findAll();

    @GetMapping("/{id}")
    Balance findById(@PathVariable("id") String clientID);

    @PostMapping
    void save(@RequestBody Balance balance);
}

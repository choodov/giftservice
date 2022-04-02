package com.chudov.giftservice.giftcard.client;

import com.chudov.giftservice.giftcard.entity.Balance;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Component
@FeignClient("balance")
public interface BalanceClient {

    @GetMapping("/balance")
    List<Balance> findAll();

    @GetMapping("/balance/{id}")
    Balance findById(String clientID);

//    @PostMapping("/balance/{id}")
//    void updateById(String clientID, int futureBalance);
}

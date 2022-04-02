package com.chudov.giftservice.balance.controllers;

import com.chudov.giftservice.balance.dto.Balance;
import com.chudov.giftservice.balance.services.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/balance")
public class BalanceController {

    @Autowired
    private BalanceService service;

    @GetMapping
    public List<Balance> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Balance findById(@PathVariable("id") String clientID) {
        return service.findById(clientID);
    }

    @PostMapping()
    public void save(@RequestBody Balance balance) {
        service.save(balance);
    }
}

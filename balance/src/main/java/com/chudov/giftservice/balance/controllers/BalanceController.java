package com.chudov.giftservice.balance.controllers;

import com.chudov.giftservice.balance.dto.BalanceDTO;
import com.chudov.giftservice.balance.services.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/balance")
public class BalanceController {

    @Autowired
    private BalanceService service;

    @GetMapping
    public List<BalanceDTO> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public BalanceDTO findById(@PathVariable("id") String clientID) {
        return service.findById(clientID);
    }
}

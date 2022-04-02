package com.chudov.giftservice.balance.services;

import com.chudov.giftservice.balance.dto.Balance;

import java.util.List;

public interface BalanceService {

    Balance findById(String clientID);

    List<Balance> findAll();

    void save(Balance balance);
}

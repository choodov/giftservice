package com.chudov.giftservice.balance.services;

import com.chudov.giftservice.balance.dto.BalanceDTO;

import java.util.List;

public interface BalanceService {

    BalanceDTO findById(String clientID);

    List<BalanceDTO> findAll();
}

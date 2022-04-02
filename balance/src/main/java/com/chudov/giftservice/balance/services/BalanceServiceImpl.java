package com.chudov.giftservice.balance.services;

import com.chudov.giftservice.balance.dto.BalanceDTO;
import com.chudov.giftservice.balance.repo.BalanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class BalanceServiceImpl implements BalanceService {

    @Autowired
    private BalanceRepository repository;

    @PostConstruct
    private void init() {
        List<BalanceDTO> balances = new ArrayList<>();
        balances.add(new BalanceDTO("1", 100));
        balances.add(new BalanceDTO("2", 0));
        balances.add(new BalanceDTO("3", 90));
        repository.saveAll(balances);
    }

    @Override
    public BalanceDTO findById(String clientID) {
        return repository.findById(clientID).orElse(new BalanceDTO(clientID, 0));
    }

    @Override
    public List<BalanceDTO> findAll() {
        return Streamable.of(repository.findAll()).toList();
    }
}

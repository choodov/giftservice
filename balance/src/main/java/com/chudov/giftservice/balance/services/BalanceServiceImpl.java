package com.chudov.giftservice.balance.services;

import com.chudov.giftservice.balance.dto.Balance;
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
        List<Balance> balances = new ArrayList<>();
        balances.add(new Balance("1", 100));
        balances.add(new Balance("2", 0));
        balances.add(new Balance("3", 90));
        repository.saveAll(balances);
    }

    @Override
    public Balance findById(String clientID) {
        return repository.findById(clientID).orElse(new Balance(clientID, 0));
    }

    @Override
    public List<Balance> findAll() {
        return Streamable.of(repository.findAll()).toList();
    }

    @Override
    public void save(Balance newBalance) {
        repository.save(newBalance);
    }
}

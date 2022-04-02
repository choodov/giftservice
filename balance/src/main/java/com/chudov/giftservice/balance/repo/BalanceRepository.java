package com.chudov.giftservice.balance.repo;

import com.chudov.giftservice.balance.dto.Balance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceRepository extends CrudRepository<Balance, String> {

    Balance findByClientID(String clientID);
}

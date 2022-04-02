package com.chudov.giftservice.balance.repo;

import com.chudov.giftservice.balance.dto.BalanceDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceRepository extends CrudRepository<BalanceDTO, String> {

    BalanceDTO findByClientID(String clientID);
}

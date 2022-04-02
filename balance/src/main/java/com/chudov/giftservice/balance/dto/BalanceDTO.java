package com.chudov.giftservice.balance.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("balance")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BalanceDTO {

    @Id
    private String clientID;
    private Integer balance;
}

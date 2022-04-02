package com.chudov.giftservice.giftcard.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Balance {

    private String clientID;
    private Integer balance;
}

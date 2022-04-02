package com.chudov.giftservice.giftcard.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GiftCard {

    private int amount;
    private int quantity;
}

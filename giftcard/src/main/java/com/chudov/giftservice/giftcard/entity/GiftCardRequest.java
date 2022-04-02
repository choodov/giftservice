package com.chudov.giftservice.giftcard.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GiftCardRequest {

    @Id
    private String clientID;
    private List<GiftCard> giftCards;
}

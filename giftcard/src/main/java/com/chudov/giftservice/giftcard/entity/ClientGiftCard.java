package com.chudov.giftservice.giftcard.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientGiftCard {

    @Id
    private String clientID;
    private List<GiftCard> giftCards;
}

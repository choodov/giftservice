package com.chudov.giftservice.giftcard.repo;

import com.chudov.giftservice.giftcard.entity.ClientGiftCard;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GiftCardRepository extends MongoRepository<ClientGiftCard, String> {
}

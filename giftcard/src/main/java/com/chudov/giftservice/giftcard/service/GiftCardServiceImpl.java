package com.chudov.giftservice.giftcard.service;

import com.chudov.giftservice.giftcard.client.BalanceClient;
import com.chudov.giftservice.giftcard.entity.ClientGiftCard;
import com.chudov.giftservice.giftcard.entity.GiftCard;
import com.chudov.giftservice.giftcard.entity.GiftCardRequest;
import com.chudov.giftservice.giftcard.exception.InsufficientBalanceException;
import com.chudov.giftservice.giftcard.repo.GiftCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GiftCardServiceImpl implements GiftCardService {

    @Autowired
    private BalanceClient balanceClient;

    @Autowired
    private GiftCardRepository repository;

    @Override
    public void buyGifts(GiftCardRequest giftCardRequest) {
//        Integer currentBalance = balanceClient.findById(giftCardRequest.getClientID()).getBalance();
        int currentBalance = 100;
        int futureBalance = calculateFutureBalance(currentBalance, giftCardRequest.getGiftCards());

        if (futureBalance < 0) {
            throw new InsufficientBalanceException("Insufficient balance. Current balance: " + currentBalance);
        }

        updateGiftCards(giftCardRequest);
//         balanceClient.updateById(giftCardRequest.getClientID(), futureBalance);

    }

    private int calculateFutureBalance(int currentBalance, List<GiftCard> giftCards) {
        int giftCardsTotalAmount = giftCards.stream()
                .mapToInt(giftCard -> giftCard.getAmount() * giftCard.getQuantity()).sum();
        return currentBalance - giftCardsTotalAmount;
    }

    private void updateGiftCards(GiftCardRequest giftCardRequest) {
        Optional<ClientGiftCard> clientGiftCard = repository.findById(giftCardRequest.getClientID());

        clientGiftCard.ifPresentOrElse((card) -> {
                    card.getGiftCards().addAll(giftCardRequest.getGiftCards());
                    repository.save(card);
                },
                () -> {
                    ClientGiftCard newCard = new ClientGiftCard(giftCardRequest.getClientID(), giftCardRequest.getGiftCards());
                    repository.save(newCard);
                });
    }
}

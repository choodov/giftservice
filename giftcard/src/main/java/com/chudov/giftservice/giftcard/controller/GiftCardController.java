package com.chudov.giftservice.giftcard.controller;

import com.chudov.giftservice.giftcard.entity.GiftCardRequest;
import com.chudov.giftservice.giftcard.exception.InsufficientBalanceException;
import com.chudov.giftservice.giftcard.service.GiftCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guusto-service")
public class GiftCardController {

    @Autowired
    private GiftCardService service;

    @PostMapping("/buy-gift")
    public ResponseEntity buyGift(@RequestBody GiftCardRequest giftCardRequest) {
        try {
            service.buyGifts(giftCardRequest);
        } catch (InsufficientBalanceException e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
        return new ResponseEntity(HttpStatus.OK);
    }
}

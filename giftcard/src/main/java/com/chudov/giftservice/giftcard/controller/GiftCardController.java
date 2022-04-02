package com.chudov.giftservice.giftcard.controller;

import com.chudov.giftservice.giftcard.entity.GiftCardRequest;
import com.chudov.giftservice.giftcard.service.GiftCardService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void buyGift(@RequestBody GiftCardRequest giftCardRequest) {
        service.buyGifts(giftCardRequest);
    }
}

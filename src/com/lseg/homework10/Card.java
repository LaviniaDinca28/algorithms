package com.lseg.homework10;

import java.time.LocalDate;
import java.util.Date;

public class Card {

    private LocalDate expirationDate;
    private String ownerName;
    private int cardNumber;

    public Card(LocalDate expirationDate, String ownerName, int cardNumber) {
        this.expirationDate = expirationDate;
        this.ownerName = ownerName;
        this.cardNumber = cardNumber;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getCardNumber() {
        return cardNumber;
    }
}


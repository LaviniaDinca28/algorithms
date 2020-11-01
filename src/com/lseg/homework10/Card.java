package com.lseg.homework10;

import java.util.Date;

public class Card {

    private Date expirationDate;
    private String ownerName;
    private int cardNumber;

    public Card(Date expirationDate, String ownerName, int cardNumber) {
        this.expirationDate = expirationDate;
        this.ownerName = ownerName;
        this.cardNumber = cardNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getCardNumber() {
        return cardNumber;
    }
}


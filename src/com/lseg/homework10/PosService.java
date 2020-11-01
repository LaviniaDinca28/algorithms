package com.lseg.homework10;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class PosService {

    private BankAccount[] bankAccount = new BankAccount[1];

    public String pay(int amount, Card card) {
        for (int i = 0; i < bankAccount.length; i++) {
            int cardNumber = bankAccount[i].getAttachedCardNumbers()[0];
            if (card.getCardNumber() == cardNumber) {
                System.out.printf("The card exists");
                if (card.getExpirationDate().compareTo(LocalDate.now()) >= 0) {
                    System.out.printf("The card is not expired");
                    if (bankAccount[i].getBalance() >= amount) {
                        bankAccount[i].withdrawMoney(amount);
                        return "It withdrew the money" + amount;
                    } else {
                        return "There is not enough money";
                    }
                } else {
                    return "The card is expired";
                }
            } else {
                return "The card does not exist";
            }
        }
        return null;
    }

    public void addKnownBankAccount(BankAccount bankAccount) {
        this.bankAccount[0] = bankAccount;
    }

    public BankAccount[] getBankAccount() {
        return bankAccount;
    }

}

package com.lseg.homework10;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();

        BankAccount bankAccount1 = new BankAccount("RO12345678910");
        BankAccount bankAccount2 = new BankAccount("RO12345678911");
        BankAccount bankAccount3 = new BankAccount("RO12345678912");
        BankAccount bankAccount4 = new BankAccount("RO12345678913");

        Card card1 = new Card(LocalDate.of(2025, 10, 20), "Lavinia Dinca", 1234567);
        Card card2 = new Card(LocalDate.of(2026, 10, 20), "Bastien Vizz", 1234568);
        Card card3 = new Card(LocalDate.of(2027, 10, 20), "Camelia D", 1234577);
        Card card4 = new Card(LocalDate.of(2019, 10, 20), "James C", 12345647);

        bankAccount1.addMoney(253.5);
        bankAccount2.addMoney(25);
        bankAccount3.addMoney(0);
        bankAccount4.addMoney(558);

        user1.addCard(card1);
        user2.addCard(card2);
        user3.addCard(card3);
        user4.addCard(card4);

        bankAccount1.attachCard(card1.getCardNumber());
        bankAccount2.attachCard(card2.getCardNumber());
        bankAccount3.attachCard(card3.getCardNumber());
        bankAccount4.attachCard(card4.getCardNumber());

        user1.addBankAccount(bankAccount1);
        user2.addBankAccount(bankAccount2);
        user3.addBankAccount(bankAccount3);
        user4.addBankAccount(bankAccount4);

        PosService pos = new PosService();
        


    }
}

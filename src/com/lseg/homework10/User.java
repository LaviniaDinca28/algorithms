package com.lseg.homework10;

public class User {

    private Card[] cards = new Card[1]; //declare  = length of the array = 1 - instantiate (when is new)
    private BankAccount[] bankAccounts = new BankAccount[1];

    //Create functions:
    public void addCard(Card card) {
        cards[0] = card;
    }

    public void addBankAccount(BankAccount account) {
        bankAccounts[0] = account;
    }

    public User() { //default constructor and instance var will be as declared above (the length of the array = 1)
    }

    public User(int numberOfCards, int numberOfBankAccounts) { //overloading
        this.cards = new Card[numberOfCards];
        this.bankAccounts = new BankAccount[numberOfBankAccounts];
    }
    public Card[] getCards() {
        return cards;
    }

    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

}

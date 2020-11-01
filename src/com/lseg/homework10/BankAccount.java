package com.lseg.homework10;

public class BankAccount {

    private String iban;
    private double balance;
    private int[] attachedCardNumbers = new int[1];

    public BankAccount(String ibanParameter) {
        this.iban = ibanParameter;
    }

    public void addMoney(double amount) {
        this.balance += amount;
    }

    public void withdrawMoney(double amount) {
        this.balance = this.balance - amount;
    }

    public void attachCard(int cardNumber) {
        this.attachedCardNumbers[0] = cardNumber;
    }

    public String getIban() {
        return iban;
    }

    public double getBalance() {
        return balance;
    }

    public int[] getAttachedCardNumbers() {
        return attachedCardNumbers;
    }

}

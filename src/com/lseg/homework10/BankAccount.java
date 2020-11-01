package com.lseg.homework10;

public class BankAccount {

    private String iban;
    private double balance;
    private int[] attachedCardNumbers = new int[1];

    public BankAccount(String ibanParameter){
        this.iban = ibanParameter;
    }

    public void addMoney (double amount){
        this.balance += amount;
    }

}

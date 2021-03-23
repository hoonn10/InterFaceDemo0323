package com.androidapp.interfaceprograms;

public class BankAccount implements Measurable {
    private double balance; //obj.getBalance()
    private int accountNumber;
    private static int LastAssignedNumber = 1000; //BankAccount.LastAssignedNumber

    public BankAccount(double balance) {
        this.balance= balance;
        LastAssignedNumber++;
        accountNumber = LastAssignedNumber;
    }

    public double getMeasure() {
        return balance;
    }
}

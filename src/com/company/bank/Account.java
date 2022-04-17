package com.company.bank;

public class Account {
    // Write a class called Account, which models a bank account of a customer,
    // is designed as shown in the following class diagram. The methods
    // credit(amount) and debit(amount) add or subtract the given amount
    // to the balance. The method transferTo(anotherAccount, amount) transfers
    // the given amount from this Account to the given anotherAccount.

    private int accountId;
    private String accountName;
    private int balance = 0;

    public Account(int accountId, String accountName) {
        this.accountId = accountId;
        this.accountName = accountName;
    }
    public int credit(int amount) {
        balance += amount;
        return balance;
    }
    public int debit(int amount) {
        balance += amount;
        return balance;
    }
    public int getBalance() {
        return balance;
    }
    public int transferMoney(Account transferTo, int amount){
        transferTo.credit(amount);
        debit(amount);
        return amount;
    }
}

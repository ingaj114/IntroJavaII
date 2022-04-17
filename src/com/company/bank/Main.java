package com.company.bank;

public class Main {
    public static void main(String[] args) {
        Account joshua = new Account(2, "Joshua");
        Account gregory = new Account(4, "Gregory");

        joshua.credit(2000);
        joshua.debit(350);
        gregory.credit(1000);
        gregory.debit(200);

        joshua.transferMoney(gregory,500);

        System.out.println(joshua.getBalance());
        System.out.println(gregory.getBalance());
    }
}

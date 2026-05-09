package com.bank;

import com.bank.model.Account;

public class App {
    public static void main(String[] args) {
        System.out.println("Bank App");
        Account account = new Account(121, 100);
        System.out.println(account);
    }
}

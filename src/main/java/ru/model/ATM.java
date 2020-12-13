package ru.model;
import ru.model.ru.Account;
import ru.model.ru.Bank;
import ru.model.ru.User;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Bank theBank = new Bank("Sber");
        User aUser = theBank.addUser("Olesya","Grekova","1223");
        Account newAccount = new Account("Checking", aUser,theBank);
        aUser.addAccount(newAccount);
        theBank.addAccount(newAccount);
    }
}
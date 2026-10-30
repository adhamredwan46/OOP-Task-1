/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adham.oop_task_1;

import java.util.ArrayList;

/**
 *
 * @author LAPTOPS HOUSE
 */
public class Bank {
     private ArrayList<BankAccount> accounts = new ArrayList<>();

   public void CreateAccount(double balance, String holderName) {
   if(balance>=0.0){
       BankAccount account = new BankAccount(balance, holderName);
    accounts.add(account);
   }
}

    public void deleteAccount(int accountNo){
      BankAccount account=RetrieveAccount(accountNo);
      accounts.remove(account);
    }
    public BankAccount RetrieveAccount(int accountNo){
        for(BankAccount account:accounts){
        if(account.getAccountNo()==accountNo){
            return account;
        }
    }
        return null;
    }
public void DisplayInfo(int accountNo) {
    BankAccount account = RetrieveAccount(accountNo);

    if (account != null) {
        System.out.println("Account Number: " + account.getAccountNo());
        System.out.println("Holder Name: " + account.getHolderName());
        System.out.println("Balance: " + account.getBalance());
    } else {
        System.out.println("Account not found.");
    }
}

}

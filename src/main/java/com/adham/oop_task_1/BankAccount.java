/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adham.oop_task_1;

/**
 *
 * @author LAPTOPS HOUSE
 */
public class BankAccount {
  private int accountNo;
  private String holderName;
  private double balance;
  static int nextAccNo=1000;
    public int getAccountNo() {
        return accountNo;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }
    public BankAccount(double balance,String holderName){
       if (balance>=0.0){
            this.accountNo = nextAccNo++;
        this.holderName = holderName;
        this.balance = balance;
       }
       else
       System.out.println("Invalid balnance");
    }
    public void deposite(double amount){
        if(amount>0.0){
            balance+=amount;
            System.out.println("Your Transaction Is done");
        }
    }
        public void withdraw(double amount){
            if(balance>=amount&&amount>0.0){
            balance-=amount;
            System.out.println("Your Transaction Is done");
            }
        }
        public void checkBalance(){
                System.out.println("Your balace is : "+balance);
            }
      
public void Transfer(Bank bank, int receiverAccountNo, double amount) {
    BankAccount receiver = bank.RetrieveAccount(receiverAccountNo);

    if (receiver == null) {
        System.out.println("Receiver account not found.");
    } else if (receiver == this) {
        System.out.println("Cannot transfer to the same account.");
    } else if (amount <= 0.0) {
        System.out.println("Invalid transfer amount.");
    } else if (this.balance < amount) {
        System.out.println("Insufficient balance.");
    } else {
        this.balance -= amount;
        receiver.balance += amount;

        System.out.println("Transfer completed successfully.");
        System.out.println("Your current balance: " + this.balance);
    }
}
}


        
    

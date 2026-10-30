
package com.adham.oop_task_1;

/**
 *
 * @author LAPTOPS HOUSE
 */
public class OOP_Task_1 {

    public static void main(String[] args) {
    Bank bank = new Bank();

    bank.CreateAccount(1000, "Adham");
    bank.CreateAccount(500, "Ali");

    BankAccount sender = bank.RetrieveAccount(1000);

    sender.Transfer(bank, 1001, 200);

    bank.DisplayInfo(1000);
    bank.DisplayInfo(1001);
}
    }


package com.assignment3.thread2;

public class BankBalance {

    public double currentBalance;
    /*
    This method is to update after deposition
     */
    public double deposite(double amount){
        currentBalance=currentBalance+amount;
        return currentBalance;
    }
    /*
    This method is to update after withdraw
     */
    public double withdraw(double amount){
        currentBalance= currentBalance-amount;
        return currentBalance;
    }
}
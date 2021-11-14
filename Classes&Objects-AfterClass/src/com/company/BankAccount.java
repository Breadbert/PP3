package com.company;

public class BankAccount {
    private String owner;
    private int accountNumber;
    private double balance;
    private boolean isActive;
    private int pin;

    private boolean checkActivity(){
        if(isActive){
            return true;
        } else {
            return false;
        }
    }

    private void setPin(int pin){
        this.pin = pin;
    }

    private String displayBalance(){
        return owner + "'s balance is: " + balance;
    }


}

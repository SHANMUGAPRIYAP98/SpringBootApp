package com.srm.springio;

public class Bank {
    String bankName;
    public Bank()
    {
        System.out.println("Bank Constructor");
    }
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    
}

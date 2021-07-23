package com.srm.springio;

import java.util.Scanner;

public class Account {
    private Long accountNo;
    private String custName;
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    private String bankName;
    private double balance;
    private double wdraw;
    private double deposit;
    private Customer customer;
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double withdraw()
    {
        System.out.println("Enter the Amount to be Withdrawn : ");
        balance=balance-wdraw;
        return balance;
    }
    public double deposit()
    {
        System.out.println("Enter the Amount to be Deposited : ");
        balance=balance+deposit;
        return balance;
    }
    public double getBalance()
    {
        return balance;
    }
    
    public Long getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }
    public String getCustName() {
        return custName;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public double getWdraw() {
        return wdraw;
    }
    public void setWdraw(double wdraw) {
        this.wdraw = wdraw;
    }
    public double getDeposit() {
        return deposit;
    }
    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
    @Override
    public String toString() {
        return "Account [accountNo=" + accountNo + ", balance=" + balance + ", bankName=" + bankName + ", custName="
                + custName + "]";
    }
    
}

package com.srm.springio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
       Account acc= (Account) context.getBean("account");
       System.out.println("Balance : "+acc.getBalance());
       System.out.println("Balance after withdrawn : "+acc.withdraw());
       System.out.println("Balance after deposited : "+acc.deposit());
       System.out.println(acc);
       System.out.println("Customer Id : "+((Account) acc).getCustomer().getCustId());
       System.out.println();
       Bank bank1=(Bank) context.getBean("bank1");
       Bank bank2=(Bank) context.getBean("bank2");
       Bank bank3=(Bank) context.getBean("bank3");
    }
}

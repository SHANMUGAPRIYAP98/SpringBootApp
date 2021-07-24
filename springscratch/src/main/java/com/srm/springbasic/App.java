package com.srm.springbasic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.Lifecycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student sob1 = (Student) context.getBean("stud1");
        Student sob2 = (Student) context.getBean("stud2");

        AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
        Lifecycle lc=(Lifecycle) context1.getBean("lifecycle");
        context1.registerShutdownHook();

    }
}

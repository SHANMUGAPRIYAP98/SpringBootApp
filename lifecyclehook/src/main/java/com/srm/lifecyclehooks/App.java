package com.srm.lifecyclehooks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       AbstractApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
       LifeCycle lc= (LifeCycle) context.getBean("cycle");
       System.out.println(lc.getData());
       context.registerShutdownHook();

       System.out.println("====================Autowiring Type==========================");
       Student s=(Student) context.getBean("stud");
       s.studDetails1();
       Student s1=(Student) context.getBean("stud1");
       s1.studData();
       CollectionDI coll=(CollectionDI) context.getBean("collection");
       System.out.println("=======================Collection Injection=================================");
       System.out.println( " Subjects with List : "+coll.getSubjects());
       System.out.println( " Marks with Set : "+coll.getMarks());
       System.out.println(" Wonders with Map : "+coll.getWonders());
    }
}

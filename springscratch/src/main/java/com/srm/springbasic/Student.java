package com.srm.springbasic;

public class Student
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Student()
    {
        System.out.println("In Student Constructor");
    }

}
package com.srm.springbasic;

public class LifeCycle {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public void  init()
    {
        System.out.println("I am in start() method");
    }
    public void destroy(){
        System.out.println("I am kill() method");
    }
}

package com.srm.lifecyclehooks;

public class LifeCycle {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public void init()
    {
        System.out.println("I am in init() method");
    }
    public void destroy()
    {
        System.out.println("I am in destroy() method");
    }
    
}

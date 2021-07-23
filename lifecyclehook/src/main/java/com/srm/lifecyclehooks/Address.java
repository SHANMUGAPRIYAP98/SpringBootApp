package com.srm.lifecyclehooks;

public class Address {
    private String city;
    private String state;
    private int pincode;
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getPincode() {
        return pincode;
    }
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    public void displayAddress()
    {
        System.out.println("City : "+city);
        System.out.println("State : "+state);
        System.out.println("Zipcode  : "+pincode);
    }
}

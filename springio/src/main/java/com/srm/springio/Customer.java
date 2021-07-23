package com.srm.springio;

public class Customer {
    private Long custId;
    private String addr;
    public Customer(String email,String phone)
    {
        System.out.println("CUSTOMER Constructor : "+email+"\t"+phone);
    }
    public Long getCustId() {
        return custId;
    }
    public void setCustId(Long custId) {
        this.custId = custId;
    }
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    @Override
    public String toString() {
        return "Customer [addr=" + addr + ", custId=" + custId + "]";
    }
  
    
}

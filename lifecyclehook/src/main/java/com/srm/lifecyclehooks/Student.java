package com.srm.lifecyclehooks;

public class Student {
    private Course course;
    private Address addr;
    private String sid;
    private String sname;
    public Address getAddr() {
        return addr;
    }
    public void setAddr(Address addr) {
        this.addr = addr;
    }
    private String address;
    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    public String getSid() {
        return sid;
    }
    public void setSid(String sid) {
        this.sid = sid;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void studDetails1()
    {
        System.out.println("Student Id : "+sid);
        System.out.println("Student Name : "+sname);
        System.out.println("Address  : "+address);
        course.courseDetails();
        
    }
    public void studData()
    {
        System.out.println("Student Id : "+sid);
        System.out.println("Student Name : "+sname);
        System.out.println("Address  : "+address);
        addr.displayAddress();
    }
}

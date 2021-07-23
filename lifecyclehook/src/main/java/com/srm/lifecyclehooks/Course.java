package com.srm.lifecyclehooks;

public class Course {
    private String cid;
    private String cname;
    private String department;
    public String getCid() {
        return cid;
    }
    public void setCid(String cid) {
        this.cid = cid;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
   public void courseDetails()
   {
       System.out.println("Course Id : "+cid);
       System.out.println("Course Name : "+cname);
       System.out.println("Department  : "+department);
   }
    
    
}

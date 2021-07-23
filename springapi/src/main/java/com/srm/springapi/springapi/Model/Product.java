package com.srm.springapi.springapi.Model;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.stereotype.Component;

@Component
public class Product {
    private int id;
    private String prodname;
    private double price;
    private String brand;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date mfdate;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date exdate;
    public int getProdid() {
        return id;
    }
    public void setProdid(int id) {
        this.id = id;
    }
    public String getProdname() {
        return prodname;
    }
    public void setProdname(String prodname) {
        this.prodname = prodname;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public Date getMfdate() {
        return mfdate;
    }
    public void setMfdate(Date mfdate) {
        this.mfdate = mfdate;
    }
    public Date getExdate() {
        return exdate;
    }
    public void setExdate(Date exdate) {
        this.exdate = exdate;
    }
    @Override
    public String toString() {
        return "Product [brand=" + brand + ", exdate=" + exdate + ", mfdate=" + mfdate + ", price=" + price
                + ", prodid=" + id + ", prodname=" + prodname + "]";
    }

}

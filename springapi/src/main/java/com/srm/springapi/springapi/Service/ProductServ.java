package com.srm.springapi.springapi.Service;

import java.io.IOException;
import java.util.List;

import com.srm.springapi.springapi.Model.Product;

public interface ProductServ {
    public void postData(Product prod);
    public List<Product> getProductById(int prodid) throws IOException;
    public List<Product> getAll();
    public void updateProd(Product prod,int prodid);
}

package com.srm.springapi.springapi.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.srm.springapi.springapi.Model.Product;

import org.springframework.stereotype.Service;

@Service
public class ProductImpl implements ProductServ {

    List<Product> al=new ArrayList<>();
    @Override
    public void postData(Product prod) {
        al.add(prod);
    }

    @Override
    public List<Product> getProductById(int prodid)  {
      List<Product> prods =  al.stream().filter(prod-> prod.getProdid()==prodid).collect(Collectors.toList());
      return prods;
    }

    @Override
    public List<Product> getAll() {   
        return al;
    }
    
}

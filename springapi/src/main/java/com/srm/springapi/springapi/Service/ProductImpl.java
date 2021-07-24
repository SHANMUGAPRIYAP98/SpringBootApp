package com.srm.springapi.springapi.Service;

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

    @Override
    public void updateProd(Product prod,int prodid) {
     List<Product> p =  al.stream().filter(pro->pro.getProdid()== prodid).collect(Collectors.toList());
      System.out.println(p.toString());
      Product prods=p.get(0);
      prods.setBrand("nestle");
      prods.setProdname("coffee");
      prods.setPrice(200.00);
      al.add(prods);
    }
    
}

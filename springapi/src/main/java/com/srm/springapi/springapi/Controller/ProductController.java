package com.srm.springapi.springapi.Controller;

import java.util.ArrayList;
import java.util.List;
import com.srm.springapi.springapi.Model.Product;
import com.srm.springapi.springapi.Service.ProductImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    List<Product> l = new ArrayList<>();

    @Autowired
    private ProductImpl pro;

    @PostMapping(value = "/saveData", produces = MediaType.APPLICATION_JSON_VALUE)
    public void saveData(@RequestBody Product prod) {
        pro.postData(prod);
        System.out.println(prod.toString());
    }

    @GetMapping(value = "/fetchByProId/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Product>> fetchData(@PathVariable int id) {
        List<Product> p = pro.getProductById(id);

        System.out.println("Data for specified Id : " + id);
        System.out.println(p.toString());
        return new ResponseEntity<List<Product>>(pro.getProductById(id), HttpStatus.OK);

    }

    @GetMapping(value = "/fetchAllPro", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Product>> fetchAll() {
        l = pro.getAll();
        if (l.isEmpty()) {
            System.out.println("Empty Products");
        } else {
            System.out.println("===================List of Products===================");
            System.out.println(l);

        }
        return new ResponseEntity<List<Product>>(pro.getAll(), HttpStatus.OK);

    }

    @PutMapping(value = "/updatePro/{prodid}",produces = MediaType.APPLICATION_JSON_VALUE)
    public void updateData(Product product,@PathVariable int prodid)
    {
        pro.updateProd(product,prodid);
    }

}

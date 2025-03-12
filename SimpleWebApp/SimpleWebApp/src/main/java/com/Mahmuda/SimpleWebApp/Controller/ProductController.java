package com.Mahmuda.SimpleWebApp.Controller;


import com.Mahmuda.SimpleWebApp.Model.Product;
import com.Mahmuda.SimpleWebApp.Services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductServices services;

    //Get Method
    @GetMapping ("/products")
    public List<Product> getList() {
        return services.getProducts();
    }

    @GetMapping("/products/{pid}")
    public Product getProductById(@PathVariable int pid) {
        return services.getProductById(pid);
    }

    //Post Method
    @PostMapping("/products")
    public void addProduct(@RequestBody Product product) {
        services.addProduct(product);
    }

    //Put Method
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod) {
        services.updateProduct(prod);
    }


    //Delete Method
    @DeleteMapping("/products/{pid}")
    public void pathDelete(@PathVariable int pid) {
        services.pathDelete(pid);
    }
}

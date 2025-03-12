package com.Mahmuda.SimpleWebApp.Services;

import com.Mahmuda.SimpleWebApp.Model.Product;
import com.Mahmuda.SimpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServices {

    @Autowired
    ProductRepo repo;

    /*List<Product> products=new ArrayList<>(Arrays.asList(
                         new Product(101,"Camera",2556),
                         new Product(102,"Mobile",2200)));*/


    public List<Product> getProducts() {
        return repo.findAll();
    }

    //Get Method
    public Product getProductById(int id) {

        return repo.findById(id).get();
    }

    //Post Method
    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }


    public void pathDelete(int pid) {
        repo.deleteById(pid);
    }
}

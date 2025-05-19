package com.springbootrestapi.restapi.controller;

import com.springbootrestapi.restapi.entities.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrestapi.restapi.repository.ProductRepo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class ProductController {
    @Autowired
    ProductRepo repo;
     @GetMapping("/products/")
    public List<Product> getAllProducts(){
      
     return repo.findAll();
    }
    @GetMapping("/products/{id}")
    public Product geProductById(@PathVariable("id") int id){
        return repo.findById(id).get();
    }
    @PostMapping("/products/")
    public Product  createProduct(@RequestBody Product product) {
        //TODO: process POST request
        
        return repo.save(product) ;
    }
    @PutMapping("/products/")
    public Product updateProduct(@RequestBody Product product) {
        //TODO: process PUT request
        
        return repo.save(product);
    }
    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable("id") int id){

        repo.deleteById(id);
    }

}

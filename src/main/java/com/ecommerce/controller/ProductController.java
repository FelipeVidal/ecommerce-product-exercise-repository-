package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ecommerce.service.ProductService;
import com.ecommerce.model.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProductController {
    
    @Autowired
    ProductService productService;

    @GetMapping(value = "products", produces = MediaType.APPLICATION_JSON_VALUE) 
    public List<Product> getMethodName() {
        return productService.returnAllProducts();
    }

    @GetMapping(value = "product/{sku}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Product getMethodName(@PathVariable("sku") String sku) {
        return productService.returnProductBySku(sku);
    }
    

    @PostMapping(value = "product", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void postMethodName(@RequestBody Product product) {
        productService.addNewProduct(product);;
    }
    
    

}

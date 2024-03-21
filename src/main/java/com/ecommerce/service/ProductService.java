package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.Product;

public interface ProductService {
    public List<Product> returnAllProducts();
    public Product returnProductById(int id);
    public Product returnProductBySku(String sku);
    public void addNewProduct(Product product);
    public void updateProduct(Product product);
    public void deleteProductById(int id);
    public void deleteProductBySku(String sku);
}

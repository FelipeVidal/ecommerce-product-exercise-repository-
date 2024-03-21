package com.ecommerce.repository;

import java.util.List;

import com.ecommerce.model.Product;;

public interface ProductRepository {
    List<Product> getAllProducts();
    void addProduct(Product product);
    Product getProductById(int id);
    Product getProductBySku(String sku);
    void updateProduct(Product product);
    void deleteProductById(int id);
    void deleteProductBySku(String sku);
}

package com.ecommerce.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository{

    @Autowired
    ProductJpaSpring productJpa;

    @Override
    public List<Product> getAllProducts() {
        return productJpa.findAll();
    }

    @Override
    public void addProduct(Product product) {
        productJpa.save(product);
    }

    @Override
    public Product getProductById(int id) {
        return productJpa.findById(id).orElse(null);
    }

    @Override
    public Product getProductBySku(String sku) {
        return productJpa.findBySku(sku);
    }

    @Override
    public void updateProduct(Product product) {
        productJpa.save(product);
    }

    @Override
    public void deleteProductById(int id) {
        productJpa.deleteById(id);
    }

    @Override
    public void deleteProductBySku(String sku){
        productJpa.deleteBySku(sku);
    }
}

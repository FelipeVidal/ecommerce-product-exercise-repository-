package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> returnAllProducts() {
        return productRepository.getAllProducts();
    }

    @Override
    public Product returnProductById(int id) {
        return productRepository.getProductById(id);
    }
    @Override
    public void addNewProduct(Product product) {
        productRepository.addProduct(product);
    }

    @Override
    public void updateProduct(Product product) {
        if(productRepository.getProductById(product.getId())!=null){
            productRepository.updateProduct(product);
        }
    }

    @Override
    public void deleteProductById(int id) {
        productRepository.deleteProductById(id);
    }

    @Override
    public void deleteProductBySku(String sku) {
        productRepository.deleteProductBySku(sku);
    }

    @Override
    public Product returnProductBySku(String sku) {
        return productRepository.getProductBySku(sku);
    }
}

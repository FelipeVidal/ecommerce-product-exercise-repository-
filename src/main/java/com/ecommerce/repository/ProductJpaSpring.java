package com.ecommerce.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.model.Product;


public interface ProductJpaSpring extends JpaRepository<Product, Integer> {
    
    Product findBySku(String sku);

    @Transactional
    @Modifying
    @Query("Delete from Product p Where p.sku = ?1")
    void deleteBySku(String sku);

}

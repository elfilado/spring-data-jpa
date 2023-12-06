package com.example.bdd.repository;

import com.example.bdd.model.northwind.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAll();
    Product findById(long id);
    @Query("FROM Product, OrderDetail WHERE OrderDetail.productID = null")
    List<Product> findProductsWithoutOrder();
}
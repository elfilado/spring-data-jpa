package com.example.bdd.service;

import com.example.bdd.model.northwind.Product;
import com.example.bdd.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository employeeRepository) {
        this.productRepository = employeeRepository;
    }
    public Product findById(long id) {
        return this.productRepository.findById(id);
    }

    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    public List<Product> findProductsWithoutOrder() {
        return this.productRepository.findProductsWithoutOrder();
    }
}

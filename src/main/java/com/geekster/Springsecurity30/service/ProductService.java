package com.geekster.Springsecurity30.service;

import com.geekster.Springsecurity30.model.Product;
import com.geekster.Springsecurity30.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;
    public List<Product> getAllProduct() {
     return productRepo.findAll();
    }

    public Optional<Product> getProductById(Long productId) {
       return productRepo.findById(productId);
    }
}

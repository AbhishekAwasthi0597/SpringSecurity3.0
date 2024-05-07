package com.geekster.Springsecurity30.controler;

import com.geekster.Springsecurity30.model.Product;
import com.geekster.Springsecurity30.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
    @GetMapping("/all")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Product> getAllProducts(){
        return productService.getAllProduct();
    }
    @GetMapping("/{productId}")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public Optional<Product> getProductById(@PathVariable Long productId){
        return productService.getProductById(productId);
    }
}

package com.geekster.Springsecurity30.repo;

import com.geekster.Springsecurity30.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Long> {

}

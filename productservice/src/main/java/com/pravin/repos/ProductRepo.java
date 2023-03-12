package com.pravin.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pravin.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}

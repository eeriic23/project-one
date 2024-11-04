package com.travelport.service;

import com.travelport.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();

    Optional<Product> findById(Integer id);

    Optional<Integer> deleteById(Integer id);

    Product save(Product product);

    Product update(Integer id, Product product);
}
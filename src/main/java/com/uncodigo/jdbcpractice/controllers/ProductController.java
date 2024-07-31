package com.uncodigo.jdbcpractice.controllers;

import com.uncodigo.jdbcpractice.models.Product;
import com.uncodigo.jdbcpractice.repositories.CrudRepository;

import java.util.List;

public class ProductController {

    private final CrudRepository<Product> productRepository;

    public ProductController(CrudRepository<Product> productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

}

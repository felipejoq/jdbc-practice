package com.uncodigo;

import com.uncodigo.jdbcpractice.controllers.ProductController;
import com.uncodigo.jdbcpractice.models.Product;
import com.uncodigo.jdbcpractice.repositories.CrudRepository;
import com.uncodigo.jdbcpractice.repositories.ProductRepositoryImpl;

public class Main {
    public static void main(String[] args) {
        CrudRepository<Product> productRepository = new ProductRepositoryImpl();
        ProductController productController = new ProductController(productRepository);

        System.out.println("========= Listar productos =========");
        productController.findAll().forEach(System.out::println);

    }
}
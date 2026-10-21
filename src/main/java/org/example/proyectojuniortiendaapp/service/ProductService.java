package org.example.proyectojuniortiendaapp.service;

import org.example.proyectojuniortiendaapp.entity.Product;

import java.util.List;

public interface ProductService {
    Product create(Product Product);

    List<Product> listAll();

    Product findById(Long id);

    Product update(Product Product);

    void delete(Long id);
}

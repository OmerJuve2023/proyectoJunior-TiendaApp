package org.example.proyectojuniortiendaapp.service.imp;

import org.example.proyectojuniortiendaapp.entity.Product;
import org.example.proyectojuniortiendaapp.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService {

    @Override
    public Product create(Product Product) {
        return null;
    }

    @Override
    public List<Product> listAll() {
        return List.of();
    }

    @Override
    public Product findById(Long id) {
        return null;
    }

    @Override
    public Product update(Product Product) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}

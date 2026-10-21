package org.example.proyectojuniortiendaapp.service.imp;

import org.example.proyectojuniortiendaapp.entity.Category;
import org.example.proyectojuniortiendaapp.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImp implements CategoryService {

    @Override
    public Category create(Category category) {
        return null;
    }

    @Override
    public List<Category> listAll() {
        return List.of();
    }

    @Override
    public Category findById(Long id) {
        return null;
    }

    @Override
    public Category update(Category category) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}

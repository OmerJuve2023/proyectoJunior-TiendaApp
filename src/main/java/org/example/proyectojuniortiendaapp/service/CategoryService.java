package org.example.proyectojuniortiendaapp.service;

import org.example.proyectojuniortiendaapp.entity.Category;

import java.util.List;

public interface CategoryService {
    Category create(Category category);

    List<Category> listAll();

    Category findById(Long id);

    Category update(Category category);

    void delete(Long id);
}

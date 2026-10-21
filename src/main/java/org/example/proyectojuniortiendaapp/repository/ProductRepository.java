package org.example.proyectojuniortiendaapp.repository;

import org.example.proyectojuniortiendaapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

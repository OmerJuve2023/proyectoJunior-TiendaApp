package org.example.proyectojuniortiendaapp.repository;

import org.example.proyectojuniortiendaapp.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}

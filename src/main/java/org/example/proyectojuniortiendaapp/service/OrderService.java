package org.example.proyectojuniortiendaapp.service;

import org.example.proyectojuniortiendaapp.entity.Order;

import java.util.List;

public interface OrderService {
    Order create(Order Order);

    List<Order> listAll();

    Order findById(Long id);

    Order update(Order Order);

    void delete(Long id);
}

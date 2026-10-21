package org.example.proyectojuniortiendaapp.service;

import org.example.proyectojuniortiendaapp.entity.OrderItem;

import java.util.List;

public interface OrderItemService {
    OrderItem create(OrderItem OrderItem);

    List<OrderItem> listAll();

    OrderItem findById(Long id);

    OrderItem update(OrderItem OrderItem);

    void delete(Long id);
}

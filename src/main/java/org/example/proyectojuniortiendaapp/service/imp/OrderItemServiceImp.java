package org.example.proyectojuniortiendaapp.service.imp;

import org.example.proyectojuniortiendaapp.entity.OrderItem;
import org.example.proyectojuniortiendaapp.service.OrderItemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImp implements OrderItemService {
    @Override
    public OrderItem create(OrderItem OrderItem) {
        return null;
    }

    @Override
    public List<OrderItem> listAll() {
        return List.of();
    }

    @Override
    public OrderItem findById(Long id) {
        return null;
    }

    @Override
    public OrderItem update(OrderItem OrderItem) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}

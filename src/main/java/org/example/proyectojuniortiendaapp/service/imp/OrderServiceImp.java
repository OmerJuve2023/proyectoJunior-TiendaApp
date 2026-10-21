package org.example.proyectojuniortiendaapp.service.imp;

import org.example.proyectojuniortiendaapp.entity.Order;
import org.example.proyectojuniortiendaapp.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImp implements OrderService {
    @Override
    public Order create(Order Order) {
        return null;
    }

    @Override
    public List<Order> listAll() {
        return List.of();
    }

    @Override
    public Order findById(Long id) {
        return null;
    }

    @Override
    public Order update(Order Order) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}

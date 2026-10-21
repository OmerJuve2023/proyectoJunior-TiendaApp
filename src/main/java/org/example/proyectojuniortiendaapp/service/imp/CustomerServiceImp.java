package org.example.proyectojuniortiendaapp.service.imp;

import org.example.proyectojuniortiendaapp.entity.Customer;
import org.example.proyectojuniortiendaapp.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {

    @Override
    public Customer create(Customer Customer) {
        return null;
    }

    @Override
    public List<Customer> listAll() {
        return List.of();
    }

    @Override
    public Customer findById(Long id) {
        return null;
    }

    @Override
    public Customer update(Customer Customer) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}

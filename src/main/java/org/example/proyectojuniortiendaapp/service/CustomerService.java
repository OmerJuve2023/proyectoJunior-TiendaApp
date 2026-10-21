package org.example.proyectojuniortiendaapp.service;

import org.example.proyectojuniortiendaapp.entity.Customer;
import java.util.List;

public interface CustomerService {
    Customer create(Customer Customer);

    List<Customer> listAll();

    Customer findById(Long id);

    Customer update(Customer Customer);

    void delete(Long id);
}

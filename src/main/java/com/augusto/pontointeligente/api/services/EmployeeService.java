package com.augusto.pontointeligente.api.services;

import com.augusto.pontointeligente.api.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface EmployeeService {

    Employee searchByTaxNumber(String taxNumber);

    Employee save(Employee employee);

    Employee searchById(Long id);
}

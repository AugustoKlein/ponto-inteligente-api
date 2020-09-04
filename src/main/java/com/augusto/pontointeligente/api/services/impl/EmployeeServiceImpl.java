package com.augusto.pontointeligente.api.services.impl;

import com.augusto.pontointeligente.api.exception.CustomGenericException;
import com.augusto.pontointeligente.api.model.Employee;
import com.augusto.pontointeligente.api.repositories.EmployeeRepository;
import com.augusto.pontointeligente.api.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee searchByTaxNumber(String taxNumber) {
        Optional<Employee> optionalEmployee = Optional.ofNullable(employeeRepository.findByTaxNumber(taxNumber));

        if(!optionalEmployee.isPresent())
            throw new CustomGenericException("No employee found by the tax number given");

        return optionalEmployee.get();
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee searchById(Long id) {
        Optional<Employee> optionalEmployee =  employeeRepository.findById(id);

        if(!optionalEmployee.isPresent())
            throw new CustomGenericException("No employee found by the id number given");

        return optionalEmployee.get();
    }


}

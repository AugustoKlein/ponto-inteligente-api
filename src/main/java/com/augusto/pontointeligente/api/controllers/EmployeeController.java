package com.augusto.pontointeligente.api.controllers;

import com.augusto.pontointeligente.api.model.Employee;
import com.augusto.pontointeligente.api.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController("api/employee")
public class EmployeeController {

    @Autowired
     EmployeeService employeeService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping(path = "/find/tax-number/{taxNumber}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee findByTaxNumber(@PathVariable("taxNumber") String taxNumber){
        return employeeService.searchByTaxNumber(taxNumber);
    }

    @GetMapping(path = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public String findByTaxNumber(){
        return passwordEncoder.encode("1234");
    }
}

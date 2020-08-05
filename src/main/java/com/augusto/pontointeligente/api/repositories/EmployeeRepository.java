package com.augusto.pontointeligente.api.repositories;

import com.augusto.pontointeligente.api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    Employee findByTaxNumber(String taxNumber);

    Employee findByEmail(String email);

    Employee findByTaxNumberOrEmail(String taxNumber,String email);
}

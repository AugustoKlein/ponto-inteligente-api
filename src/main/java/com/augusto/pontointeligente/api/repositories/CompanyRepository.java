package com.augusto.pontointeligente.api.repositories;

import com.augusto.pontointeligente.api.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface CompanyRepository extends JpaRepository<Company,Long> {

    @Transactional(readOnly = true)
    Company findByTaxNumber(String taxNumber);
}

package com.augusto.pontointeligente.api.services;

import com.augusto.pontointeligente.api.model.Company;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface CompanyService {

    Company searchByTaxNumber(String taxNumber);

    Company save(Company company);

}

package com.augusto.pontointeligente.api.services.impl;

import com.augusto.pontointeligente.api.exception.CustomGenericException;
import com.augusto.pontointeligente.api.model.Company;
import com.augusto.pontointeligente.api.repositories.CompanyRepository;
import com.augusto.pontointeligente.api.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Company searchByTaxNumber(String taxNumber) {
        Optional<Company> optionalCompany = Optional.ofNullable(companyRepository.findByTaxNumber(taxNumber));

        if(!optionalCompany.isPresent())
            throw new CustomGenericException("No Company found by the tax number given");

        return optionalCompany.get();
    }

    public Company save(Company Company) {
        return companyRepository.save(Company);
    }

}

package com.augusto.pontointeligente.api.controllers;

import com.augusto.pontointeligente.api.model.Company;
import com.augusto.pontointeligente.api.model.Employee;
import com.augusto.pontointeligente.api.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/company")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @GetMapping(path = "/find/tax-number/{taxNumber}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Company findByTaxNumber(@PathVariable("taxNumber") String taxNumber){
        return companyService.searchByTaxNumber(taxNumber);
    }
}

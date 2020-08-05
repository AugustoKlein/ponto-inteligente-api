package com.augusto.pontointeligente.api;

import com.augusto.pontointeligente.api.model.Company;
import com.augusto.pontointeligente.api.repositories.CompanyRepository;
import com.augusto.pontointeligente.api.utils.PasswordUtils;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;


@SpringBootTest
@ActiveProfiles("test")
class PontoInteligenteApplicationTests {

	@Autowired
	private CompanyRepository companyRepository;

//	@Test
	void testBPCrypt() {
        String bpCrypt = PasswordUtils.generateBCrypt("123");
        boolean matches = PasswordUtils.validate("123",bpCrypt);
		assertEquals(true,matches);
	}

	@BeforeEach
	public void setUp() {
		Company company = new Company();
		company.setCompayName("Empresa de Teste");
		company.setTaxNumber("1234");

		companyRepository.save(company);
	}

	@Test
	void testRepo(){
		Company company = companyRepository.findByTaxNumber("1234");
		List<Company> companies = companyRepository.findAll();
		assertEquals("1234",company.getTaxNumber());
	}

}

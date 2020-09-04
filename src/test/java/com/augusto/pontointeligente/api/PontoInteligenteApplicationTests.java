package com.augusto.pontointeligente.api;

import com.augusto.pontointeligente.api.model.Company;
import com.augusto.pontointeligente.api.repositories.CompanyRepository;
import com.augusto.pontointeligente.api.utils.PasswordUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@SpringBootTest
@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
@EnableAutoConfiguration
class PontoInteligenteApplicationTests {

	@Autowired
	private CompanyRepository companyRepository;


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

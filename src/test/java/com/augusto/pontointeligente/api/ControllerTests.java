package com.augusto.pontointeligente.api;

import com.augusto.pontointeligente.api.controllers.EmployeeController;
import com.augusto.pontointeligente.api.exception.GlobalExceptionHandler;
import com.augusto.pontointeligente.api.model.Employee;
import com.augusto.pontointeligente.api.repositories.EmployeeRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class ControllerTests {

//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @LocalServerPort
//    private int port;
//
//    @MockBean
//    private EmployeeRepository employeeRepository;
//
//    @TestConfiguration
//    static class Config{
//        @Bean
//        public RestTemplateBuilder restTemplateBuilder(){
//            return new RestTemplateBuilder().basicAuthentication("admin","admin");
//        }
//    }
//
//    @Test
//    public void getEmployeeWhenUsernameAndPasswordAreIncorrectShouldReturnStatusCode401(){
//        restTemplate = restTemplate.withBasicAuth("1","1");
//        ResponseEntity<String> response = restTemplate.getForEntity("/api/employee/find/tax-number/1",String.class);
//        Assertions.assertThat(response.getStatusCode()).isEqualTo(401);
//    }


//    @BeforeEach
//    public void setUp(){
//        mockMvc = MockMvcBuilders.standaloneSetup(employeeController)
//                .setControllerAdvice(new GlobalExceptionHandler())
//                .build();
//
//        Employee employee = new Employee();
//        employee.setTaxNumber("1234");
//        employee.setPerfil(Employee.Perfil.ROLE_USUARIO);
//        employeeRepository.save(employee);
//    }
//
//
//    @Test
//    public void findByTaxNumber() throws Exception {
//        String uri = "/api/employee/find/tax-number/1234";
//
//        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get(uri)
//                .accept(MediaType.APPLICATION_JSON_VALUE))
//                .andReturn();
//
//        int status = mvcResult.getResponse().getStatus();
//
//        assertEquals(200,status);
//    }
}

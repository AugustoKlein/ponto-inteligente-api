package com.augusto.pontointeligente.api;

import com.augusto.pontointeligente.api.controllers.EmployeeController;
import com.augusto.pontointeligente.api.exception.GlobalExceptionHandler;
import com.augusto.pontointeligente.api.model.Employee;
import com.augusto.pontointeligente.api.repositories.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.MediaType;
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
public class ControllerTests {

    //TODO:Implementar um cenario de teste com o Mockito
//    @Mock
//    EmployeeRepository employeeRepository;
//
//    @InjectMocks
//    EmployeeController employeeController;
//
//    MockMvc mockMvc;
//
//
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
//@SpringBootTest

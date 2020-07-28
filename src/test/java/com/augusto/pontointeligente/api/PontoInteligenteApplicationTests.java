package com.augusto.pontointeligente.api;

import com.augusto.pontointeligente.api.utils.PasswordUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


@SpringBootTest
@ActiveProfiles("test")
class PontoInteligenteApplicationTests {


	@Test
	void testBPCrypt() {
        String bpCrypt = PasswordUtils.generateBCrypt("123");

        boolean matches = PasswordUtils.validate("123",bpCrypt);

		assertEquals(true,matches);
	}

}

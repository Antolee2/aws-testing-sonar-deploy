package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class cseControllerTest {
	cseController c = new cseController();
	@Test
	void csetest() {
		int result=c.addcse(2,3);
		assertEquals (5,result);
	}

}

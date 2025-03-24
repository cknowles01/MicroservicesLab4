package com.example.Inventoryy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class InventoryyApplicationTests {

	@Test
	void contextLoads() {
	}

}

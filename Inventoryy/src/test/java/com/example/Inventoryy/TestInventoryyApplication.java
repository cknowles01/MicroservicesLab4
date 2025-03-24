package com.example.Inventoryy;

import org.springframework.boot.SpringApplication;

public class TestInventoryyApplication {

	public static void main(String[] args) {
		SpringApplication.from(InventoryServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

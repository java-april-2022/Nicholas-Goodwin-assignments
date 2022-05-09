package com.summer.DojoNinja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.seic.deliveryautomation.mapper"})
public class DojosandninjasApplication {

	public static void main(String[] args) {
		SpringApplication.run(DojosandninjasApplication.class, args);
	}

}

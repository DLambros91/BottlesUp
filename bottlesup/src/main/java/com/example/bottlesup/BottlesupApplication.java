package com.example.bottlesup;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EntityScan(basePackageClasses = {
	BottlesupApplication.class, 
	Jsr310JpaConvers.class})
public class BottlesupApplication {

	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}

	public static void main(String[] args) {
		SpringApplication.run(BottlesupApplication.class, args);
	}

}

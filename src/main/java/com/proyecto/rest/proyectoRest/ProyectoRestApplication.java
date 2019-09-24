package com.proyecto.rest.proyectoRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.proyecto.rest"})
public class ProyectoRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoRestApplication.class, args);
	}

}

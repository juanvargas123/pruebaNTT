package com.microservicios.persona.datos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatosApplication.class, args);
	}
	
	@Bean
	public DatosService datosService() {
		return new DatosService();
	}

}

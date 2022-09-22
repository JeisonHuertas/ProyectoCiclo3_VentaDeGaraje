package com.ciclo3.ventaDeGaraje.VentaDeGaraje;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class VentaDeGarajeApplication {

	public static void main(String[] args) {
		SpringApplication.run(VentaDeGarajeApplication.class, args);
	}

}

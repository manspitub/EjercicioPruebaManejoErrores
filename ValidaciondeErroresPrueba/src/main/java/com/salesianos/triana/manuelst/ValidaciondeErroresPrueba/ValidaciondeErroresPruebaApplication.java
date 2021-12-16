package com.salesianos.triana.manuelst.ValidaciondeErroresPrueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class ValidaciondeErroresPruebaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidaciondeErroresPruebaApplication.class, args);
		System.out.println(LocalDateTime.now());
	}

}

package com.example.ProyectoFinalCoderHouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Clase principal, va a ejecutar la aplicacion ya que posee el metodo main, al tener la anotacion, le indicamos que es 
//una clase de spring y aqui se va a ejecutar el inicio de la app
@SpringBootApplication
public class ProyectoFinalCoderHouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalCoderHouseApplication.class, args);
	}

}

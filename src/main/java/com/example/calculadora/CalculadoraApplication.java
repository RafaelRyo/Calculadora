package com.example.calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CalculadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraApplication.class, args);
	}

	@RequestMapping("")
	public String iniciar(){
		String resultado = "Hola mundo";
		return resultado;
	}

	@RequestMapping("/calculadora/suma")
	public int suma(@RequestParam ("numero1") int numero1, @RequestParam("numero2") int numero2){
		//http://localhost:8080/calculadora/suma?numero1=4&numero2=5
		int resultado = numero1 + numero2;
		return resultado;
	}

	@RequestMapping("/calculadora/resta")
	public int resta(@RequestParam ("numero1") int numero1, @RequestParam ("numero2") int numero2){
		//http://localhost:8080/calculadora/resta?numero1=4&numero2=5
		int resultado = numero1 - numero2;
		return resultado;
	}

}

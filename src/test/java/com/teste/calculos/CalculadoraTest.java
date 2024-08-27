package com.teste.calculos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName("Teste 5 + 5 = 10")
	void testSum() {
		// Arrange 
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 10D;
		
		//Act
		double resultado = calc.sum(valor1, valor2);
		
		//Assert
		assertEquals(esperado,resultado, " 5 + 5 não gerou o valor 10");
		
	}
	@Test
	@DisplayName("Teste 15 - 2 = 13")
	void testSub() {
		// Arrange 
		Calculadora calc = new Calculadora();
		double valor1 = 15D;
		double valor2 = 2D;
		double esperado = 13D;
		
		//Act
		double resultado = calc.sub(valor1, valor2);
		
		//Assert
		assertEquals(esperado,resultado, " 15 - 2 não gerou o valor 13");
		
		
	}
	@Test
	@DisplayName("Teste 2 * 1 = 2")
	void testMult() {
		// Arrange 
		Calculadora calc = new Calculadora();
		double valor1 = 2D;
		double valor2 = 1D;
		double esperado = 2D;
		
		//Act
		double resultado = calc.mult(valor1, valor2);
		
		//Assert
		assertEquals(esperado,resultado, " 2 * 9 não gerou o valor 18");
		
		
	}
	@Test
	@DisplayName("Teste 6 / 6 = 1")
	void testDiv() {
		// Arrange 
		Calculadora calc = new Calculadora();
		double valor1 = 6D;
		double valor2 = 6D;
		double esperado = 1D;
		
		//Act
		double resultado = calc.div(valor1, valor2);
		
		//Assert
		assertEquals(esperado,resultado, " 2 * 9 não gerou o valor 18");
		
		
	}
		

}

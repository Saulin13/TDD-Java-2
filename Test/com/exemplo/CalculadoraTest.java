package com.exemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	Calculadora calc = new Calculadora();
	
	@Test 
	public void testeSoma() {
		assertEquals(3, calc.soma(0, 3)); // estou esperando o resultado 3, de uma funcao de soma, onde passo dois paramentros (0+3) 
		
	}

}

package com.exemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	Calculadora calc = new Calculadora();
	
	@Test 
	public void testeSoma() {
		assertEquals(3, calc.soma(0, 3)); // estou esperando o resultado 3, de uma funcao de soma, onde passo dois paramentros (0+3) 
		
	}
	
	@Test
	public void testeSub() {
		assertEquals(2,calc.subtracao(3, 1)); // estou esperando o resultado 2, de uma funcao de subtracao, onde passo dois parametros (3-1)
	}

	@Test
	 public void testeDivisao() {
		 assertEquals(6, calc.divisao(30, 5)); // estou esperando o resultado 6, de uma funcao de divisao, onde passo dois parametro (30/5)
		   
	 }

	 @Test
	 public void testeMulti() {
		 assertEquals(20, calc.multiplicacao(5, 4)); 
	 }
	 
	 @Test
	 public void testePorcentagem() {
		 assertEquals(24, calc.porcentagem(80,30));
	 }
}

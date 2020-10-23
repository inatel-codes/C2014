package br.inatel.C214.calculadora;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteCalculadora {

	private Calculadora calculadora;
	
	@Before
	public void init() {
		calculadora = new Calculadora();
	}
	
	@Test
	public void testeExponenciacao() {
		calculadora.setNum1(2);
		calculadora.setNum2(4);
		
		double resultado = calculadora.exponenciacao();
		
		assertEquals(16, resultado, 0.01);
	}
	
	@Test
	public void testeRaiz() {
		calculadora.setNum1(4);
		calculadora.setNum2(2);
		
		double resultado = calculadora.raiz();
		
		assertEquals(2, resultado, 0.01);
	}
	
	@Test
	public void testePorcentagem() {
		calculadora.setNum1(20);
		calculadora.setNum2(100);
		
		double resultado = calculadora.porcentagem();
		
		assertEquals(20, resultado, 0.01);
	}
	
	@Test
	public void testeDivisao() {
		calculadora.setNum1(100);
		calculadora.setNum2(25);
		
		double resultado = calculadora.divisao();
		
		assertEquals(4, resultado, 0.01);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testeDivisaoPorZero() {
		calculadora.setNum1(100);
		calculadora.setNum2(0);
		
		calculadora.divisao();
	}
}

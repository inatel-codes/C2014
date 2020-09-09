package br.inatel.cdg.aula_08_tdd.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTeste {

	private Calculadora calc;

	@Before
	public void init() {
		calc = new Calculadora();
	}

	@Test
	public void testeSoma() {
		double res = calc.somar(2.4, 3.2);
		assertEquals(5.6, res, 0.01);
	}

	@Test
	public void testeSubtracao() {
		double res = calc.subtrair(9.0, 6.1);
		assertEquals(2.9, res, 0.01);
	}
	
	@Test
	public void testeDivisao() {
		double res = calc.dividir(30.0, 4.0);
		assertEquals(7.5, res, 0.01);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testeDivisaoZero() {
		calc.dividir(30.0, 0.0);
	}
}

package br.inatel.cdg.aula_08_tdd.pilha;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestePilha {

	private Pilha pilha;
	private int maxElementos = 10;

	@Before
	public void init() {
		pilha = new Pilha(maxElementos);
	}

	@Test
	public void testePilhaVazia() {
		assertTrue(pilha.isVazia());
	}

	@Test
	public void testePushUmElemento() {
		pilha.push(23);
		assertEquals(1, pilha.getQtdElementos());
	}

	@Test
	public void testePushDoisElementos() {
		pilha.push(23);
		pilha.push(42);
		assertFalse(pilha.isVazia());
		assertEquals(2, pilha.getQtdElementos());
		assertEquals(42, pilha.getTopo());
	}

	@Test
	public void testePopPilha() {
		pilha.push(23);
		pilha.push(42);

		int retorno = pilha.pop();

		assertEquals(1, pilha.getQtdElementos());
		assertEquals(42, retorno);

		retorno = pilha.pop();
		assertEquals(23, retorno);
		assertEquals(0, pilha.getQtdElementos());
	}

	@Test(expected = PilhaVaziaException.class)
	public void popPilhaVazia() {
		pilha.pop();
	}

	public void pushPilhaCheio() {
		for (int i = 0; i < maxElementos; i++) {
			pilha.push(i);
		}
		
		try {
			pilha.push(99);
			fail();
		}catch(PilhaCheiaException ex) {
			ex.getValor();
		}
	}
}

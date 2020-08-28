import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.EmptyStackException;

import org.junit.Before;
import org.junit.Test;

import br.inatel.cdg.Pilha;

public class PilhaTeste {
	
	Pilha<Integer> p;
	
	@Before
	public void criaPilha() {
		p = new Pilha<Integer>();
	}
	
	@Test
	public void testePilhaVazia() {
		assertTrue(p.pilhaVazia());
	}
	
	@Test
	public void testePush() {
		p.push(23);
		int retorno = p.getQtdElementos();
		assertEquals(1, retorno);
	}
	
	@Test
	public void testePop() {
		p.push(23);
		p.push(32);
		int retorno = p.pop();
		assertEquals(32, retorno);
	}
	
	@Test(expected = EmptyStackException.class)
	public void testPopPilhaVazia() {
		p.pop();
	}
	
	@Test
	public void testeAssert() {
		Pilha<Integer> pilha1 = new Pilha<Integer>();
		Pilha<Integer> pilha2 = new Pilha<Integer>();
		assertEquals(pilha1, pilha2);
	}
}

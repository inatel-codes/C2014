package br.inatel.cdg.inimigo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestInimigo {
	private Inimigo inimigo;
	
	@Before
	public void setUp() {
		inimigo = new Inimigo("Silver Knight", "Silver Knight Halberd", 150);
	}
	
	@Test
	public void testeFezANotificacao() {
		UIMockNotifier notifier = new UIMockNotifier();
		inimigo.registerNotifier(notifier);
		inimigo.tomarDano(200);
		
		assertTrue(notifier.getExecuted());
	}
	
	@Test
	public void testeNaoFazANotificacao() {
		UIMockNotifier notifier = new UIMockNotifier();
		inimigo.registerNotifier(notifier);
		inimigo.tomarDano(100);
		
		assertFalse(notifier.getExecuted());
	}
	
	@Test
	public void testeFazDuasNotificacoes() {
		UIMockNotifier notifier = new UIMockNotifier();
		GameManagerMockNotifier notifier2 = new GameManagerMockNotifier();
		
		inimigo.registerNotifier(notifier);
		inimigo.registerNotifier(notifier2);
		
		inimigo.tomarDano(150);
		
		assertTrue(notifier.getExecuted());
		assertTrue(notifier2.getExecuted());
	}
	
	@Test
	public void testeFazDuasNotificacoesChamaUmaApenas() {
		UIMockNotifier notifier = new UIMockNotifier();
		GameManagerMockNotifier notifier2 = new GameManagerMockNotifier();
		
		inimigo.registerNotifier(notifier2);
		
		inimigo.tomarDano(150);
		
		assertFalse(notifier.getExecuted());
		assertTrue(notifier2.getExecuted());
	}
}

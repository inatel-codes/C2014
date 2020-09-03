package br.inatel.cdg.inimigo.mockito;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import br.inatel.cdg.inimigo.Inimigo;
import br.inatel.cdg.inimigo.Notifier;

@RunWith(MockitoJUnitRunner.class)
public class TesteInimigo {
	private Inimigo inimigo;
	
	@Mock
	private Notifier notifier;
	
	@Before
	public void setUp() {
		inimigo = new Inimigo("Silver Knight", "Silver Knight Halberd", 150);
	}

	@Test
	public void testeFezANotificacao() {
		inimigo.registerNotifier(notifier);
		inimigo.tomarDano(150);
		
		Mockito.verify(notifier).notifica(inimigo);
	}
	
	@Test
	public void testeNaoFezANotificacao() {
		inimigo.registerNotifier(notifier);
		inimigo.tomarDano(100);
		
		Mockito.verifyNoInteractions(notifier);
	}
}

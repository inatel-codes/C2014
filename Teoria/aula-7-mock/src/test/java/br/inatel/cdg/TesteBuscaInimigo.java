package br.inatel.cdg;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.inatel.cdg.inimigo.BuscaInimigo;
import br.inatel.cdg.inimigo.Inimigo;
import br.inatel.cdg.inimigo.InimigoService;

public class TesteBuscaInimigo {
	private BuscaInimigo buscaInimigo;
	private InimigoService inimigoService;
	
	@Before
	public void SetUp() {
		inimigoService = new MockInimigoService();
		buscaInimigo = new BuscaInimigo(inimigoService);
	}
	
	@Test
	public void testeBuscaRingedKnight() {
		Inimigo ringedKnight = buscaInimigo.buscaInimigo(23);
		
		assertEquals("Ringed Knight", ringedKnight.getNome());
		assertEquals(200.0, ringedKnight.getQtdVida(), 0.1);
		assertEquals("Ringed Knight Sword", ringedKnight.getArma());
	}
	
	@Test
	public void testeBuscaInvalida() {
		Inimigo inimigoPadrao = buscaInimigo.buscaInimigo(-1);
		
		assertEquals("Hollow", inimigoPadrao.getNome());
		assertEquals(20.0, inimigoPadrao.getQtdVida(), 0.1);
		assertEquals("Broken Sword", inimigoPadrao.getArma());
	}
}

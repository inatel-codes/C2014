package model.test.selenium;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.entities.Pesquisa;

public class TestPesquisa {
	
	private Pesquisa pesquisa;
	
	@Before
	public void beforeTest() {
		pesquisa = new Pesquisa();
	}
	
	@Test
	public void pesquisaPalavraEngenharia() {
		String title = pesquisa.pesquisaGoogle("Engenharia");
		
		assertEquals("Google", title);
	}
}

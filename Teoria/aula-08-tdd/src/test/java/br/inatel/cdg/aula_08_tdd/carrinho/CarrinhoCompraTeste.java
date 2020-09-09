package br.inatel.cdg.aula_08_tdd.carrinho;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CarrinhoCompraTeste {
	
	private CarrinhoDeCompra carrinho;
	
	@Before
	public void init() {
		carrinho = new CarrinhoDeCompra();
	}
	@Test
	public void testeCompraBoardGame() {
		BoardGame jogo1 = new BoardGame("Sagrada", 100.00);
		BoardGame jogo2 = new BoardGame("Ticket To Ride", 150.00);
		
		carrinho.adicionaBG(jogo1);
		carrinho.adicionaBG(jogo2);
		
		double totalCompra = carrinho.getTotalCompra();
		
		assertEquals(250.0, totalCompra, 0.01);
	}
}

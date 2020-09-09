package br.inatel.cdg.aula_08_tdd.carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
	
	private List<BoardGame> jogos;
	
	public CarrinhoDeCompra(){
		jogos = new ArrayList<BoardGame>();
	}
	
	public void adicionaBG(BoardGame jogo1) {
		jogos.add(jogo1);
	}

	public double getTotalCompra() {
		double total = 0;
		
		for (BoardGame boardGame : jogos) {
			total += boardGame.getValor();
		}
		
		return total;
	}

}

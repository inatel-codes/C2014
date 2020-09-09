package br.inatel.cdg.aula_08_tdd.carrinho;

public class BoardGame {
	private String nome;
	private double valor;
	
	public BoardGame(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	public double getValor() {
		return valor;
	}
}

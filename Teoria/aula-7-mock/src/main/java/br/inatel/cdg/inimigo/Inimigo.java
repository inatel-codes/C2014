package br.inatel.cdg.inimigo;

public class Inimigo {
	private String nome, arma;
	private double qtdVida;
	
	
	public Inimigo(String nome, String arma, double qtdVida) {
		super();
		this.nome = nome;
		this.arma = arma;
		this.qtdVida = qtdVida;
	}
	
	public String getNome() {
		return nome;
	}
	public String getArma() {
		return arma;
	}
	public double getQtdVida() {
		return qtdVida;
	}
	
	
}

package br.inatel.cdg.aula_decorator.bebidas;

public class Espresso extends Bebida{
	
	public Espresso() {
		descricao = "Espresso";
	}
	
	public double preco() {
		return 6.00;
	}
}

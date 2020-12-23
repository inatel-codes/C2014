package br.inatel.cdg.aula_decorator.bebidas;

public class Bebida {
	protected String descricao = "Bebida Desconhecida";
	
	public String getDescricao() {
		return descricao;
	}
	
	public abstract double preco;
}

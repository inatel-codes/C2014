package br.inatel.cdg;

import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {

	private List<T> elementos = new ArrayList<T>();
	
	private int qtdElementos;
	
	public int getQtdElementos() {
		return this.getQtdElementos();
	}
	
	public void push(T elemento) {
		this.elementos.add(elemento);
		this.qtdElementos++;
	}
}

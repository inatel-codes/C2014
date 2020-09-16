package br.inatel.cdg.aula_08_tdd.pilha;

import java.util.ArrayList;
import java.util.List;

public class Pilha {

	private List<Integer> elementos;
	private int qtdElementos = 0;
	private int maxElementos;
	
	public Pilha(int maxElementos) {
		elementos = new ArrayList<Integer>();
		this.maxElementos = maxElementos;
	}

	public boolean isVazia() {
		return qtdElementos == 0;
	}

	public void push(int elemento) {
		if(qtdElementos == maxElementos) {
			throw new PilhaCheiaException(elemento);
		}
		elementos.add(elemento);
		qtdElementos++;
	}

	public int getQtdElementos() {
		return qtdElementos;
	}

	public int getTopo() {
		return elementos.get(qtdElementos - 1);
	}

	public int pop() {
		if(qtdElementos == 0)
			throw new PilhaVaziaException();
		
		qtdElementos--;
		return elementos.remove(qtdElementos);
	}
}

package br.inatel.cdg;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Pilha<T> {

	private List<T> elementos = new ArrayList<T>();
	private int qtdElementos;

	public int getQtdElementos() {
		return qtdElementos;
	}

	public boolean pilhaVazia() {
		return qtdElementos == 0;
	}

	public void push(T elemento) {
		elementos.add(elemento);
		qtdElementos++;
	}

	public T pop() {
		if (pilhaVazia()) {
			throw new EmptyStackException();
		}

		qtdElementos--;
		return elementos.get(qtdElementos);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Pilha) {
			Pilha p = (Pilha) obj;
			if(this.qtdElementos == p.qtdElementos) {
				return true;
			}
		}
		
		return false;
	}
}

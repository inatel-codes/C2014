package br.inatel.cdg.aula_08_tdd.pilha;

public class PilhaCheiaException extends RuntimeException {
	
	private int errorValue;
	
	public PilhaCheiaException(int errorValue) {
		this.errorValue = errorValue;
	}
	
	public int getValor() {
		return this.errorValue;
	}

}

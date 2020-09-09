package br.inatel.cdg.aula_08_tdd.calculadora;

public class Calculadora {

	public double somar(double d, double e) {
		return d + e;
	}

	public double subtrair(double i, double d) {
		return i - d;
	}

	public double dividir(double i, double j) {
		if(j == 0) {
			throw new IllegalArgumentException("Deu ruim!");
		}
		
		return i / j;
	}

}

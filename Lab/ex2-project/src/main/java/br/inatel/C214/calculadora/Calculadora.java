package br.inatel.C214.calculadora;

public class Calculadora {
	private double num1;
	private double num2;
	
	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public double exponenciacao() {
		double resultado = Math.pow(num1, num2);
		return resultado;
	}

	public double raiz() {
		double resultado = Math.sqrt(num1);
		return resultado;
	}
	
	public double porcentagem() {
		double resultado = (num1/100)*num2;
		return resultado;
	}
	
	public double divisao() {
		if(num2 == 0) {
			throw new IllegalArgumentException("Divisão por zero detectada!");
		}
		
		double resultado = num1/num2;
		return resultado;
	}
}

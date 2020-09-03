package br.inatel.cdg.inimigo;

import java.util.ArrayList;
import java.util.List;

public class Inimigo {
	private String nome, arma;
	private double qtdVida;

	private List<Notifier> notifiers;

	public void tomarDano(double qtdVida) {
		this.qtdVida -= qtdVida;
		if (this.qtdVida <= 0) {
			for (Notifier notifier : notifiers) {
				notifier.notifica(this);
			}
		}
	}

	public void registerNotifier(Notifier notifier) {
		this.notifiers.add(notifier);
	}

	public Inimigo(String nome, String arma, double qtdVida) {
		super();
		this.nome = nome;
		this.arma = arma;
		this.qtdVida = qtdVida;
		this.notifiers = new ArrayList<Notifier>();
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

package br.inatel.model.entities;

public class Notebook extends Product {
	private double storage;
	private String gpu;
	private String cpu;
	
	public Notebook(String name, double price, double storage, String gpu, String cpu) {
		super(name, price);
		this.storage = storage;
		this.gpu = gpu;
		this.cpu = cpu;
	}

	@Override
	public String priceTag() {
		return getName() + "$ " + String.format("%.2f", getPrice()) + " " + this.storage + " " + this.gpu + " " + this.cpu;
	}
}

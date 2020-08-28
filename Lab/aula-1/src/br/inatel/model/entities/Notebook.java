package br.inatel.model.entities;

import br.inatel.model.interfaces.Tax;

public class Notebook extends Product implements Tax {
	private double storage;
	private String gpu;
	private String cpu;

	public Notebook(String name, double price, double storage, String gpu, String cpu) {
		super(name, price);
		this.storage = storage;
		this.gpu = gpu;
		this.cpu = cpu;
	}

	public double getStorage() {
		return storage;
	}

	public void setStorage(double storage) {
		this.storage = storage;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	@Override
	public String priceTag() {
		System.out.println("----[Notebook]----");
		return getName() + "$ " + String.format("%.2f", getPrice()) + " " + this.storage + " " + this.gpu + " "
				+ this.cpu;
	}

	@Override
	public void calcTax() {
		setTotal(getPrice() * 1.01);
	}
}

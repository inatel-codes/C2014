package br.inatel.model.entities;

import br.inatel.model.interfaces.Tax;

public class Tshirt extends Product implements Tax {
	private String color;
	private String size;

	public Tshirt(String name, double price, String color, String size) {
		super(name, price);
		this.color = color;
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String priceTag() {
		return getName() + "$ " + String.format("%.2f", getPrice()) + " " + this.color + " " + this.size;
	}

	@Override
	public void calcTax() {
		setTotal(getPrice() * 1.10);
	}
}

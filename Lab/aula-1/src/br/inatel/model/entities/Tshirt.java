package br.inatel.model.entities;

public class Tshirt extends Product{
	private String color;
	private String size;
	
	public Tshirt(String name, double price, String color, String size) {
		super(name, price);
		this.color = color;
		this.size = size;
	}

	@Override
	public String priceTag() {
		return getName() + "$ " + String.format("%.2f", getPrice()) + " " + this.color +  " " + this.size;
	}
}

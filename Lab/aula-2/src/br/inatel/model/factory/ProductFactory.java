package br.inatel.model.factory;

import br.inatel.model.entities.Camiseta;
import br.inatel.model.entities.Notebook;

public class ProductFactory {
	public static Notebook createNotebook() {
		return new Notebook("Dell", 3500, 1000, "GTX 1050", "Intel Core i5");
	}
	
	public static Camiseta createCamiseta() {
		return new Camiseta("Camiseta Nike", 80, "Preta", "P");
	}
}

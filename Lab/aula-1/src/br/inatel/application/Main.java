package br.inatel.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.inatel.model.entities.Notebook;
import br.inatel.model.entities.Product;
import br.inatel.model.entities.Tshirt;

public class Main {

	public static void main(String[] args) {
		Product product = new Product("Iphone XR", 2999.99);
		
		// Upcasting
		Product notebook = new Notebook("Dell", 3500, 1000, "GTX 1050", "core i5");
		Product tshirt = new Tshirt("Camiseta Nike", 80, "Preta", "P");
		
		// Downcasting
		if(notebook instanceof Notebook) {
			Notebook notebookAux = (Notebook) notebook;
			notebookAux.setCpu("core i7");
			notebookAux.calcTax();
		}
		if(tshirt instanceof Tshirt) {
			Tshirt tshirtAux = (Tshirt) tshirt;
			tshirtAux.setColor("Vermelha");
			tshirtAux.calcTax();
		}
		
		System.out.println(notebook.getTotal());
	}

}

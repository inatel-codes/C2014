package br.inatel.application;

import br.inatel.model.entities.Camiseta;
import br.inatel.model.entities.Notebook;
import br.inatel.model.entities.Produto;
import br.inatel.model.factory.ProductFactory;

public class Programa {

	public static void main(String[] args) {
		Produto notebook = ProductFactory.createNotebook();
		Produto camiseta = ProductFactory.createCamiseta();
		
		notebook.calculaTaxa();
		camiseta.calculaTaxa();
		
		System.out.println(notebook.etiquetaPreco());
		System.out.println(camiseta.etiquetaPreco());
		
		if(notebook instanceof Notebook) {
			Notebook notebookAux = (Notebook) notebook;
			notebookAux.setProcessador("Intel core i7");
		}
		if(camiseta instanceof Camiseta) {
			Camiseta camisetaAux = (Camiseta) camiseta;
			camisetaAux.setCor("Vermelha");
		}
		
		System.out.println(notebook.etiquetaPreco());
		System.out.println(camiseta.etiquetaPreco());
	}

}

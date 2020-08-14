package br.inatel.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.inatel.model.entities.Notebook;
import br.inatel.model.entities.Product;
import br.inatel.model.entities.Tshirt;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Product> products = new ArrayList<>();

		System.out.println("Order number: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1));
			System.out.println("Notebook or Tshir? (n/t)");
			char type = sc.next().charAt(0);
			
			sc.nextLine();
			
			System.out.println("Wirte the product name: ");
			String name = sc.nextLine();
			
			System.out.println("Write the product price: ");
			double price = sc.nextDouble();
			
			if(type == 'n') {
				System.out.println("Write the notebook storage");
				double storage = sc.nextDouble();
				
				sc.nextLine();
				
				System.out.println("Write the notebook gpu");
				String gpu = sc.nextLine();
				
				System.out.println("Write the notebook cpu");
				String cpu = sc.nextLine();
				
				Notebook notebook = new Notebook(name, price, storage, gpu, cpu);
				products.add(notebook);
			}else {
				sc.nextLine();
				
				System.out.println("Write the tshirt color");
				String color = sc.nextLine();
				
				System.out.println("Write the tshirt size");
				String size = sc.nextLine();
				
				products.add(new Tshirt(name, price, color, size));
			}
		}
		
		System.out.println();
		System.out.println("Tags: ");
		for(Product product : products) {
			product.priceTag();
		}
	}

}

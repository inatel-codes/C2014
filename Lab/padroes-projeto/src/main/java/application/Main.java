package application;

import adapter.model.entities.AdaptadorLG;
import adapter.model.entities.AdaptadorSamsung;
import adapter.model.entities.Controle;
import adapter.model.entities.ProjetorLG;
import adapter.model.entities.ProjetorSamsung;

public class Main {

	public static void main(String[] args) {
		Controle controle = new Controle();
		
		controle.init(new AdaptadorSamsung(new ProjetorSamsung()));
		controle.init(new AdaptadorLG(new ProjetorLG()));
	}

}

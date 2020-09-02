package br.inatel.cdg.inimigo;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaInimigo {
	private InimigoService inimigoService;

	public BuscaInimigo(InimigoService service) {
		this.inimigoService = service;
	}

	public Inimigo buscaInimigo(int id) {
		String inimigoJson = inimigoService.busca(id);

		JsonObject jsonObject = JsonParser.parseString(inimigoJson).getAsJsonObject();

		return new Inimigo(jsonObject.get("nome").getAsString(), jsonObject.get("arma").getAsString(),
				jsonObject.get("vida").getAsDouble());
	}
}

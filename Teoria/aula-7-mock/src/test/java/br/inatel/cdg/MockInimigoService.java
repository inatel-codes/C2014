package br.inatel.cdg;

import br.inatel.cdg.inimigo.InimigoService;

public class MockInimigoService implements InimigoService {

	@Override
	public String busca(int id) {
		if (id == 23)
			return InimigoConst.RINGED_KNIGHT;
		
		return InimigoConst.HOLLOW;
	}

}

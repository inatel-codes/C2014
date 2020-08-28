package br.inatel.cdg;

import java.util.HashMap;

public class Varredor {

	public void varrerAsync(Resultado res) {
		new Thread(() -> {
			res.setResultado(varrerSync());
		}).start();
	}
	
	public boolean varrerSync() {
		HashMap<Integer, Integer> mapa = new HashMap<Integer, Integer>();

		for (int i = 0; i < 10000; i++)
			mapa.put(i, i);

		mapa.forEach((k, v) -> mapa.get(k));
		
		return true;
	}
}

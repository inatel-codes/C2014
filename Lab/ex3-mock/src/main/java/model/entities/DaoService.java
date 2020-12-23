package model.entities;

import java.util.ArrayList;
import java.util.List;

import model.interfaces.DaoRepository;

public class DaoService {

	private DaoRepository daoRepository;
	private List<String> pessoas;
	
	public DaoService(DaoRepository daoRepository) {
		pessoas = new ArrayList<String>();
		this.daoRepository = daoRepository;
	}

	public void insert(String nome) {
		daoRepository.insert(nome);
		pessoas.add(nome);
	}

	public String delete(int id) {
		return daoRepository.deleteById(id);
	}

	public String find(int id) {
		return daoRepository.findById(id);
	}

	public List<String> listAll() {
		return daoRepository.findAll();
	}

	public List<String> getPessoas() {
		return pessoas;
	}
}

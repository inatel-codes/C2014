package model.interfaces;

import java.util.List;

public interface DaoRepository {
	public void insert(String nome);
	public String findById(int id);
	public String deleteById(int id);
	public List<String> findAll();
}

package model.teste.entities;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import model.entities.DaoService;
import model.interfaces.DaoRepository;

@RunWith(MockitoJUnitRunner.class)
public class TesteDaoService {
	@Mock
	private DaoRepository daoRepository;
	
	@InjectMocks
	private DaoService daoService;
	
	@Test
	public void testeInsert() {
		daoService.insert("Alexander Augusto");
		Mockito.verify(daoRepository).insert("Alexander Augusto");
	}
	
	@Test
	public void testeDelete() {
		daoService.insert("Alexander Augusto");
		
		Mockito.when(daoRepository.deleteById(1)).thenReturn("Alexander Augusto");
		
		String pessoa = daoService.delete(1);
		assertEquals("Alexander Augusto", pessoa);
	}
	
	@Test
	public void testeFind() {
		daoService.insert("João Pedro");
		daoService.insert("Phyll");
		daoService.insert("Alexander Augusto");
		
		Mockito.when(daoRepository.findById(2)).thenReturn("Alexander Augusto");
		
		String pessoa = daoService.find(2);
		assertEquals("Alexander Augusto", pessoa);
	}
	
	@Test
	public void testeFindAll() {
		daoService.insert("João Pedro");
		daoService.insert("Phyll");
		daoService.insert("Alexander Augusto");
		
		Mockito.when(daoRepository.findAll()).thenReturn(daoService.getPessoas());
		
		List<String> pessoas = daoService.listAll();
		assertEquals(3, pessoas.size());
	}
}

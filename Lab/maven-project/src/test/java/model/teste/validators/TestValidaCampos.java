package model.teste.validators;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.times;

import model.entities.RendaFixa;
import model.entities.validators.RendaFixaService;
import model.interfaces.RendaFixaRepository;

@RunWith(MockitoJUnitRunner.class)
public class TestValidaCampos {
	
	private RendaFixa rendaFixaValida;
	private RendaFixa rendaFixaInvalida;
	
	@Mock RendaFixaRepository rendaFixaRepository;
	
	@InjectMocks
	private RendaFixaService rendaFixaService;
	
	@Before
	public void beforeTest() {
		rendaFixaValida = new RendaFixa("Tesouro Selic 2025", new Date(), 78.65, 50, "20/10/2025", 2.75);
		rendaFixaInvalida = new RendaFixa(null, new Date(), 78.65, 50, "20/10/2025", 2.75);
	}
	
	@Test
	public void testeSalvoComSucesso() {
		rendaFixaService.insert(rendaFixaValida);
		Mockito.verify(rendaFixaRepository, times(1)).save(rendaFixaValida);
	}
	
	@Test(expected = Exception.class)
	public void testCampoObrigatorio() {
		rendaFixaService.insert(rendaFixaInvalida);
	}
}

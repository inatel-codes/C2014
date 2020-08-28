import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.inatel.cdg.Varredor;

public class VarredorTeste {
	
	@Test
	public void testeSync() {
		Varredor varrer = new Varredor();
		
		assertTrue(varrer.varrerSync());
	}
}

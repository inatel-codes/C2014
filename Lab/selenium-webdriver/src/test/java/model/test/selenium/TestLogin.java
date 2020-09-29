package model.test.selenium;

import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import model.entities.Login;

public class TestLogin {
	
	private Login login;
	private String result;
	
	@Before
	public void beforeTest() {
		login = new Login();
	}
	
	@Test
	public void testeLogin() {
		boolean loginRealizado = true;
		
		String esperado = "Seu email ou senha estão incorretos";
		result = login.loginOverleaf("joao@gmail.com", "123");
		
		if(result.contains(esperado)) {
			loginRealizado = false;
		}
		
		assertFalse(loginRealizado);
	}
}

package model.entities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	private WebDriver driver;
	
	public Login() {
		driver = new ChromeDriver();
	}
	
	public String loginOverleaf(String email, String senha) {
		driver.get("https://pt.overleaf.com/login");
		
		// Elementos
		WebElement campoEmail = driver.findElement(By.name("email"));
		WebElement campoSenha = driver.findElement(By.name("password"));
		WebElement botaoLogin = driver.findElement(By.xpath("/html/body/div/main/div/form/div[3]/button"));
		WebElement resultadoLogin = driver.findElement(By.xpath("/html/body/div/main/div/form/form-messages/div[1]"));
		
		campoEmail.sendKeys(email);
		campoSenha.sendKeys(senha);
		
		botaoLogin.click();
		
		String result = resultadoLogin.getText();
		
		driver.quit();
		
		return result;
	}
}

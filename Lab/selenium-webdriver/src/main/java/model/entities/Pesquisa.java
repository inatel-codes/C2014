package model.entities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pesquisa {
	
	private WebDriver driver;
	private String title;
	
	public Pesquisa() {
		System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
		driver = new ChromeDriver();
	}
	
	public String pesquisaGoogle(String palavra) {
		driver.get("http://www.google.com.br");
		WebElement campoPesquisa = driver.findElement(By.id("fakebox-input"));
		campoPesquisa.clear();
		campoPesquisa.sendKeys(palavra);
		
		title = driver.getTitle();
		System.out.println(title);
		
		campoPesquisa.submit();
		
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver objDriver) {
				return objDriver.getTitle().toLowerCase().startsWith("Engenharia".toLowerCase());		}
		});
		
		title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
		
		return title;
	}
}

package br.com.caelum.teste;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	
	public class NaoDeveAdicionarUsuarioSemNome {
		
		
		@Test
		public void naoAdicionarUmUsuarioSemNome() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\X107937\\Desktop\\Alura\\drivers Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8080/usuarios/new");
		
		WebElement email = driver.findElement(By.name("usuario.email"));
		
		email.sendKeys("ronaldo2009@terra.com.br");
		email.submit();
		assertTrue(driver.getPageSource().contains("Nome Obrigatório"));
		
		driver.close();
		}
	}


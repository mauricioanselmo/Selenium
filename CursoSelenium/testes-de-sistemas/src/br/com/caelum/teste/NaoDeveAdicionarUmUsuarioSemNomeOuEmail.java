package br.com.caelum.teste;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class NaoDeveAdicionarUmUsuarioSemNomeOuEmail {

	private ChromeDriver driver; 
	
	
	@Before
	public void inicializa() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void NaoDeveAdicionarUmUsuarioSemNomeOuEmail() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\X107937\\Desktop\\Alura\\drivers Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("http://localhost:8080/usuarios/new");

    WebElement email = driver.findElement(By.name("usuario.email"));
    email.submit();

    assertTrue(driver.getPageSource().contains("Nome obrigatorio!"));
    assertTrue(driver.getPageSource().contains("E-mail obrigatorio!"));

    driver.close();

	}
}
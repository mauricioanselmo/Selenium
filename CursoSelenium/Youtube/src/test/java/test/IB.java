package test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


class IB {

	//Instanciando a classe WebDriver
	
	static WebDriver driver;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.santander.com.br");
	}


	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		WebElement cpf = driver.findElement(By.className("login login-simple-field"));
		cpf.sendKeys("2603379984");
	}

}

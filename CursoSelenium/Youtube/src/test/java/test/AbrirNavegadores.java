package test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class AbrirNavegadores {
	
	//Instanciando a classe WebDriver
	static WebDriver driver;
	static WebDriver driverF;
	//dizer onde está o executável
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\X107937\\Desktop\\Alura\\drivers Selenium\\chromedriver.exe");
		System.setProperty("webDriver.gecko.driver", "C:\\Users\\X107937\\Desktop\\Alura\\drivers Selenium\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com.br");
		WebDriver driverF = new FirefoxDriver();
		driverF.get("http://www.uol.com.br");
		
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();
		driverF.close();
	
		
		
	}

}

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class TesteAutomatizado {

	    public static void main(String[] args) { 
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\X107937\\Desktop\\Alura\\drivers Selenium\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://www.google.com/");
	        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	        WebElement q = driver.findElement(By.name("q"));
	        q.sendKeys("Perpetuo Rodrigues Peixinho");
	        q.submit();
//	        WebElement image = driver.findElement(By.ByClassName.name("q qs"));
//	        image.click();
	    }

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TesteAutomatizado {

    public static void main(String[] args) {
        // abre firefox
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\X107937\\Desktop\\S2M\\chromedriver.exe");
        WebDriver driver = new chromedriver();

        // acessa o site do google
        driver.get("http://www.google.com.br/");

        // digita no campo com nome "q" do google
        WebElement campoDeTexto = driver.findElement(By.name("q"));
        campoDeTexto.sendKeys("Caelum");

        // submete o form
        campoDeTexto.submit();

    }
}
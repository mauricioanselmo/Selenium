package br.com.caelum.teste;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsuariosSystemTest {

	private WebDriver driver; 
	private UsuariosPage usuarios;
	
	@Before
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\X107937\\Desktop\\Alura\\drivers Selenium\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.usuarios = new UsuariosPage(driver);
		
		//Visitamos a pagina de usuarios
		usuarios.visita();
	}
	
	@Test
    public void deveDeletarUmUsuario() {

        usuarios.novo().cadastra("Ronaldo Luiz de Albuquerque", "ronaldo2009@terra.com.br");
        assertTrue(usuarios.existeNaListagem ("Ronaldo Luiz de Albuquerque", "ronaldo2009@terra.com.br"));

        usuarios.deletaUsuarioNaPosicao(1);

        assertFalse(usuarios.existeNaListagem("Ronaldo Luiz de Albuquerque", "ronaldo2009@terra.com.br"));
    }
	
	@Test
	public void deveAdicionarUmUsuario() {
		
		usuarios.novo().cadastra("Ronaldo Luiz de Albuquerque", "ronaldo2009@terra.com.br");
		
		assertTrue(usuarios.existeNaListagem("Ronaldo Luiz de Albuquerque", "ronaldo2009@terra.com.br"));
	}
	
	@Test
    public void naoDeveAdicionarUmUsuarioSemNome() {

                NovoUsuarioPage form = usuarios.novo();

                form.cadastra("", "ronaldo2009@terra.com.br");

        assertTrue(form.validacaoDeNomeObrigatorio());        
    }
        
        @After
        public void encerra() {
            driver.close();
        }

}

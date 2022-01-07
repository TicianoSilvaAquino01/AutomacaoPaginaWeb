package eadIterasys;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class BuscaCurso {

	String url;
	WebDriver driver;

	@Before
	public void iniciar() {

		url = "https://www.iterasys.com.br";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ticiano\\OneDrive\\Documentos\\AUTOMACAO ITERASYS\\eadIterasys\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);

	}

	@After
	public void finalizar() {

		driver.quit();

	}

	@Dado("^que acesso o site da Iterasys$")
	public void que_acesso_o_site_da_Iterasys() throws Throwable {
		driver.get(url);
	}

	@Quando("consulto pelo {string}")
	public void consulto_pelo(String curso) throws Throwable {
		driver.findElement(By.id("searchtext")).clear();
		driver.findElement(By.id("searchtext")).sendKeys(Keys.chord(curso));
		// Tirar um print

		driver.findElement(By.id("searchtext")).sendKeys(Keys.ENTER);
	}

	@Entao("exibe uma lista com {string}")
	public void exibe_uma_lista_com(String curso) throws Throwable {
		assertEquals("Cursos › \"" + curso + "\"", driver.findElement(By.cssSelector("div.col-md-6")).getText());
		assertEquals("MATRICULE-SE  ", driver.findElement(By.cssSelector("span.comprar")).getText());

		System.out.println("Passo3 exibiu o curso na lista");
	}

	@Quando("clico em Matricule-se$")
	public void clico_em_Matricule_se() throws Throwable {
		driver.findElement(By.cssSelector("span.comprar")).click();

		System.out.println("Clicou em matricule-se");
	}

	@Entao("exibe o titulo do {string} e o valor {string}")
	public void exibe_o_titulo_do_e_o_valor(String curso, String valor) throws Throwable {
		assertEquals(curso, driver.findElement(By.cssSelector("span.item-title")).getText());
		assertEquals(valor, driver.findElement(By.cssSelector("span.new-price")).getText());
		System.out.println("Exibiu o titulo e o valor do curso");
	}

}
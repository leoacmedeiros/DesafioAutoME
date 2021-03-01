package pageObjects.login;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import core.BasePage;
import core.DriverFactory;


public class LoginComSucessoPage extends BasePage {

	public void acessarSignIn() {
		// Criei um método clicar que está em BasePage, ele servirá para todas as funções de .click(); 
		// Dentro desse método também tem o parâmetro by do selenium, usado para id, xpath, name...
		// Ele vai aguardar também até que o elemento esteja disponível para clicar
		clicar(By.xpath("//div//a[@class='login']"));
	}

	public void digitarEmail(String email) {
		escrever(By.id("email"), email);
	}

	public void digitarPassword(String passwd) {
		escrever(By.id("passwd"), passwd);
	}

	public void clicarBotaoSignIn() {
		clicar(By.id("SubmitLogin"));
	}

	public void validarUsuarioLogado() {
			esperarElementoFicarVisivel(By.xpath("//div[@class='header_user_info']//a//span"));
			boolean usuario = DriverFactory.getDriver().findElement(By.xpath("//div[@class='header_user_info']//a//span")).getText().contains("Leonardo Medeiros");
			Assertions.assertTrue(usuario);
					
	}

	
	
	
	
	
	
}

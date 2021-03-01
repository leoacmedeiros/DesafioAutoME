package pageObjects.login;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import core.BasePage;
import core.DriverFactory;


public class LoginInvalidoPage extends BasePage {

	
	public void validarMensagemAutenticacao() {
		esperarElementoFicarVisivel(By.xpath("//li[contains(text(),'Authentication failed.')]"));
		boolean validarMsg = DriverFactory.getDriver().findElement(By.xpath("//li[contains(text(),'Authentication failed.')]")).getText().contains("Authentication failed.");
		Assertions.assertTrue(validarMsg);
	}
	
	
}

package pageObjects.login;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import core.BasePage;
import core.DriverFactory;


public class LoginEmBrancoPage extends BasePage {

	public void digitarPassword(String passwd) {
		escrever(By.id("passwd"), passwd);
	}
	
	public void validarMensagemEmailRequirido() {
		esperarElementoFicarVisivel(By.xpath("//li[contains(text(),'An email address required.')]"));
		boolean validarMsg = DriverFactory.getDriver().findElement(By.xpath("//li[contains(text(),'An email address required.')]")).getText().contains("An email address required.");
		Assertions.assertTrue(validarMsg);
	}
	
	
}

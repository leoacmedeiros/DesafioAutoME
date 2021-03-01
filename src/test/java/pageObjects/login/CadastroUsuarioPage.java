package pageObjects.login;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import core.BasePage;
import core.DriverFactory;


public class CadastroUsuarioPage extends BasePage {

	public void acessarSignIn() {
		// Criei um método clicar que está em BasePage, ele servirá para todas as funções de .click(); 
		// Dentro desse método também tem o parâmetro by do selenium, usado para id, xpath, name...
		// Ele vai aguardar também até que o elemento esteja disponível para clicar
		clicar(By.xpath("//div//a[@class='login']"));
	}

	public void digitarEmail() {
		// Criei o método escrever, em BasePage, que será usado para escrever em todos os inputs. 
		// Ele vai ter uma espera, wait, para aguardar o elemento ficar visível na tela. Também terá uma função de limpar o input e enviar o sendkeys
		escrever(By.id("email_create"), gerarEmailRandomico());
		
	}

	public void cliqueCreateAccount() {
		clicar(By.id("SubmitCreate"));
	}

	public void validarCamposPreenchimento() {
		// Método para validar se o elemento está vísivel. Adicionando também um método de espera para aguardar o elemento ficar visível
		// Validação do Junit para validar se o elemento está presente na tela
		esperarElementoFicarVisivel(By.xpath("(//form[@id='account-creation_form']//div//h3[@class='page-subheading'])[1]"));
		boolean texto = DriverFactory.getDriver().findElement(By.xpath("(//form[@id='account-creation_form']//div//h3[@class='page-subheading'])[1]")).getText().contains("YOUR PERSONAL INFORMATION");
		Assertions.assertTrue(texto);
		//System.out.println(texto);
	}

	public void selecionarMr() {
		clicar(By.id("id_gender1"));
	}

	public void digitarFirstName(String firstName) {
		escrever(By.id("customer_firstname"), firstName);
	}

	public void digitarLastName(String lastName) {
		escrever(By.id("customer_lastname"), lastName);
	}

	public void digitarPassword(String password) {
		escrever(By.id("passwd"), password);
	}

	public void selecionarDateBirth() {
		// Criação do método (selecionarComboBoxIndice) para selecionar combobox por índice
		selecionarComboBoxIndice(By.id("days"), 5);
		selecionarComboBoxIndice(By.id("months"), 6);
		selecionarComboBoxIndice(By.id("years"), 32);
	}

	public void digitarCompany(String company) {
		escrever(By.id("company"), company);
	}

	public void digitarAddress(String address1) {
		escrever(By.id("address1"), address1);
	}

	public void digitarAddressLine2(String address2) {
		escrever(By.id("address2"), address2);
	}

	public void digitarCity(String city) {
		escrever(By.id("city"), city);
	}

	public void selecionarState() {
		selecionarComboBoxIndice(By.id("id_state"), 3);
	}

	public void digitarZipPostal(String postcode) {
		escrever(By.id("postcode"), postcode);
	}

	public void digitarAdditionalInfo(String other) {
		escrever(By.id("other"), other);
	}

	public void digitarHomePhone(String homePhone) {
		escrever(By.id("phone"), homePhone);
	}

	public void digitarMobilePhone(String mobilePhone) {
		escrever(By.id("phone_mobile"), mobilePhone);
	}

	public void digitarAddressFutureReference(String addressFutureReference) {
		escrever(By.id("alias"), addressFutureReference);
	}

	public void clicarRegister() {
		clicar(By.id("submitAccount"));
	}

	public void validarUsuarioCriado() {
		// Crianão de um método para esperar o elemento ficar visível e inserção de uma validação do junit 
		esperarElementoFicarVisivel(By.xpath("//div[@class='header_user_info']//a//span"));
		boolean usuario = DriverFactory.getDriver().findElement(By.xpath("//div[@class='header_user_info']//a//span")).getText().contains("Leonardo Medeiros");
		Assertions.assertTrue(usuario);
		
	}

	
	
	
	
	
}

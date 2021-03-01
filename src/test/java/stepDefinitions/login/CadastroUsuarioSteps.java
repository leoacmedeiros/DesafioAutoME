package stepDefinitions.login;

import core.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.login.AcessarSite;
import pageObjects.login.CadastroUsuarioPage;

public class CadastroUsuarioSteps extends BasePage{
	
	AcessarSite acessoURL = new AcessarSite(); // Instanciando a classe genérica para acesso a url 
	CadastroUsuarioPage cadastroUsuario = new CadastroUsuarioPage();

	@Dado("que acesse o site Automation Practice")
	public void queAcesseOSiteAutomationPractice() {
		acessoURL.acessarAutomationPractice();
	}

	@Dado("clique para se cadastrar")
	public void cliqueParaSeCadastrar() {
	    cadastroUsuario.acessarSignIn();
	}

	@Dado("digite o endereço de e-mail para iniciar o cadastro")
	public void digiteOEndereçoDeEMailParaIniciarOCadastro() {
	    cadastroUsuario.digitarEmail();
	}

	@Dado("clique em Create an account")
	public void cliqueEmCreateAnAccount() {
	    cadastroUsuario.cliqueCreateAccount();
	}

	@Então("irá aparecer os campos para preenchimento do cadastro de usário")
	public void iráAparecerOsCamposParaPreenchimentoDoCadastroDeUsário() {
	    cadastroUsuario.validarCamposPreenchimento();
	}

	@Então("preencha os dados do formulário de cadastro")
	public void preenchaOsDadosDoFormulárioDeCadastro(DataTable dataTable) {
		// Utilizando os dados inseridos na feature (CadastroUsuario.feature) para inserir nos inputs através das células e colunas (x,y)
		
	    cadastroUsuario.selecionarMr();
	    cadastroUsuario.digitarFirstName(dataTable.cell(1, 1));
	    cadastroUsuario.digitarLastName(dataTable.cell(2, 1));
	    cadastroUsuario.digitarPassword(geraSenha()); // Aqui eu criei um gerador de senha que está em BasePage.java
	    cadastroUsuario.selecionarDateBirth();
	    cadastroUsuario.digitarCompany(dataTable.cell(5, 1));
	    cadastroUsuario.digitarAddress(dataTable.cell(6, 1));
	    cadastroUsuario.digitarAddressLine2(dataTable.cell(7, 1));
	    cadastroUsuario.digitarCity(dataTable.cell(8, 1));
	    cadastroUsuario.selecionarState();
	    cadastroUsuario.digitarZipPostal(dataTable.cell(10, 1));
	    cadastroUsuario.digitarAdditionalInfo(dataTable.cell(11, 1));
	    cadastroUsuario.digitarHomePhone(dataTable.cell(12, 1));
	    cadastroUsuario.digitarMobilePhone(dataTable.cell(13, 1));
	    cadastroUsuario.digitarAddressFutureReference(dataTable.cell(14, 1));
	    
	}

	@Quando("clicar em Register")
	public void clicarEmRegister() {
	    cadastroUsuario.clicarRegister();
	}

	@Então("o usuário será criado")
	public void oUsuárioSeráCriado() {
	    cadastroUsuario.validarUsuarioCriado();
	    fecharBrowser();
	}
	
}

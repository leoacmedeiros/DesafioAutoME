package stepDefinitions.login;

import core.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.login.LoginComSucessoPage;

public class LoginComSucessoSteps extends BasePage{
	
	LoginComSucessoPage loginSucesso = new LoginComSucessoPage();
	
	@Dado("acesse a opção para logar")
	public void acesseAOpçãoParaLogar() {
	    loginSucesso.acessarSignIn();
	}

	@Dado("informe os dados de email e senha")
	public void informeOsDadosDeEmailESenha(DataTable dataTable) {
		loginSucesso.digitarEmail(dataTable.cell(0, 1));
		loginSucesso.digitarPassword(dataTable.cell(1, 1));
	}

	@Quando("clicar no botão Sign In")
	public void clicarNoBotãoSignIn() {
	    loginSucesso.clicarBotaoSignIn();
	}

	@Então("o usuário irá logar no sistema")
	public void oUsuárioIráLogarNoSistema() {
	    loginSucesso.validarUsuarioLogado();
	    fecharBrowser();
	}

	
	
}

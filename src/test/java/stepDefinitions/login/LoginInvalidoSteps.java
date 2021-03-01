package stepDefinitions.login;

import core.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.login.LoginInvalidoPage;

public class LoginInvalidoSteps extends BasePage{
	
	/*
	Só foi incluído um único método nessa classe porque os outros métodos 
	eu estou reaproveitando da feature LoginComSucesso, porque eles fazem a 
	mesma coisa, acessam os mesmo caminhos e clicam nos mesmos botões.
	
	Dado que acesse o site Automation Practice
    E acesse a opção para logar
    E informe os dados de email e senha
    Quando clicar no botão Sign In
     */
	
	LoginInvalidoPage loginInvalido = new LoginInvalidoPage();
	
	
	@Então("o site deverá exibir mensagem que a autenticação falhou")
	public void oSiteDeveráExibirMensagemQueAAutenticaçãoFalhou() {
	    loginInvalido.validarMensagemAutenticacao();
	    fecharBrowser();
	}

	
	
}

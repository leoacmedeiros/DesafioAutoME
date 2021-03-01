package stepDefinitions.login;

import core.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import pageObjects.login.LoginEmBrancoPage;

public class LoginEmBrancoSteps extends BasePage{
	
	/*
	Nesse caso só foi incluído dois métodos. 
	Estou reaproveitando os métodos e a feature do LoginComSucesso
	
	Dado que acesse o site Automation Practice
    E acesse a opção para logar
    Quando clicar no botão Sign In
     */
	
	LoginEmBrancoPage loginEmBranco = new LoginEmBrancoPage();
	
	@Dado("informe os dados apenas da senha")
	public void informeOsDadosApenasDaSenha(DataTable dataTable) {
	    loginEmBranco.digitarPassword(dataTable.cell(0, 1));
	}

	@Então("o site deverá exibir mensagem que email é um campo obrigatório para logar")
	public void oSiteDeveráExibirMensagemQueEmailÉUmCampoObrigatórioParaLogar() {
	    loginEmBranco.validarMensagemEmailRequirido();
	    fecharBrowser();
	}
	
	
}

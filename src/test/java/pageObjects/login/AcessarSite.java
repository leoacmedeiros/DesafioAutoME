package pageObjects.login;

import core.BasePage;
import core.DriverFactory;

public class AcessarSite extends BasePage {

	private static String SITE = "http://automationpractice.com";
	

	public void acessarAutomationPractice() {
		DriverFactory.getDriver().get(SITE);
	}
	

}

package runners.login;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
//		dryRun = true,
		strict = true
		,monochrome = true
		,stepNotifications = true
		,features = "src/test/resources/features/login/LoginComSucesso.feature"
		,glue = "stepDefinitions"
		,plugin = {"pretty","html:target/report-html/login/LoginComSucesso", "json:target/cucumber-reports/login/LoginComSucesso/LoginComSucesso.json"}
		,snippets = SnippetType.CAMELCASE
)

public class LoginComSucessoRunner {

}

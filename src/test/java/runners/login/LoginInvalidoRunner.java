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
		,features = "src/test/resources/features/login/LoginInvalido.feature"
		,glue = "stepDefinitions"
		,plugin = {"pretty","html:target/report-html/login/LoginInvalido", "json:target/cucumber-reports/login/LoginInvalido/LoginInvalido.json"}
		,snippets = SnippetType.CAMELCASE
)

public class LoginInvalidoRunner {

}

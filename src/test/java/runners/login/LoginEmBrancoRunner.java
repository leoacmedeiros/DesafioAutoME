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
		,features = "src/test/resources/features/login/LoginEmBranco.feature"
		,glue = "stepDefinitions"
		,plugin = {"pretty","html:target/report-html/login/LoginEmBranco", "json:target/cucumber-reports/login/LoginEmBranco/LoginEmBranco.json"}
		,snippets = SnippetType.CAMELCASE
)

public class LoginEmBrancoRunner {

}

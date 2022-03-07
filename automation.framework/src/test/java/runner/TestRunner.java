package runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.restassured.RestAssured;
import utils.GenericHelper;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
				 glue = "stepdefinitions",
				 snippets = SnippetType.CAMELCASE,
				 plugin = {"html:target/reports/cucumber-report.html", 
						 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				 dryRun = false
)

public class TestRunner {
	@BeforeClass
	public static void beforeExecution() {
		String env = GenericHelper.getProperty("global", "ENV");
		String url = GenericHelper.getProperty(env,"URL");
		System.out.println("URL = "+url);
		RestAssured.baseURI = url;
	}
}

package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/Features",
glue={"StepDefinitions"},
plugin = { "pretty", "html:target/reports.html", "json:target/reports/cucumber.json", "junit:target/reports.xml",}
)

public class Testrunner {

	
}

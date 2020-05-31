package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "resources/featureFiles", glue = "stepDefination",tags= {"@Run"}, 

plugin = {"pretty",
		"html:target/html/",
		"json:target/json/file.json"})

public class ExecRunner {

}

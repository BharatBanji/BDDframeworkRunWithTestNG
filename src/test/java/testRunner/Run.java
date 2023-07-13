package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {".//features"},
		glue="stepdefination",
		dryRun = true,
		monochrome = true,
		//tags = "@Sanity",//scenarios under @sanity tag will be executed
		plugin = {"pretty","html:target/cucumber-reports/reports_html.html"}
		)

//plugin = {"pretty","html:target/cucumber-reports/reports1.html"}
//		plugin = {"pretty","json:target/cucumber-reports/report_json.json"}

public class Run extends AbstractTestNGCucumberTests {
	/*This class will be empty*/
}

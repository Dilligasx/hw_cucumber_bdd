package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features=  "C:\\Users\\Admin\\Desktop\\Selenium\\Selenium_Eclipse\\HW_CUCUMBER_BDD\\src\\test\\java\\features",
		glue = "steps",
		tags= "@Scenario",
		monochrome=true,
		dryRun=false,
		plugin= {	
				"pretty",
                "json:target/cucumber-report/cucumber.json",
                "html:target/cucumber-report/cucumber.html"
		}
		)
public class HWLoginRunner {

}

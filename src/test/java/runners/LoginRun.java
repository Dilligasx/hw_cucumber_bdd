package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features=  "C:\\Users\\Admin\\Desktop\\Selenium\\Selenium_Eclipse\\HW_CUCUMBER_BDD\\src\\test\\java\\features",
		glue = "steps",
//		tags= "@OtherLogin2 or @Login1 or @OtherLoginFeature",
		tags= "@Feature1",
		monochrome=true,
		dryRun=false,
		plugin= {	
				"pretty",
				"html:target/cucumber",
				"json:target/cucumber.json",
                "json:target/cucumber-report/cucumber.json",
                "html:target/cucumber-report/cucumber.html"
		}
		)
public class LoginRun {

}

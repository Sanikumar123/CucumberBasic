package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src/test/java/features/Register.feature",  //---mention any scenario start line, then it will execute only that scenario
		glue="steps" ,dryRun=false
		//plugin = { "pretty", "html:target/cucumber-reports.html" })
		//plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class Runner extends AbstractTestNGCucumberTests{

}

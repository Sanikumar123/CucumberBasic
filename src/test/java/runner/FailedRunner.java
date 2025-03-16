package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "@target/failedrerun.txt",  //---mention any scenario start line, then it will execute only that scenario
		glue="steps"// ,dryRun=false//, tags="@smoke",
		//plugin={"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", "rerun:target/failedrerun.txt"}
		
		//plugin = { "pretty", "html:target/cucumber-reports.html" })
		//plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class FailedRunner extends AbstractTestNGCucumberTests{
	
	//tags="@reg or @smoke"
	//"@reg and not @smoke"
	
	
	//parallel execution
	/*
	 * @Override
	 * 
	 * @DataProvider(parallel=false) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 */

}

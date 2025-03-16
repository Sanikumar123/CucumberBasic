package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import utility.Testcontestsetup;

public class HooksClass {
	
	Testcontestsetup testcontestsetup;
	
	
	public HooksClass(Testcontestsetup testcontestsetup)
	{
		this.testcontestsetup=testcontestsetup;
	}
	
	

	
		@Before("not @reg")
		public void login(){
			testcontestsetup.object.getLaunchPageObject().clickLaunchPageLoginBtn();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			testcontestsetup.object.getLoginPageObject().Login(testcontestsetup.base.prop.getProperty("username"), testcontestsetup.base.prop.getProperty("password"));
			
		}
		
		
		@AfterStep
		public void addScreenshot(Scenario scenario)  {

			if(scenario.isFailed())
			{

			TakesScreenshot shot =(TakesScreenshot) testcontestsetup.driver;
			byte[] fileContent = shot.getScreenshotAs(OutputType.BYTES);
			scenario.attach(fileContent, "image/png", "screenshot");
			
			
			}
		}
			
		
		@After
		public void close()
		{
			testcontestsetup.driver.quit();
		}

	}




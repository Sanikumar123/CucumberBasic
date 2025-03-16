package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Testcontestsetup;

public class Loginpage {
	
	WebDriver driver;
	
	
Testcontestsetup testcontestsetup;
	
public Loginpage(Testcontestsetup testcontestsetup)
	{
		this.testcontestsetup=testcontestsetup;
	}
	
	@Given("Clicks on Login button")
	public void clicks_on_login_button() throws InterruptedException {
		
		testcontestsetup.object.getLaunchPageObject().clickLaunchPageLoginBtn();
		Thread.sleep(3000);
	   
	}
	@When("User enters UserName,Password and clicks on Login button")
	public void user_enters_user_name_password_and_clicks_on_login_button() throws InterruptedException {
		/*
		 * Thread.sleep(3000); testcontestsetup.driver.findElement(By.xpath(
		 * "//input[@formcontrolname='username']")).sendKeys("Sani234");
		 * testcontestsetup.driver.findElement(By.xpath(
		 * "//input[@formcontrolname='password']")).sendKeys("Sani12345");
		 * testcontestsetup.driver.findElement(By.xpath(
		 * "//span[normalize-space()='Login']")).click();
		 */
		
		//testcontestsetup.object.getLoginPageObject().Login(testcontestsetup.base.prop.getProperty("username"), testcontestsetup.base.prop.getProperty("password"));
	}
	@Then("user should be able see the username")
	public void user_should_be_able_see_the_username() {
		
		String username  =testcontestsetup.driver.findElement(By.xpath("//span[contains(text(),'Sani')]")).getText();
		Assert.assertEquals(" Sani234", username);
	    
	}

}

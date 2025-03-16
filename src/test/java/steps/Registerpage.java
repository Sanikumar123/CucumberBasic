package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Launch;
import pages.Login;
import pages.PageObjectManager;
import pages.Register;
import utility.Testcontestsetup;

public class Registerpage {
	
	WebDriver driver;
	Testcontestsetup testcontestsetup;
	Register register;
	PageObjectManager object;
	
	public Registerpage(Testcontestsetup testcontestsetup)
	{
		this.testcontestsetup=testcontestsetup;
	}
	
	/*
	 * @Given("User launches BookCart application") public void
	 * user_launches_book_cart_application() throws InterruptedException {
	 * 
	 * testcontestsetup.driver = new ChromeDriver();
	 * testcontestsetup.driver.manage().window().maximize();
	 * testcontestsetup.driver.get("https://bookcart.azurewebsites.net/");
	 * Thread.sleep(3000);
	 * 
	 * }
	 */
	
	
	@Given("Clicks on Login button and then clicks on Register button")
	public void clicks_on_login_button_and_then_clicks_on_register_button() throws InterruptedException {
		
		//Launch launch = new Launch(testcontestsetup.driver);
		//Login login = launch.clickLaunchPageLoginBtn();
		testcontestsetup.object.getLaunchPageObject().clickLaunchPageLoginBtn();
		Thread.sleep(3000);
		testcontestsetup.object.getLoginPageObject().clickLoginPageRegBtn();
		//register= login.clickLoginPageRegBtn();
		Thread.sleep(3000);
		
	    
	}
	@When("User enters FirstName, LastName, UserName, Password, ConfirmPwd, selects Gender")
	public void user_enters_first_name_last_name_user_name_password_confirm_pwd_selects_gender() throws InterruptedException {
		
		testcontestsetup.driver.findElement(By.xpath("//input[@formcontrolname='firstName']")).sendKeys("Sani");
		testcontestsetup.driver.findElement(By.xpath("//input[@formcontrolname='lastName']")).sendKeys("Kumar");
		testcontestsetup.driver.findElement(By.xpath("//input[@formcontrolname='userName']")).sendKeys("Sani1909");
		testcontestsetup.driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Sani12345");
		testcontestsetup.driver.findElement(By.xpath("//input[@formcontrolname='confirmPassword']")).sendKeys("Sani12345");
		testcontestsetup.driver.findElement(By.xpath("//input[@value='Male']")).click();
		
	    
	}
	
	
	@When("User enters {string}, {string}, {string}, {string}, {string}, selects Gender")
	public void user_enters_selects_gender(String fname, String lname, String uname, String pass, String cpass) {
	    
		register.registerUser(fname, lname, uname, pass, cpass);
		
	}
	
	@When("User enters required data and  selects Gender")
	public void user_enters_required_data_and_selects_gender(DataTable registrationDetails) {
	    
		List<List<String>> data = registrationDetails.asLists(String.class);
		
		driver.findElement(By.xpath("//input[@formcontrolname='firstName']")).sendKeys(data.get(0).get(0));
		driver.findElement(By.xpath("//input[@formcontrolname='lastName']")).sendKeys(data.get(0).get(1));
		driver.findElement(By.xpath("//input[@formcontrolname='userName']")).sendKeys(data.get(0).get(2));
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys(data.get(0).get(3));
		driver.findElement(By.xpath("//input[@formcontrolname='confirmPassword']")).sendKeys(data.get(0).get(4));
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
	}
	
	@When("clicks on Register button")
	public void clicks_on_register_button() throws InterruptedException {
	   
		//register.clickRegisterBtn();
		testcontestsetup.object.getRegisterPageObject().clickRegisterBtn();
	}
	@Then("Login page should display")
	public void login_page_should_display() {
		
		
		String expectedValue ="Login";
		String actualValue = testcontestsetup.driver.getTitle();
		Assert.assertEquals(expectedValue, actualValue);
	    
	}


}

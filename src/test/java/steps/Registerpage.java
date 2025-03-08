package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registerpage {
	
	WebDriver driver;
	
	@Given("User launches BookCart application")
	public void user_launches_book_cart_application() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bookcart.azurewebsites.net/");
		Thread.sleep(3000);
	    
	}
	@Given("Clicks on Login button and then clicks on Register button")
	public void clicks_on_login_button_and_then_clicks_on_register_button() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Register']")).click();
		Thread.sleep(3000);
		
	    
	}
	@When("User enters FirstName, LastName, UserName, Password, ConfirmPwd, selects Gender")
	public void user_enters_first_name_last_name_user_name_password_confirm_pwd_selects_gender() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@formcontrolname='firstName']")).sendKeys("Sani");
		driver.findElement(By.xpath("//input[@formcontrolname='lastName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@formcontrolname='userName']")).sendKeys("Sani284");
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Sani12345");
		driver.findElement(By.xpath("//input[@formcontrolname='confirmPassword']")).sendKeys("Sani12345");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
	    
	}
	@When("clicks on Register button")
	public void clicks_on_register_button() throws InterruptedException {
	    Actions action = new Actions(driver);
		WebElement register = driver.findElement(By.xpath("//button[contains(.,'Register')]"));
		action.moveToElement(register).click().perform();
		Thread.sleep(2000);
		register.click();
		Thread.sleep(3000);
	}
	@Then("Login page should display")
	public void login_page_should_display() {
		
		
		String expectedValue ="Login";
		String actualValue = driver.getTitle();
		Assert.assertEquals(expectedValue, actualValue);
	    
	}


}

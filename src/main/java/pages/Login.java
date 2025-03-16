package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Login page WebElements
		
		@FindBy(xpath="//span[normalize-space()='Register']")
		WebElement loginPgRegBtn;
		
		@FindBy(xpath="//input[@formcontrolname='username']")
		WebElement userName;
		
		@FindBy(xpath="//input[@formcontrolname='password']")
		WebElement pass;
		
		@FindBy(xpath="//span[normalize-space()='Login']")
		WebElement loginBtn;
		
		
		
		
		
		//Reusable methods
			
			public Register clickLoginPageRegBtn()
			{
				loginPgRegBtn.click();
				return new Register(driver);
			}
			
			public void Login(String username, String password){
				
				userName.sendKeys(username);
				pass.sendKeys(password);
				loginBtn.click();
				
				
			}

}

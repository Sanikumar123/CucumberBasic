package pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public Launch getLaunchPageObject()
	{
		Launch launch = new Launch(driver);
		return launch;
	}
	
	public Login getLoginPageObject()
	{
		Login login = new Login(driver);
		return login;
	}
	
	
	public Register getRegisterPageObject()
	{
		Register reg = new Register(driver);
		return reg;
	}
			

}

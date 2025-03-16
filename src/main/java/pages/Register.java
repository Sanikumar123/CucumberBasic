package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	
	WebDriver driver;
	
	public Register(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Register page webElements
	
	
	
	@FindBy(xpath="//input[@formcontrolname='firstName']")
	WebElement fName;

	@FindBy(xpath="//input[@formcontrolname='lastName']")
	WebElement lName;
	
	@FindBy(xpath="//input[@formcontrolname='userName']")
	WebElement uName;
	
	@FindBy(xpath="//input[@formcontrolname='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@formcontrolname='confirmPassword']")
	WebElement cnfPwd;
	
	@FindBy(xpath="//input[@value='Male']")
	WebElement gender;
	
	@FindBy(xpath="//button[contains(.,'Register')]")
	WebElement registerBtn;
	
	
	//Reusable methods
	
	public Login registerUser(String fname,String lname,String uname,String pwd, String cnfpwd)
	{
		fName.sendKeys(fname);
		lName.sendKeys(lname);
		uName.sendKeys(uname);
		password.sendKeys(pwd);
		cnfPwd.sendKeys(cnfpwd);
		gender.click();
		return new Login(driver);
	}
	
	public void clickRegisterBtn()
	{
		 Actions action = new Actions(driver);
			registerBtn.click();
			action.moveToElement(registerBtn).click().perform();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			registerBtn.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	
	
	
	
	

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Launch {
	
	WebDriver driver;
	
	public Launch(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Launch page WebElements
	@FindBy(xpath="//span[normalize-space()='Login']")
	WebElement launchPgLoginBtn;
	
	
	
	
	
	//Reusable methods
	
		public void clickLaunchPageLoginBtn()
		{
			launchPgLoginBtn.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			launchPgLoginBtn.click();
			
		}
		
		

}

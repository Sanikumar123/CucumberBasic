package utility;

import org.openqa.selenium.WebDriver;

import pages.PageObjectManager;

public class Testcontestsetup {
	
	public WebDriver driver;
	public PageObjectManager object;
	public TestBase base;
	
	public Testcontestsetup(){
		
		base = new TestBase();
		driver=base.setUp();
		object = new PageObjectManager(driver);
		
		
	}

}

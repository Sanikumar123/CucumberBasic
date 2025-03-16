package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	
	FileInputStream fin;
	public Properties prop;
	WebDriver driver;
	
	
	public WebDriver setUp()
	{
		
		try {
			fin= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\resources\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(fin);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			
		}
		
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return driver;
	}
	

	
	

}

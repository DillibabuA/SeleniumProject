package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	public static WebDriver Start(WebDriver driver,String browserName, String appurl)
	{
		if(browserName.equals("Chrome")) {
			driver=new ChromeDriver();
			
		}
	else if(browserName.equals("Firefox")) {
	 driver=new FirefoxDriver();
	 
	}
	else
	{
		System.out.println("we do not support this browser");
	}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(appurl);
		return driver;
		
	}
	public static void Quit(WebDriver driver)
	{
		driver.quit();
	}
	}


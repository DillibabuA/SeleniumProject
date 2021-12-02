package pageobjectmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OneLoginPage {
	
	public WebDriver driver;
//@Test
	//public  void LogiPage(WebDriver driver)
	//{
		//this.driver=driver;
	//}
	WebDriver driver=new ChromeDriver();  
    
	// Launch website  
	    driver.get("https://www.flipkart.com/");  
	    
	private By userNameTextBox = By.name("email");
	private By passwordTextBox = By.id("pass");
	private By signIn = By.name("login");
	public void Login(String userName ,String password , String signIn)
	{
		this.setUsernane(userName);
		this.setpassword(password);
		this.signclick(signIn);
		
	}
	public void setUsernane(String userName) {
		driver.findElement(userNameTextBox).sendKeys("7989067265");
		
	}
	public void setpassword(String password) {
		driver.findElement(passwordTextBox).sendKeys("Dilli@1234");
		
	}
	public void signclick(String signin) {
		driver.findElement(signIn).click();
	}
}

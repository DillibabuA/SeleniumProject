package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FramesNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.Chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().getImplicitWaitTimeout().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html"); 
	       // navigates to the page consisting an iframe

	       driver.findElement(By.id("name")).sendKeys("hello");
	       Thread.sleep(3000);
	       driver.switchTo().frame(driver.findElement(By.id("frm3")));
	       driver.switchTo().frame(driver.findElement(By.id("frm1")));
	       Select courseDD = new Select(driver.findElement(By.id("course")));
	       courseDD.deselectByVisibleText("java");
	       Thread.sleep(3000);
	       driver.switchTo().parentFrame();
	       driver.findElement(By.id("name")).clear();
	       driver.findElement(By.id("name")).sendKeys("hello");
	       driver.switchTo().defaultContent();
	       
	}

}


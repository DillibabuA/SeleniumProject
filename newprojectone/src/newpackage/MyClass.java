package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyClass {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			 // System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver_linux64 (2)\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.get("https://www.amazon.in/");
				//driver.findElement(By.id("inputusername")).sendKeys("7989067265");
				//driver.findElement(By.id("inputpassword")).sendKeys("dilli");
				


		}

	}


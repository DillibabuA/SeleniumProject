package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.w3schools.com/");
		Utils.CaptureScreenshot(driver,"Img.png");
		driver.findElement(By.xpath("//a[@id='navbtn_exercises']")).click();
		Utils.CaptureScreenshot(driver,"Imgtwo.jpg");
		driver.quit();
		
	}

}

package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpDr {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("http://spicejet.com");
		//driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000l);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		for(int i=1;i<5;i++) {
			driver.findElement(By.id("hreffincAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
	}

}

package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://the-internet.herokuapp.com/nested frames");
driver.switchTo().frame(driver.findElement(By.className("frame-top")));
driver.switchTo().frame(driver.findElement(By.className("frame-middle")));
System.out.println(driver.findElement(By.id("content")).getText());
	}

}

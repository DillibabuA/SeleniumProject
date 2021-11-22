

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Impli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
String[] itemsNeeded = {"cucumber","brocolli"};
driver.get("https://rahulshettyacademy.com/seleniumPractise/");
Thread.sleep(3000);
addItems(driver,itemmsNeeded);
driver.findElement(By.cssSelector("img[alt='cart']")).click();
driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());


}
	}



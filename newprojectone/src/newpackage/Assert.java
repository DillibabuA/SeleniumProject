package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assert {//pull the project

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("http://spicejet.com");
		//driver.findElement(By.id("divpaxinfo")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//no of checkboxes
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).getSize());
								driver.findElement(By.id("divpaxinfo")).click();
								Thread.sleep(2000l);
								System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
								
		
		for(int i=1;i<5;i++) {
			driver.findElement(By.id("hreffincAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
	
	}

	private static void assertEquals(String text, String string) {
		// TODO Auto-generated method stub
		
	}

	//        ntogithub update
}

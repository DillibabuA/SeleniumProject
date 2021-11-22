package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class trueAssert {

	public  void testAssertFunctions() {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.browserstack.com/");
		Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		assertTrue();
	}

	private void assertTrue(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
 
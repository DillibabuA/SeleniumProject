
package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLoc {

	public static void main(String[] args){
		//Setting the driver path
		//System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver.exe");
		
		//Creating WebDriver instance
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458755421&hvpos=&hvnetw=g&hvrand=14839785503396920823&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061642&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=EAIaIQobChMIiouf6cOh9AIVkYaRCh3kiQt0EAAYASAAEgLcAvD_BwE");
		
		//Navigate to we
	}
}

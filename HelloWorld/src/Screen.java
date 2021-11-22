

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("http://www.edureka.co/");
TakesScreenshot ts = (TakesScreenshot)driver;
File source = ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(source, new File("./Screenshots/Screen.png"));
System.out.println("the screenshot is taken");
driver.quit();
	}

}

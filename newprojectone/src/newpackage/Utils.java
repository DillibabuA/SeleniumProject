package newpackage;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {
public static void CaptureScreenshot(WebDriver driver,String fileName) {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File file = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("./Screenshots/"+fileName+""));
}
}

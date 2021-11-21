package newpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import io.github.bonigarcia.wdm.WebdriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//WebDriverManager.Chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/");
		driver.findElement(By.xpath("//a[@id='navbtn_exercises']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
		//File source = ts.getScreenshotAs(OutputType.FILE);
	//	FileUtils.copyFile(source, new File("./Screenshots/Image1.png"));
		//second method
		//String base64code = ts.getScreenshotAs(OutputType.BASE64);
		//byte[] by = Base64.getDecoder().decode(base64code);
		//FileOutputStream fos = new FileOutputStream(new File("./Screenshots/Imagetwo.png"));
		byte[] by = ts.getScreenshotAs(OutputType.BYTES);
		FileOutputStream fos = new FileOutputStream(new File("./Screenshots/ImageTHREE.jpeg"));
		fos.write(by);
		fos.close();
		
		
		
		driver.quit();
	}

}

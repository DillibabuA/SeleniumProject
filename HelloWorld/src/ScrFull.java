

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrFull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver  = new ChromeDriver();	

		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
				
		Screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);

		ImageIO.write(Screenshot.getImage(), "jpg", new File("c:\\ElementScreenshot.jpg"));
			
			

		


	}

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class WordpressLogin {

	
	@Test
	public void verifyValidLogin()
	{
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://wordpress.com/");
		driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F"); 
		//LoginPage lp = new LoginPage(driver);
		LoginPage page= PageFactory.initElements(driver, LoginPage.class);
         page.login("dillibabua",null,"Dilli@1234",null);
	

		/*lp.typeuserName1("dillibabua");
		lp.Continueone();
		lp.typePassword1("Dilli@1234");
		lp.clickOnLoginButton1();*/
		WebDriver driver1 = null;
		driver1.quit();
		
	}
}


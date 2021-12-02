
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage{
	public WebDriver driver;
	
public LoginPage(WebDriver driver) {
	this.driver = driver;

}

	private By userName = By.id("usernameOrEmail");
	private By ContinueButton=By.className("button form-button is-primary");
	private By password = By.id("password");
	private By loginButton = By.className("logIn");
	public WebDriver driver = new ChromeDriver();
	
	public void login(String uid,String continueclick,String pass,String signin) {
		this.typeuserName1(uid);
		this.Continueone();
		this.typePassword1(pass);
		this.clickOnLoginButton1();
		/*driver.findElement(userName).sendKeys(uid);
		driver.findElement(ContinueButton).click();
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
		*/
	}
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	
	}
		public void typeuserName1(String uid) {
			driver.findElement(userName).sendKeys(uid);
		}
		public void Continueone() {
			driver.findElement(ContinueButton).click();
		}
		public void typePassword1(String pass) {
			driver.findElement(password).sendKeys(pass);
		}
		public void clickOnLoginButton1() {
			driver.findElement(loginButton).click();
		}


	//	public void login(String uid, Object continueclick, String pass, Object signin) {
			// TODO Auto-generated method stub
			
		//}
	
	/*void clickOnLoginButton() {
		// TODO Auto-generated method stub

	}
	public void typePassword(String string) {
		// TODO Auto-generated method stub

	}
	public void typeuserName(String string) {
		// TODO Auto-generated method stub

	}*/

	
}

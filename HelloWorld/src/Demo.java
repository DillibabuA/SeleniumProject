
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello world");
	}//nkbbbkbk

}
import java.util.HashMap;//nkn nbjb
public class CollectionHm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<String, Integer> map = new HashMap<>();
		 
	       
	        map.put("king", 10);
	        map.put("suresh", 30);
	        map.put("vk", 20);
	        map.put("jill",100);
	       System.out.println("Size of map is:- " + map.size());
	        //for(Map.Entry  pairEntry: map.entrySet()) {
				//System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
			//}
	        	
	        
	        System.out.println(map);
	        if (map.containsKey("jill")) {
	 
	            // Mapping
	            Integer a = map.get("jill");
	            System.out.println("value for key"  + " \"jill\" is:- " + a);
	                              
	}

}
}
//linkedlist
import java.util.LinkedHashSet;
public class CollectionLs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> ls = 
                new LinkedHashSet<String>();  

// Adding element to LinkedHashSet  
ls.add("java");  
ls.add("is");  
ls.add("good");  
ls.add("not");
ls.add("java"); 
ls.add("platform");  

System.out.println("Size of LinkedHashSet = " + ls.size());
                       
System.out.println("Original LinkedHashSet:" + ls);  
System.out.println("Removing not from LinkedHashSet: " + ls.remove("not"));
System.out.println("Trying to Remove laptop which is not "+ "present: " + ls.remove("laptop"));
System.out.println("Checking if java is present=" + ls.contains("java"));    
System.out.println("Updated LinkedHashSet: " + ls);  
	}

}

normal method sele login
public void typeUserName() {
	driver.findElement(username).sendkeys("dillibabua");
}
public void typePassword() {
driver.findElement(password).sendkeys("dilli@1234");
}
public void clickOnLoginButton() {
driver.findElement(loginButton).click();

//parameter of selenium login

login.typeUserName("dillibabua");
login.typePassword();
login.clickOnLoginButton();




sohail  cotrrect of the LoginPagefor amazon page
package pageobjectmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageForAmazon {
WebDriver driver;
	
	public void LoginPage (WebDriver driver) {

		this.driver=driver;		
}
	private By userNameTextbox=By.id("ap_email");
	private By ContinueButton=By.id("continue");
	private By PasswordTextbox=By.id("ap_password");
	private By signInSubmit=By.id("signInSubmit");	
	
	
	public void Login(String userName , String Continue ,String password,String signIn) 
	{
	this.setUserName(userName);
	this.setContinue(Continue);
	this.setPassword(password);
	this.clicksignIn(signIn);

	}
	
	/*public void Login(String userName ,String password,String signIn) {
		this.setUserName(userName);
		
		this.setPassword(password);
		this.clicksignIn(signIn);
	}
	public void setUserName(String userName) {
	driver.findElement(userNameTextbox).sendKeys();
	}
public void setPassword(String password) {
	driver.findElement(PasswordTextbox).sendKeys("sohu7738");
	}
	 public void clicksignIn(String signIn) {
	 driver.findElement(signInSubmit).click();
}
*/
	
	public void setUserName(String userName) {
	driver.findElement(userNameTextbox).sendKeys(userName);
}
public void setContinue(String Continue) {
	driver.findElement(ContinueButton).click();
}
/*try {
Thread.sleep(2000);
}
catch( InterruptedException e) {}
}*/
public void setPassword(String password) {
	driver.findElement(PasswordTextbox).sendKeys(password);
	
}
 public void clicksignIn(String signIn) 
 {
	 driver.findElement(signInSubmit).click();
 }

}

***testcase the 
amazonwebpage
package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjectmodule.LoginPageForAmazon;
import utilities.BrowserFactory;

public class AmazonWebPage {
	WebDriver driver;
	//	public void Main() {
		//driver = BrowserFactory.Start(driver,"Chrome","https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		@Test
		//}
		public void LoginApp() 
		{
			driver = BrowserFactory.Start(driver,"Chrome","https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
			//driver =BrowserFactory.Start(driver, "Firefox", "https://www.facebook.com/");
		//driver.getTitle();
			LoginPageForAmazon loginPage=PageFactory.initElements(driver,LoginPageForAmazon.class);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	loginPage.Login("7989067265",null,"Dilli@1234",null);
	
	
	
	
		}
		
	}



package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaDr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	     driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|RSA|529579609614&s_kwcid=AL!1631!3!529579609614!e!!g!!make%20my%20trip&ef_id=Cj0KCQiA-eeMBhCpARIsAAZfxZBB85O6Sf7lYQiDWnIr6KA-PdGU0U10FsInZDroF7iACUXRybw7t5saAtz2EALw_wcB:G:s&gclid=Cj0KCQiA-eeMBhCpARIsAAZfxZBB85O6Sf7lYQiDWnIr6KA-PdGU0U10FsInZDroF7iACUXRybw7t5saAtz2EALw_wcB");
	  
	     driver.manage().window().maximize();
	     WebElement staticdropdown = driver.findElement(By.className("lbl_input latoBold appendBottom10"));
			Select dropdown = new Select(staticdropdown);
			dropdown.selectByIndex(2);
			System.out.println(dropdown.getFirstSelectedOption().getText());
	     // driver.findElement(By.className("lbl_input latoBold appendBottom10")).click();
	     //WebElement staticDropdown=driver.findElement(By.id("travellers"));

//	     Select dropdown = new Select(staticDropdown);
//        dropdown.selectByIndex(3);
	}

}

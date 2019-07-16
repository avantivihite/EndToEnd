package Automation.End2EndProject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginbuttonUtility {

	
	
	
	public void LoginButton(WebElement element , WebDriver driver)
	{
		
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		
		String script =  "return document.getElementById(\"login\").click()"; 
		
		js.executeScript("arguments[0].click();" ,element );
		
		
	}
}

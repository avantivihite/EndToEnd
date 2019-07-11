package Automation.End2EndProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class1 {

		
	
		
	
		
		public void Login()
		{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avanti\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
		}
		
		
	
		public static void main(String[] args) {
			
			Class1 c= new Class1();
			c.Login();
			
			
		}

}

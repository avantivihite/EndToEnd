package Automation.End2EndProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.LandingPage;

public class LandingPageclass {

			WebDriver driver;
			Properties prop = new Properties();
			
	        
				public void InvokeBrowser() throws IOException {
				
				
				
				FileInputStream FIS = new FileInputStream("C:\\Users\\cheta\\Eclipse workspace 3\\End2EndProject\\src\\main\\java\\Automation\\End2EndProject\\NewFile.properties");
					
				prop.load(FIS);
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avanti\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();

				prop.getProperty("Browser");
				prop.getProperty("URL");
					
					
					
				}
	        	
				
				
				
				
	        	/*LandingPage LandObj = new LandingPage(driver);
				PageFactory.initElements(driver, LandObj);
				
				LandObj.deliveryMenu().click();
				
				
				WebDriverWait wait = new WebDriverWait(driver, 7);
				wait.until(ExpectedConditions.visibilityOf(LandObj.Shoppinglink()));
				
				Actions action = new Actions(driver);
				action.moveToElement(LandObj.Shoppinglink()).click().perform();
			
				LandObj.button().click();
				*/
	}


		



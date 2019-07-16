package Automation.End2EndProject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CreateAccountPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class DemoClass  {

		@Test	
		public void PageNavigation() throws IOException
		{
			PM Obj = new PM();
			
			WebDriver driver =  Obj.Initialisedriver();
			
			
			
			//LoginObj.Forgotpasswordlink().click();
			//driver.navigate().back();
			//LoginObj.accountcreationlink().click();
			
			
			
			
			LandingPage LandObj = new LandingPage(driver);
			PageFactory.initElements(driver, LandObj);
			
			LandObj.deliveryMenu().click();
			
			
			WebDriverWait wait = new WebDriverWait(driver, 7);
			wait.until(ExpectedConditions.visibilityOf(LandObj.Shoppinglink()));
			
			Actions action = new Actions(driver);
			action.moveToElement(LandObj.Shoppinglink()).click().perform();
		
			//LandObj.button().click();
			
			
			
				LoginPage LoginObj = new LoginPage(driver);
				PageFactory.initElements(driver, LoginObj);
			
				//LoginPage LoginObj = PageFactory.initElements(driver, LoginPage.class);
			
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				LoginObj.SigIn().click();

				LoginObj.SigInlink().click();
				LoginObj.emailid().sendKeys("avanti.vihite@gmail.com");
				LoginObj.pwd().sendKeys("Avanti123!");
				LoginObj.checkbox().click();
				LoginObj.login().click();
			
			
				//work around on sign in button
				
				
				/*LoginbuttonUtility UObj = new LoginbuttonUtility();
				
					UObj.LoginButton(LoginObj.login(), driver);
		
				 WebDriverWait wait = new WebDriverWait(driver,10);
					wait.until(ExpectedConditions.elementToBeClickable(LoginObj.login()));
				
				 LoginObj.login().sendKeys(Keys.ENTER);
		
				  Actions action = new Actions(driver);
				    action.moveToElement(LoginObj.login()).click().build().perform();
				*/
			
				//LoginObj.Forgotpasswordlink().click();
				//driver.navigate().back();
				//LoginObj.accountcreationlink().click();
				
				
				//Create account page
				
				
				/*CreateAccountPage AccountpageObj = new CreateAccountPage(driver);
				
				PageFactory.initElements(driver, AccountpageObj);
				AccountpageObj.emailid().sendKeys("abc@gmail.com");
				AccountpageObj.firstname().sendKeys("John");
				AccountpageObj.lastname().sendKeys("white");
				AccountpageObj.phonenumber().sendKeys("1234567892");
				AccountpageObj.password().sendKeys("Hello123!");
				if (AccountpageObj.createaccount().isEnabled())
				{
					AccountpageObj.createaccount().click();
				}
				else    //phone--longInstruction
				{
					System.out.println(driver.findElement(By.id("phone--longInstruction")).getText());
					
				}
			*/
		
			
			
				                               
			
			
			
		}
		}
			

	                                                                                                                                                                                                                                                                                                       
package Automation.End2EndProject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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
			
			/*LoginPage LoginObj = new LoginPage(driver);
			PageFactory.initElements(driver, LoginObj);
			
			//LoginPage LoginObj = PageFactory.initElements(driver, LoginPage.class);
			
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			LoginObj.SigIn().click();

			LoginObj.SigInlink().click();
			LoginObj.emailid().sendKeys("Avanti");
			LoginObj.pwd().sendKeys("123");
			//LoginObj.login().click();
			LoginObj.checkbox().click();
			//Assert.assertTrue(LoginObj.checkbox().isSelected());
			LoginObj.Forgotpasswordlink().click();
		//driver.navigate().back();
			LoginObj.accountcreationlink().click();
			
			
			CreateAccountPage AccountpageObj = new CreateAccountPage(driver);
			
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
			
			LandingPage LandObj = new LandingPage(driver);
			PageFactory.initElements(driver, LandObj);
			
			LandObj.deliveryMenu().click();
			
			WebDriverWait wait = new WebDriverWait(driver, 7);
			
			
			Actions action = new Actions(driver);
			
			wait.until(ExpectedConditions.visibilityOf(LandObj.Shoppinglink()));
			action.moveToElement(LandObj.Shoppinglink()).click().perform();
		
			LandObj.button().click();
			
			
			
			//driver.navigate().to(url);
			//driver.switchTo().window("name").get
			//driver.getWindowHandle()
			
			
			
			
			
			
		}
		}
			

	                                                                                                                                                                                                                                                                                                       
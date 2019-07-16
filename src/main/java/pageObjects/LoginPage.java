package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver) {
    this.driver = driver;

    }
	
	
	@FindBy(xpath  = "//nav[@id='headerMain']//a[@id='account']")
	WebElement SignIn ;
	
	
	@FindBy(linkText = "Sign in")
	WebElement SignInlink ;
	
	
	
	@FindBy(css = "#username")
	WebElement Username ;
	
	
	@FindBy(css = "#password")
	WebElement Password ;
	

	@FindBy(css = "button[type='submit']")
	WebElement button ;

	
	@FindBy(xpath ="//label[@for='keepMeSignedIn']")    //id('RESULT_RadioButton-8_0')     //label[@for=\'RESULT_RadioButton-8_0\'
	WebElement checkbox;
	
	@FindBy (css = "#recoveryPassword")
	WebElement Forgotpasswordlink;

	@FindBy (xpath ="//button[@id='createAccount']")
	WebElement accountcreationlink;
	

	
	public WebElement SigIn()
	{
		return SignIn;
	}
	
	
	public WebElement SigInlink()
	{
		return SignInlink;
	}
	
	public WebElement emailid()
	{
		return Username;
	}
	
	public WebElement pwd()
	{
		return Password;
	}
	
	public WebElement login()
	{
		return button;
	}
	
	
	public WebElement checkbox()
	{
		return checkbox;
	}
	
	public WebElement Forgotpasswordlink()
	{
		return Forgotpasswordlink;
	}
	
	public WebElement accountcreationlink()
	{
		return accountcreationlink;
	}
	
	
	
	
}


package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage {

	WebDriver driver;
	public CreateAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	
	@FindBy (id ="username")
	WebElement emailid;
	
	
	@FindBy (id ="firstname")
	WebElement firstname;
	
	@FindBy (id ="lastname")
	WebElement lastname;
	
	@FindBy (id ="phone")
	WebElement phonenumber;
	
	@FindBy (id ="password")
	WebElement password;

	@FindBy (id ="createAccount")
	WebElement button;
	
	

	public WebElement emailid() {
		return emailid;
	}
	
	public WebElement firstname() {
	return firstname;
	}
	
	public WebElement lastname() {
	return lastname;
	}
	
	public WebElement phonenumber() {
	return phonenumber;
	}
	
	public WebElement password() {
	return password;
	}
	
	
	public WebElement createaccount() {
		return button;
		}
		
	
	
	
	
	
}

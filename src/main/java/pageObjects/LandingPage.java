package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

	WebDriver driver;

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		
		
	}
	
	
	@FindBy (css = "a[href='#sameDayDeliveryMenu']")
	WebElement deliveryMenu;
	
	@FindBy (xpath = "//div[contains(text(),'Start Shopping')]")
	WebElement Shoppinglink;
	
	@FindBy (xpath = "//div[@id='385']//button[@class='Button-bwu3xu-0 hQWGxc'][contains(text(),'+')] ")
	WebElement plusbutton;
	
	@FindBy (css = "//label[@for='Baby']")
	WebElement label;
	
	

	public WebElement deliveryMenu() {
		return deliveryMenu;
	}
	
	public WebElement Shoppinglink() {
		return Shoppinglink;
	}
	
	public WebElement button(){
		return plusbutton;
	}
	
	public WebElement label() {
		return label;
	}
	
}

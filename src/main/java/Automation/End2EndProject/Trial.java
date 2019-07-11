package Automation.End2EndProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {

	WebDriver driver;
	Properties prob = new Properties();
	
//	public Trial () throws IOException
//	{
//		FileInputStream FIS = new FileInputStream("C:\\Users\\cheta\\Eclipse workspace 3\\End2EndProject\\src\\main\\java\\Automation\\End2EndProject\\NewFile.properties");
//		prob.load(FIS);
//
//		
//	}

	public Trial() throws IOException {

		FileInputStream FIS = new FileInputStream("C:\\Users\\cheta\\Eclipse workspace 3\\End2EndProject\\src\\main\\java\\Automation\\End2EndProject\\NewFile.properties");
		prob.load(FIS);
		
		prob.getProperty("Browser");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avanti\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(prob.getProperty("URL"));

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
}

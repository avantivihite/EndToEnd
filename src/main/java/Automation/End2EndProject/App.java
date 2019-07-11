package Automation.End2EndProject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       
    }
    
    
    public class BaseClass {
    	
    	public WebDriver driver;
    	

    	public WebDriver InitializeDriver() throws IOException
    	{
    		
    		PropertyManager propertyManager = new PropertyManager();
    		
    		
    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avanti\\chromedriver.exe");
    		WebDriver driver = new ChromeDriver();

    		driver.manage().window().maximize();
    			
    		String name = propertyManager.getProperty("URL");
    		
    		driver.get(name);
    		
    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    		driver.close();
    		
    		return driver;
    		
    	}
    	
    }
    
}


package Automation.End2EndProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class PropertyManager {
	
	Properties ProObj = new Properties();
	
	public PropertyManager() throws IOException {
		
		FileInputStream FIS = new FileInputStream("C:\\Users\\cheta\\Eclipse workspace 3\\End2EndProject\\src\\main\\java\\Automation\\End2EndProject\\NewFile.properties");
		
		ProObj.load(FIS);
		
	}
	
	public String getProperty(String key) {
		
		return ProObj.getProperty(key);
	}
}

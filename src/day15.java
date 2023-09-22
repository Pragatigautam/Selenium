import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class day15 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		String path = "/Users/pragatigautam/eclipse-workspace/SeleniumTutorial/src/config.properties";
		try {
			FileInputStream fileInput = new FileInputStream(path);
			try {
				prop.load(fileInput);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			String url=prop.getProperty("baseUrl");
			String browser= prop.getProperty("browser");
			String username = prop.getProperty("username");
			String password = prop.getProperty("password");
			
			
			//writting back on properties file
			prop.put("city", "irving");
			FileOutputStream fileOutput = new FileOutputStream(path);
			
			//storing on the properties file
			try {
				prop.store(fileOutput, "This is a sample properties file.");
				
				if(browser.equals("chrome")) {
					ChromeDriver driver = new ChromeDriver();
					driver.get(url);
					
					driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
					driver.findElement(By.cssSelector("#password")).sendKeys(password);
					driver.findElement(By.cssSelector("#login-button")).click();
					
					if(driver.getCurrentUrl().contains("inventory")) {
						System.out.println("Test case passed.");
					}
					else {
						System.out.println("Test case failed.");
					}
					
					
					
					
				//for other broswers in case used	
				} else if (browser.equals("firefox")) {
					// code to setup firefox

				} else if (browser.equals("edge")) {
					// code to edge
				}
				
				
				
				
				
				
				
				
				
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}

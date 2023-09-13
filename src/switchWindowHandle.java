import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchWindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/index.html");
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.cssSelector("#contact-us > div > div.section-title > h1")).click();
		Set<String> windows =	driver.getWindowHandles();
		for(String window:windows) {
			System.out.println(window);
			
			if(!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}
		
		System.out.println(driver.getCurrentUrl());
		
		  driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("pragati"); 
		  driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("gautam"); 
		  driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("pragatigautam882@gmail.com");
		  driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("I am learning selenium.");
		  driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
		  
		  driver.switchTo().window(parentWindow);
		  System.out.println(driver.getCurrentUrl());
		   
	

	}

}

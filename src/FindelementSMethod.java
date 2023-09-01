import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelementSMethod {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		
		
		//findElements() method
		//to identify a list of web elements within the web page.
		//to locate and retrieve a list of web elements on a webpage that 
		//match a specified set of criteria.
		//such as same tagName, ID, class etc.
		
		
		
		List<WebElement> el = driver.findElements(By.cssSelector("button"));
		System.out.println(el);
		
		for(WebElement el2:el) {
			System.out.println(el2.getText());
			
		}
		
		
//List<WebElement> elementName = driver.findElements(By.LocatorStrategy("LocatorValue"));	
		
//		List<WebElement> el = driver.findElements(By.xpath("//button"));
//		System.out.println(el);
//		
//		for(WebElement el2:el) {
//			System.out.println(el2.getText());
//			
//		}
	
	

	}

}







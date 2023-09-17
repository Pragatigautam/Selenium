package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Pt3 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		//invalid email format
		
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("Pragati");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("Gautam");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("Pragati10gmail.com");
		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("Hello selenium.");
		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
				
		boolean b2=driver.findElement(By.cssSelector("body")).isDisplayed();
				
		if(b2) {
			System.out.println("Test case passed.");
					
		}
		else {
			System.out.println("Test case failed.");
		}
		driver.quit();

	}

}

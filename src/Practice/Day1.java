package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.cssSelector("#user-name"));
		WebElement password = driver.findElement(By.cssSelector("#password"));
		WebElement login = driver.findElement(By.cssSelector("#login-button"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		
		//Assertion
		WebElement A = driver.findElement(By.cssSelector("#header_container > div.primary_header > div.header_label > div"));
		boolean B1=A.isDisplayed();
		
		if(B1) {
			System.out.println("Test case passed.");
		}
		else {
			System.out.println("Test case failed.");
		}
		driver.quit();
	}

}

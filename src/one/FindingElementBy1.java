package one;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElementBy1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//By class name
		//WebElement element = driver.findElement(By.ClassName.(“”));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
				
						
		//by class
		driver.findElement(By.className("submit-button")).click();
				
		//by class
		boolean B7 = driver.findElement(By.className("app_logo")).isDisplayed();
		if(B7) {
			System.out.println("Test case with class name passed.");
		}
		else {
			System.out.println("Test case with class name failed.");
		}

	}

}

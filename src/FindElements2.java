import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		String expectedProduct = "Sauce Labs Backpack";
		
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		
		List<WebElement> items = driver.findElements(By.cssSelector(".inventory_item_name"));
		boolean product = false;
		for(WebElement items2:items) {
			if(items2.getText().equals(expectedProduct)) {
				product = true;
				break;
			}
		}
		if(product) {
			System.out.println("Product found and Test case passed.");
		}
		else {
			System.out.println("Product not found and test case failed.");
		}
		

	}

}

package one;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		
		driver.findElement(By.cssSelector("#react-burger-menu-btn")).click();
		
//   	works on condition instade of applying timeout on entire element
		
//		condition until then element is visible with that particular locator its going to wait
//		Also dinamic but will only apply on that specific element instate of all the element
//		pooling time 500ms
		
		WebDriverWait obj = new WebDriverWait(driver,Duration.ofSeconds(10));
		obj.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#logout_sidebar_link")));
		
		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
		
	}

}

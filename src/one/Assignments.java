package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//By cssSelector
		//WebElement element = driver.findElement(By.CSSselector (“”));
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		
		boolean B1 = driver.findElement(By.cssSelector("#header_container > div.primary_header > div.header_label > div")).isDisplayed();
		if(B1) {
			System.out.println("Test case for css selector passed.");
		}
		else {
			System.out.println("Test case for css selector failed.");
		}
		
		//By Xpath
		//WebElement element = driver.findElement(By.xpath(“”));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		boolean B2 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div")).isDisplayed();
		if(B2) {
			System.out.println("Test case for xpath passed.");
		}
		else {
			System.out.println("Test case for xpath failed.");
		}
		//driver.quit();
		
		
		//By Name
		//WebElement element = driver.findElement(By.name(“”));
		
			
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		
		boolean B3 = driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).isDisplayed();
		if(B3) {
			System.out.println("Test case for name is passed.");
		}
		else {
			System.out.println("Test case for name is failed.");
		}
		
		
		//By id
		//WebElement element = driver.findElement(By.id(“”));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		boolean B4 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).isDisplayed();
		if(B4) {
			System.out.println("Test case for id is passed.");
		}
		else {
			System.out.println("Test case for id is failed.");
		}
		
		//By Tag Name
		//WebElement frame = driver.findElement(By.tagName(“iframe”));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		
		boolean B5 = driver.findElement(By.tagName("button")).isDisplayed();
		if(B5) {
			System.out.println("Test case for Tag Name passed.");
		}
		else {
			System.out.println("Test case for Tag Name failed.");
		}
		
		//By class name
		//WebElement element = driver.findElement(By.ClassName.(“”));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
						
								
		//by class name
		driver.findElement(By.className("submit-button")).click();
						
		//by class name
		boolean B6 = driver.findElement(By.className("app_logo")).isDisplayed();
		if(B6) {
			System.out.println("Test case with class name passed.");
		}
		else {
			System.out.println("Test case with class name failed.");
		}
		
		
		
		
		// By Link Text
		//WebElement element = driver.findElement(By.LinkText.(“”));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		
		
		driver.findElement(By.linkText("Facebook")).click();
		
		//by link text
		driver.get("https://www.facebook.com/saucelabs");
		boolean B7 = driver.findElement(By.cssSelector("#login_popup_cta_form > div > div.x1xka2u1.xqfms19 > span > span")).isDisplayed();
		if(B7) {
			System.out.println("Test case with link text passed.");
		}
		else {
			System.out.println("Test case with link text failed.");
		}
		
		
		
		//PartialLinkText:
		//WebElement element = driver.findElement(By.PartialLinkText.(“”));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		
		
		driver.findElement(By.partialLinkText("Linke")).click();
		driver.get("https://www.linkedin.com/company/sauce-labs/");
		
		boolean B8 = driver.findElement(By.cssSelector("#organization_guest_contextual-sign-in > div > section > div > div > p")).isDisplayed();
		if(B8) {
			System.out.println("Test case with partial link text passed.");
		}
		else {
			System.out.println("Test case with partial link text failed.");
		}
		
		

	}

}

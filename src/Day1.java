import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {
		// Actions
		  // Selecting the element
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement username = driver.findElement(By.cssSelector("#user-name"));
		WebElement password = driver.findElement(By.cssSelector("#password"));
		WebElement login = driver.findElement(By.cssSelector("#login-button"));
		
		//writting on it
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		//to check output (Assertion)
		WebElement heading = driver.findElement(By.cssSelector("#header_container > div.primary_header > div.header_label > div"));
		if(heading.isDisplayed()) {
			System.out.println("Test case passed.");
		}
		else {
			System.out.println("Test case failed.");
		}
	}

}

//types of environment setup
//local dev staging canary production
//local test test4 test6 production
//Arrange  System.setProperty

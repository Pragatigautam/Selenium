import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		String expectedUrl = "inventory";
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		
		
		
		String actualUrl=driver.getCurrentUrl();
		if(actualUrl.contains(expectedUrl)) {
			System.out.println("Test Case passed.");
		}
		else {
			System.out.println("Test case failed.");
		}

	}

}

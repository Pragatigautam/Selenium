import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElement2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		
		boolean B1 = driver.findElement(By.cssSelector("#header_container > div.primary_header > div.header_label > div")).isDisplayed();
		if(B1) {
			System.out.println("Test case passed.");
		}
		else {
			System.out.println("Test case failed.");
		}
	}

}

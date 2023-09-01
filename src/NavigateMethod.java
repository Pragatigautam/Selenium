import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		//navigate() method
		//to navigate to particular webpage using url
		driver.navigate().to("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		boolean b = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2")).isDisplayed();
		if(b) {
			System.out.println("Test case passed.");
		}
		else {
			System.out.println("Test case failed.");
		}

	}

}

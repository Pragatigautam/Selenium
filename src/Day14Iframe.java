import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day14Iframe {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
		
		//Finding the iframe by ID
		//In dom searching "iframe" to check if there us iframe in the web page
		
//  	WebElement iframeEleByID = driver.findElement(By.cssSelector("#frame"));
//		driver.switchTo().frame(iframeEleByID);
//		boolean B1 = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a")).isDisplayed();
//		if(B1) {
//			System.out.println("Test case passed.");
//		}
//		else {
//			System.out.println("Test case failed.");
//		}
		
		
		//Finding the iframe by index.
		
		driver.switchTo().frame(0);
		boolean B2 = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a")).isDisplayed();
		if(B2) {
			System.out.println("Test case passed.");
		}
		else {
			System.out.println("Test case failed.");
		}
		
		
		//Switching back to main page/content.
		driver.switchTo().defaultContent();
		
		//Validating the title of the page inside iframe
		
		String S1 = driver.getTitle();
		if(S1.equals("WebDriver | IFrame")) {
			System.out.println("Test case passed.");
		}
		else {
			System.out.println("Test case failed.");
		}
		

	}

}

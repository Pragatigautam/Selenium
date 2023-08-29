import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Program2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		//positive testcase
		
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("Pragati");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("Gautam");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("Pragati10@gmail.com");
		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("Hello selenium.");
		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
		
		boolean b1=driver.findElement(By.cssSelector("#contact_reply > h1")).isDisplayed();
		
		if(b1) {
			System.out.println("Test case passed.");
			
		}
		else {
			System.out.println("Test case failed.");
		}
		
		

	}

}

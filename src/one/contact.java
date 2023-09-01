package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		//location find
		WebElement firstname = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		WebElement lastname= driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement email= driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement comment = driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement Reset = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)"));
		
		//sendKeys
		firstname.sendKeys("Pragati");
		lastname.sendKeys("Gautam");
		email.sendKeys("pragati@gmail.com");
		comment.sendKeys("hiii");
		
		Reset.click();
		
		String S1 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).getText();
		boolean B1 = S1.isEmpty();
		
		
		
		
		
		if(B1) {
			System.out.println("Test case passed.");
		}
		
		else {
			System.out.println("Test case failed.");
		}
		

	}

}

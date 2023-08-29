import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Prog1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		//Finding elements
		
		WebElement firstName = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		WebElement lastName = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement email = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement message = driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement reset_Button = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)"));
		
		
		//Writting on it
		
		firstName.sendKeys("Pragati");
		lastName.sendKeys("Gautam");
		email.sendKeys("pragatiiadhikari@gmail.com");
		message.sendKeys("This is my second selenium class.");
		
		// Clear Method
			//firstName.clear();
		
		// Click button
		//reset_Button.click();
		
		
		
		
		//getText method
		
		WebElement heading = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		String S1 = heading.getText();
		System.out.println(S1);
		
		
		
		
		
		
		
		

	}

}

package one;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("#start > button")).click();
		
		
		String S = driver.findElement(By.cssSelector("#finish > h4")).getText();
		System.out.println(S);
		
		
	

	}

}

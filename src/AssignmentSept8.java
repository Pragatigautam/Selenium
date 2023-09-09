import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class AssignmentSept8 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());

	}

}

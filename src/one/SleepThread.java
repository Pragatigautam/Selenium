package one;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepThread {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		
		driver.findElement(By.cssSelector("#react-burger-menu-btn")).click();
		
		//Exception handling for potential interruptedException 
		//that may occur when using the Thread.sleep() method. 
		
		//It doesn't have pooling time so it just sleeps for that amount of time 
		//to wait for the element to appear on the web page
		
		try {
            Thread.sleep(3000); 						// Sleep for 3 seconds i.e. 3k millisec
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         
		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
		
		
		
		
		
	}

}

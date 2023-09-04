package one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamPractice {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
//		List<WebElement> L1 =driver.findElements(By.className("input_error"));
//		L1.get(0).sendKeys("standard_user");
//		L1.get(1).sendKeys("secret_sauce");
//		
//		driver.findElement(By.cssSelector("#login-button")).click();
		
//		String A = driver.findElement(By.cssSelector("#root > div > div.login_logo")).getCssValue("font-family");
//		String B = driver.findElement(By.cssSelector("#root > div > div.login_logo")).getCssValue("font-size");
//		String C = driver.findElement(By.cssSelector("#root > div > div.login_logo")).getCssValue("line-height");
//		 Point D = driver.findElement(By.cssSelector("#root > div > div.login_logo")).getLocation();
//		System.out.println(A);
//		System.out.println(B);
//		System.out.println(C);
//		System.out.println(D);
		
		List<WebElement> a = driver.findElements(By.tagName("input"));
		a.get(0).sendKeys("standard_user");
		a.get(1).sendKeys("secret_sauce");
		a.get(2).click();
		
		
		
		

	}

}

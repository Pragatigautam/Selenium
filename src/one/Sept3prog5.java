package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sept3prog5 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		//validate the heading of the page
		
		WebElement heading=driver.findElement(By.cssSelector("#main-header > h1"));
		String headingTxt=heading.getText();
		System.out.println(headingTxt);

	}

}

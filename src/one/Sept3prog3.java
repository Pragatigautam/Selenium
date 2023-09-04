package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sept3prog3 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		//select orange and assert if it is checked.
		
		WebElement orange=driver.findElement(By.cssSelector("#radio-buttons > input[type=radio]:nth-child(7)"));
		orange.click();
		boolean B1 = orange.isSelected();
		if(B1==true) {
			System.out.println("Orange radio button is selected.");
		}
		

	}

}

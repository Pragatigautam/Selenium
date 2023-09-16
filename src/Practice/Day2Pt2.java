package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Pt2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		//is displayed method
				WebElement heading = driver.findElement(By.cssSelector("#main-header > h1"));
				boolean B1 = heading.isDisplayed();
				System.out.println(B1);
				
				//is enabled method for radio button
				WebElement radioB_one = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(1)"));
				boolean B2 = radioB_one.isEnabled();
				System.out.println(B2);
				
				
				
				WebElement radioB_two = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(3)"));
				boolean B3 = radioB_two.isEnabled();
				System.out.println(B3);
				
				//is selected method
				WebElement selectedBtn = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(5)"));
				boolean B4 = selectedBtn.isSelected();
				System.out.println(B4);
		
	}

}

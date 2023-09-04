package one;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sept3prog4 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		//from drop down select python and assert
		
		Select pyt = new Select(driver.findElement(By.cssSelector("#dropdowm-menu-1")));
		pyt.selectByVisibleText("Python");
		
		

		
		String selectedOption = pyt.getFirstSelectedOption().getText();
        if (selectedOption.equals("Python")) {
            System.out.println("Python is selected from the dropdown.");
        } else {
            System.out.println("Python is not selected from the dropdown.");
        }
		
		
		

	}

}

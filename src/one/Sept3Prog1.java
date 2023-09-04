package one;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sept3Prog1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		String expectedTitle="WebDriver | Dropdown Menu(s) | Checkboxe(s) | Radio Button(s)";
		String titleOfPage = driver.getTitle();
		
		if(expectedTitle.equals(titleOfPage)) {
		System.out.println("Test case passed.");
		}
		
		
		
		
		

	}

}

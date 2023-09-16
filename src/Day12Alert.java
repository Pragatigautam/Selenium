import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12Alert {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	//Test case 1
	driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
	String text=driver.switchTo().alert().getText();
	if(text.equals("I am a JS Alert")) {
		System.out.println("Test case for text passed.");
	}
	else {
		System.out.println("Test case for text failed.");
	}
	driver.switchTo().alert().accept();
	String S1=driver.findElement(By.cssSelector("#result")).getText();
	if(S1.equals("You successfully clicked an alert")) {
		System.out.println("Test case passed.");
	}
	else {
		System.out.println("Test case failed.");
	}
	
	
	
	
	

	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12Alertpt3 {

	public static void main(String[] args) {
		//Test case 3
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://the-internet.herokuapp.com/javascript_alerts");
				
				driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
				String text=driver.switchTo().alert().getText();
				if(text.equals("I am a JS Confirm")) {
					System.out.println("Test case for text passed.");
				}
				else {
					System.out.println("Test case for text failed.");
				}
				
				driver.switchTo().alert().dismiss();
				String S1=driver.findElement(By.cssSelector("#result")).getText();
				if(S1.equals("You clicked: Cancel")) {
					System.out.println("Test case passed.");
				}
				else {
					System.out.println("Test case for text failed.");
				}

	}

}

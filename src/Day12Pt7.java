import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12Pt7 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
		
		driver.findElement(By.cssSelector("#button4 > p")).click();
		String S1=driver.switchTo().alert().getText();
		
		//Validating alert is visible
		if(S1.equals("Press a button!")) {
			System.out.println("Alert is visible, Test case passed.");
		}
		else {
			System.out.println("Alert is not visible, Test case failed.");
		}
		//when Ok is clicked.
//		driver.switchTo().alert().accept();
//		String S2=driver.findElement(By.cssSelector("#confirm-alert-text")).getText();
//		if(S2.equals("You pressed OK!")) {
//			System.out.println("Test case passed.");
//		}
//		else {
//			System.out.println("Test case failed.");
	
			//when Cancled is clicked.
			driver.switchTo().alert().dismiss();
			String S3=driver.findElement(By.cssSelector("#confirm-alert-text")).getText();
			if(S3.equals("You pressed Cancel!")) {
				System.out.println("Test case passed.");
			}
			else {
				System.out.println("Test case failed.");
			}
		}
		
		
		
		

	}



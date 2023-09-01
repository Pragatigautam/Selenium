import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		//close() method
		//it closes that particular tab and if the browser only has one tab then it is same as quit
		performLogin(driver, "Pragati", "Gautam", "pragatigautam882@gmail.com", "Hey!!!");
		
		boolean b = driver.findElement(By.cssSelector("#contact_reply > h1")).isDisplayed();
		if(b) {
			System.out.println("Test case passed and tab is closed.");
		}
		else {
			System.out.println("Test case failed and tab is closed.");
		}
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
				
	}
	public static void performLogin(ChromeDriver driver, String firstName, String lastName, String email, String comments) {
        WebElement firstNameFiled = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
        WebElement lastNameFiled = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
        WebElement emailField = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
        WebElement commentsField = driver.findElement(By.cssSelector("#contact_form > textarea"));
        
        WebElement logIn= driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));

        firstNameFiled.sendKeys(firstName);
        lastNameFiled.sendKeys(lastName);
        emailField.sendKeys(email);
        commentsField.sendKeys(comments);
        logIn.click();
    }

}

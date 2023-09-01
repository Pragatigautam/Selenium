import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		
		//Quit() method
				//it closes the whole browser
				//with invalid email format
				driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
				performLogin(driver, "Pragati", "Gautam", "pragatigautamgmail.com", "Hey!!!");
				boolean b2 = driver.findElement(By.cssSelector("body")).isDisplayed();
				if(b2) {
					System.out.println("Error message is displayed and browser is quit.");
				}
				else {
					System.out.println("Test case failed and browser was quit.");
				}
				
				driver.quit();
		

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

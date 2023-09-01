import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		//findElement() method
		//to identify web element in the web page with unique tagName, attributes, cssSelector etc.
		
		WebElement el = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		String S = el.getText();
		System.out.println(S);
		
		
		

	}

}

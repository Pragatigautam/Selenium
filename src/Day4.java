import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		//using methods of web element
		
		//getText Method
		WebElement el= driver.findElement(By.cssSelector(".section_header"));
		String S1 = el.getText();
		System.out.println(S1);
		
		//getTagName method
		String S2 = el.getTagName();
		System.out.println(S2);
		
		//getAttribute here "name" is the value of whose attribute we want to get
		String S3 = el.getAttribute("name");
		System.out.println(S3);
		
		//getSize
		//to maximize the window to get actual size
		driver.manage().window().maximize(); 
		Dimension D1 = el.getSize();
		System.out.println(D1);
		
		//font-family, font-size and color
		//Dimension D2 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).getSize();
		 
		String S4 = el.getCssValue("font-family");
		String S5 = el.getCssValue("font-size");
		String S6 = el.getCssValue("color");
		
		//getLocation (which part of the web page the element is
		Point P = el.getLocation();
		System.out.println(P);
		
		//driver.quit();
		
		

	}

}

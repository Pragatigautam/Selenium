import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Program1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		//finging element with tagName to find the "CONTACT US" element
		//{in DOM command f and type *tagName that is highlighted*}
		
		WebElement W1 = driver.findElement(By.cssSelector("h2"));
		String S1 = W1.getText();
		System.out.println(S1);
		
		//finding element with class to find the "CONTACT US" text element 
		//{in DOM command f and type .*Valueofthatattribute*}
		WebElement W2 = driver.findElement(By.cssSelector(".section_header"));
		String S2 = W2.getText();
		System.out.println(S2);
		
		//finding element with id to validate that "CONTACT US" is displayed
		//{in DOM command f and type *[id]*}
		
		//there is no id in "CONTACT US"
		
		//this is for whole form
		WebElement W3 = driver.findElement(By.cssSelector("#contact_form"));
		boolean B1 = W3.isDisplayed();
		System.out.println(B1);
		
		//finding element by any attribute
		 //tagName[attribute= 'value'] 
		
		
	
		
		WebElement W4 = driver.findElement(By.cssSelector("h2[class=\"section_header\"]"));
		String S4 = W4.getText();
		System.out.println(S4);
		
		if(S4.equals("CONTACT US")) {
			System.out.println("Test case passed.");
		}
			else {
				System.out.println("Test case failed.");
			}
			
		
		
		
		
		

		
		
		

	}

}

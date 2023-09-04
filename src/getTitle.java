import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test Case passed.");
		}
		else {
			System.out.println("Test case failed.");
		}
		
		

	}

}
